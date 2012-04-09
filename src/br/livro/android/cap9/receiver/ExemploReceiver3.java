package br.livro.android.cap9.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import br.livro.android.cap9.activity.TelaTeste;

/**
 * Simples BroadcastReceiver registrado no xml
 * 
 * Demonstra como utilizar uma intent coma a flag FLAG_ACTIVITY_NEW_TASK para abrir uma Activity
 * 
 * @author ricardo
 *
 */
public class ExemploReceiver3 extends BroadcastReceiver {
	@Override
	public void onReceive(Context context, Intent intent) {

		Intent it = new Intent(context, TelaTeste.class);
		it.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		context.startActivity(it);
	}
}