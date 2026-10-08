package mk;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import fk.q;
import java.io.IOException;
import sk.c0;
import sk.t;
import tk.k;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences.Editor f126958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f126959b;

    public d(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.f126959b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f126958a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.f126958a = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    @Override // fk.q
    public void a(t tVar) throws IOException {
        if (!this.f126958a.putString(this.f126959b, k.b(tVar.toByteArray())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // fk.q
    public void b(c0 c0Var) throws IOException {
        if (!this.f126958a.putString(this.f126959b, k.b(c0Var.toByteArray())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
