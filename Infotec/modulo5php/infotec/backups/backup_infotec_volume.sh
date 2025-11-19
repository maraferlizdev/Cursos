#!/bin/bash

# Nombre del volumen
VOLUME_NAME="infotec_mariadb_data"

# Ruta donde se guardará el respaldo
BACKUP_DIR="/Users/dsi/Documents/Cursos/Infotec/modulo5php/infotec/backups"

# Nombre del archivo con fecha
BACKUP_FILE="infotec_mariadb_data_backup_$(date +%Y-%m-%d_%H-%M-%S).tar.gz"

echo "🔍 Verificando carpeta de respaldo..."
mkdir -p "$BACKUP_DIR"

echo "🛑 Deteniendo contenedor de MariaDB (si está corriendo)..."
docker stop infotec_mariadb 2>/dev/null

echo "📦 Creando respaldo del volumen $VOLUME_NAME ..."
docker run --rm \
  -v $VOLUME_NAME:/data \
  -v $BACKUP_DIR:/backup \
  alpine tar czvf /backup/$BACKUP_FILE -C /data .

echo "▶️ Iniciando nuevamente el contenedor MariaDB..."
docker start infotec_mariadb 2>/dev/null

echo "✅ Respaldo completado:"
echo "$BACKUP_DIR/$BACKUP_FILE"
