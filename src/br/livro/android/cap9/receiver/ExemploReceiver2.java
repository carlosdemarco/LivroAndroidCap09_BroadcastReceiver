package br.livro.android.cap9.receiver;

import android.content.Context;
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.widget.Toast;

/**
 * BroadcastReceiver registrado pela API
 * 
 * Ver método onCreate do MenuBroadcastReceiver
 * 
 * registerReceiver(new BroadcastReceiver2(), new IntentFilter("ABRIR_RECEIVER_2"));
 * 
 * @author ricardo
 *
 */
public class ExemploReceiver2 extends BroadcastReceiver {
	@Override
	public void onReceive(Context c, Intent intent) {
		Toast.makeText(c, "BroadcastReceiver 2 configurado na API !", Toast.LENGTH_SHORT).show();
	}
}
