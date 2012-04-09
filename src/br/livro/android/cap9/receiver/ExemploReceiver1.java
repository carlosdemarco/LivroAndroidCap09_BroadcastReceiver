package br.livro.android.cap9.receiver;

import android.content.Context;
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.widget.Toast;

/**
 * Simples BroadcastReceiver registrado no xml
 * 
 * @author ricardo
 *
 */
public class ExemploReceiver1 extends BroadcastReceiver {
	@Override
	public void onReceive(Context c, Intent intent) {
		Toast.makeText(c, "ExemploReceiver1 1", Toast.LENGTH_SHORT).show();
	}
}
