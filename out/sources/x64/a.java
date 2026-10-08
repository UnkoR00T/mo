package x64;

import android.content.SharedPreferences;
import dx.b;
import dx.i;
import dx.j;
import iy.a0;
import iy.c0;
import java.util.concurrent.CancellationException;
import jx.d;
import oq.g;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import px.f;
import t10.k;
import xw.c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u001b\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010\u001f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%¨\u0006'"}, d2 = {"Lx64/a;", "La74/a;", "Lt10/k;", "sharedPreferencesFactory", "Liy/a;", "base64Coder", "Lwy/a;", "masterKeyProvider", "Ljx/d;", "deviceInfo", "<init>", "(Lt10/k;Liy/a;Lwy/a;Ljx/d;)V", "", "h", "()Z", "Lqy/b;", "wrappedMasterKey", "Lsy/a;", "encryptedPasswordData", "Ldx/i;", "Ldx/b;", "Loq/i0;", "g", "(Liy/a0;Liy/a0;)Ldx/i;", "f", "()Ldx/i;", "e", "i", "d", "()V", "b", "a", "Liy/a;", "Lwy/a;", "c", "Ljx/d;", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "sharedPreferences", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements a74.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wy.a masterKeyProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d deviceInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences sharedPreferences;

    public a(k kVar, iy.a aVar, wy.a aVar2, d dVar) {
        this.base64Coder = aVar;
        this.masterKeyProvider = aVar2;
        this.deviceInfo = dVar;
        this.sharedPreferences = k.b(kVar, "mob_user_shared_prefs", null, 2, null);
    }

    @Override // a74.a
    public void a() {
        this.masterKeyProvider.clear();
    }

    @Override // a74.a
    public boolean b() {
        return !this.masterKeyProvider.c().b(a0.INSTANCE.a());
    }

    @Override // a74.a
    public void d() {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.remove("KEY");
        editorEdit.remove("KEY_PARAMS");
        editorEdit.commit();
    }

    @Override // a74.a
    public i<b, qy.b> e() {
        Object objB;
        j<b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    String string = this.sharedPreferences.getString("KEY", null);
                    if (string != null) {
                        return new i.Right(qy.b.a(qy.b.b(c0.f((byte[]) aVar.a(iy.a.c(this.base64Coder, string, null, 2, null))))));
                    }
                    aVar.b(new b.Generic(new NullPointerException("There is no saved masterKey in prefs")));
                    throw new g();
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((b) ex.d.a(e16));
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
                objB = new b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    @Override // a74.a
    public i<b, i0> f() {
        Object objB;
        j<b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
                    editorEdit.putString("DEVICE_NAME", this.deviceInfo.c());
                    editorEdit.commit();
                    return new i.Right(i0.f148189a);
                } catch (Exception e15) {
                    f fVar = f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    @Override // a74.a
    public i<b, i0> g(a0 wrappedMasterKey, a0 encryptedPasswordData) {
        Object objB;
        j<b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
                    editorEdit.putString("KEY", iy.a.e(this.base64Coder, wrappedMasterKey.getData(), null, 2, null));
                    editorEdit.putString("KEY_PARAMS", iy.a.e(this.base64Coder, encryptedPasswordData.getData(), null, 2, null));
                    editorEdit.commit();
                    return new i.Right(i0.f148189a);
                } catch (Exception e15) {
                    f fVar = f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    @Override // a74.a
    public boolean h() {
        return (this.sharedPreferences.getString("KEY", null) == null || this.sharedPreferences.getString("KEY_PARAMS", null) == null) ? false : true;
    }

    @Override // a74.a
    public i<b, sy.a> i() {
        Object objB;
        j<b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    String string = this.sharedPreferences.getString("KEY_PARAMS", null);
                    if (string != null) {
                        return new i.Right(sy.a.a(sy.a.b(c0.f((byte[]) aVar.a(iy.a.c(this.base64Coder, string, null, 2, null))))));
                    }
                    aVar.b(new b.Generic(new NullPointerException("There is no saved passKeyParams in prefs")));
                    throw new g();
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((b) ex.d.a(e16));
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
                objB = new b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }
}
