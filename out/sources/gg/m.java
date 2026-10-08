package gg;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes3.dex */
public class m extends androidx.fragment.app.n {
    private Dialog V0;
    private DialogInterface.OnCancelListener W0;
    private Dialog X0;

    public static m h2(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        m mVar = new m();
        Dialog dialog2 = (Dialog) jg.s.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        mVar.V0 = dialog2;
        if (onCancelListener != null) {
            mVar.W0 = onCancelListener;
        }
        return mVar;
    }

    @Override // androidx.fragment.app.n
    public Dialog Z1(Bundle bundle) {
        Dialog dialog = this.V0;
        if (dialog != null) {
            return dialog;
        }
        e2(false);
        if (this.X0 == null) {
            this.X0 = new AlertDialog.Builder((Context) jg.s.l(z())).create();
        }
        return this.X0;
    }

    @Override // androidx.fragment.app.n
    public void g2(FragmentManager fragmentManager, String str) {
        super.g2(fragmentManager, str);
    }

    @Override // androidx.fragment.app.n, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.W0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
