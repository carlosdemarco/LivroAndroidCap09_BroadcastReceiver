package br.livro.android.cap9.boot;

import android.content.Context;
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.util.Log;

/**
 * BroadcastReceiver que executa quando o SO termina de iniciar
 * 
 * Inicia o serviço em segundo plano para fazer o download da imagem
 * 
 * @author ricardo
 * 
 */
public class ExemploBoot extends BroadcastReceiver {
	private static final String CATEGORIA = "livro";
	
	@Override
	public void onReceive(Context context, Intent intent) {
		Log.i(CATEGORIA, "O sistema operacional foi iniciado com sucesso.");
	}
}
