package i60;

import android.content.Context;
import android.opengl.GLES20;
import x20.c;
import x20.n;

/* JADX INFO: loaded from: classes5.dex */
public class a extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final EnumC2127a f89699d;

    /* JADX INFO: renamed from: i60.a$a, reason: collision with other inner class name */
    public enum EnumC2127a {
        IDENTITY_DYNAMIC_LAYER(33984, "u_IdentityDynamicLayer");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f89702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f89703b;

        EnumC2127a(int i15, String str) {
            this.f89702a = i15;
            this.f89703b = str;
        }
    }

    a(Context context, EnumC2127a enumC2127a, int i15) {
        super(context, i15);
        this.f89699d = enumC2127a;
    }

    public void b(n nVar) {
        GLES20.glActiveTexture(this.f89699d.f89702a);
        GLES20.glBindTexture(3553, this.f216516c[0]);
        GLES20.glUniform1i(nVar.f(this.f89699d.f89703b), this.f89699d.ordinal());
    }
}
