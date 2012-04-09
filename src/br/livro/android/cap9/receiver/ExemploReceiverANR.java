package br.livro.android.cap9.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Simples BroadcastReceiver registrado no xml
 * 
 * Demonstra como utilizar uma intent coma a flag FLAG_ACTIVITY_NEW_TASK para abrir uma Activity
 * 
 * @author ricardo
 *
 */
public class ExemploReceiverANR extends BroadcastReceiver {
	private static final String CATEGORIA = "livro";
	
	@Override
	public void onReceive(Context context, Intent intent) {
		try {
			Log.i(CATEGORIA, "Teste ANR sleep ...");
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}