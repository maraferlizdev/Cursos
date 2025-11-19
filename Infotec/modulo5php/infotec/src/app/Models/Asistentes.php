<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;

class Asistentes extends Model
{
    protected $table = 'asistentes';
    protected $fillable = [
        'id',
        'nombre',
        'mail',
        'telefono',
        'evento_id'
    ];
}