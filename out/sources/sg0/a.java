package sg0;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import dx.i;
import dx.j;
import ex.d;
import iy.a0;
import iy.c0;
import java.util.concurrent.CancellationException;
import oq.p;
import oq.r;
import oq.y;
import p071kotlin.Metadata;
import pg0.EncryptedUserKeyData;
import px.f;
import qy.b;
import t10.k;
import tq.e;
import xw.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0016H\u0097@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001e¨\u0006 "}, d2 = {"Lsg0/a;", "Lvg0/a;", "Lt10/k;", "sharedPreferencesFactory", "Liy/a;", "base64Coder", "<init>", "(Lt10/k;Liy/a;)V", "", "c", "()Z", "Loq/i0;", "d", "()V", "Lpg0/b;", "userKeyData", "f", "(Lpg0/b;)V", "Ldx/i;", "Ldx/b;", "e", "()Ldx/i;", "Lqy/b;", "a", "(Ltq/e;)Ljava/lang/Object;", "wrappedMasterKey", "b", "(Liy/a0;Ltq/e;)Ljava/lang/Object;", "Liy/a;", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "sharedPreferences", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements vg0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences sharedPreferences;

    public a(k kVar, iy.a aVar) {
        this.base64Coder = aVar;
        this.sharedPreferences = k.b(kVar, "mjunior_shared_prefs", null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    @Override // vg0.a
    public Object a(e<? super b> eVar) {
        a0 a0VarA;
        String string = this.sharedPreferences.getString("BIOMETRIC_WRAPPED_MASTER_KEY", null);
        if (string == null) {
            a0VarA = a0.INSTANCE.a();
        } else {
            byte[] bArr = (byte[]) iy.a.c(this.base64Coder, string, null, 2, null).a();
            a0VarA = bArr != null ? c0.f(bArr) : null;
            if (a0VarA == null) {
                a0VarA = a0.INSTANCE.a();
            }
        }
        return b.b(a0VarA);
    }

    @Override // vg0.a
    @SuppressLint({"ApplySharedPref"})
    public Object b(a0 a0Var, e<? super Boolean> eVar) {
        return vq.b.a(this.sharedPreferences.edit().putString("BIOMETRIC_WRAPPED_MASTER_KEY", iy.a.e(this.base64Coder, a0Var.getData(), null, 2, null)).commit());
    }

    @Override // vg0.a
    public boolean c() {
        return (this.sharedPreferences.getString("KEY", null) == null || this.sharedPreferences.getString("KEY_PARAMS", null) == null) ? false : true;
    }

    @Override // vg0.a
    @SuppressLint({"ApplySharedPref"})
    public void d() {
        this.sharedPreferences.edit().remove("KEY_PARAMS").commit();
        this.sharedPreferences.edit().remove("KEY").commit();
        this.sharedPreferences.edit().remove("BIOMETRIC_WRAPPED_MASTER_KEY").commit();
    }

    @Override // vg0.a
    public i<dx.b, EncryptedUserKeyData> e() {
        Object objB;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    EncryptedUserKeyData encryptedUserKeyData = null;
                    r rVarA = y.a(this.sharedPreferences.getString("KEY", null), this.sharedPreferences.getString("KEY_PARAMS", null));
                    String str = (String) rVarA.a();
                    String str2 = (String) rVarA.b();
                    if (str == null || str2 == null) {
                        rVarA = null;
                    }
                    if (rVarA != null) {
                        encryptedUserKeyData = new EncryptedUserKeyData(c0.f((byte[]) aVar.a(iy.a.c(this.base64Coder, (String) rVarA.a(), null, 2, null))), c0.f((byte[]) aVar.a(iy.a.c(this.base64Coder, (String) rVarA.b(), null, 2, null))));
                    }
                    return new i.Right(encryptedUserKeyData);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    @Override // vg0.a
    @SuppressLint({"ApplySharedPref"})
    public void f(EncryptedUserKeyData userKeyData) {
        this.sharedPreferences.edit().putString("KEY", iy.a.e(this.base64Coder, userKeyData.getEncryptedMasterKey().getData(), null, 2, null)).putString("KEY_PARAMS", iy.a.e(this.base64Coder, userKeyData.getKeyParams().getData(), null, 2, null)).commit();
    }
}
