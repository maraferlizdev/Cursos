<?php

namespace App\Http\Controllers;

use App\Models\Ponentes;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Validator;

class PonentesController extends Controller
{
    public function index()
    {
        $ponentes = Ponentes::all();

        return response()->json([
            'ponentes' => $ponentes,
            'status' => 200,
        ], 200);
    }

    public function store(Request $request)
    {
        $validator = Validator::make($request->all(), [
            'nombre'       => 'required|string',
            'biografia'    => 'required|string',
            'espacialidad' => 'required|string', // usa el nombre tal como está en el modelo
        ]);

        if ($validator->fails()) {
            return response()->json([
                'message' => 'Datos faltantes o inválidos',
                'errors'  => $validator->errors(),
                'status'  => 400,
            ], 400);
        }

        $ponente = Ponentes::create($validator->validated());

        return response()->json([
            'ponente' => $ponente,
            'status'  => 201,
        ], 201);
    }

    public function show($id)
    {
        $ponente = Ponentes::find($id);

        if (!$ponente) {
            return response()->json([
                'message' => 'Ponente no encontrado',
                'status'  => 404,
            ], 404);
        }

        return response()->json([
            'ponente' => $ponente,
            'status'  => 200,
        ], 200);
    }

    public function update(Request $request, $id)
    {
        $ponente = Ponentes::find($id);

        if (!$ponente) {
            return response()->json([
                'message' => 'Ponente no encontrado',
                'status'  => 404,
            ], 404);
        }

        $validator = Validator::make($request->all(), [
            'nombre'       => 'sometimes|required|string',
            'biografia'    => 'sometimes|required|string',
            'espacialidad' => 'sometimes|required|string',
        ]);

        if ($validator->fails()) {
            return response()->json([
                'message' => 'Datos inválidos',
                'errors'  => $validator->errors(),
                'status'  => 400,
            ], 400);
        }

        $ponente->update($validator->validated());

        return response()->json([
            'ponente' => $ponente,
            'status'  => 200,
        ], 200);
    }

    public function destroy($id)
    {
        $ponente = Ponentes::find($id);

        if (!$ponente) {
            return response()->json([
                'message' => 'Ponente no encontrado',
                'status'  => 404,
            ], 404);
        }

        $ponente->delete();

        return response()->json([
            'message' => 'Ponente eliminado',
            'status'  => 200,
        ], 200);
    }
}
