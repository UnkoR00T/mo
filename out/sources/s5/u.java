package s5;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f177973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f177974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence[] f177975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f177976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f177977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Bundle f177978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set<String> f177979g;

    static class a {
        public static RemoteInput a(u uVar) {
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(uVar.i()).setLabel(uVar.h()).setChoices(uVar.e()).setAllowFreeFormInput(uVar.c()).addExtras(uVar.g());
            Set<String> setD = uVar.d();
            if (setD != null) {
                Iterator<String> it = setD.iterator();
                while (it.hasNext()) {
                    b.a(builderAddExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.a(builderAddExtras, uVar.f());
            }
            return builderAddExtras.build();
        }
    }

    static class b {
        static RemoteInput.Builder a(RemoteInput.Builder builder, String str, boolean z15) {
            return builder.setAllowDataType(str, z15);
        }
    }

    static class c {
        static RemoteInput.Builder a(RemoteInput.Builder builder, int i15) {
            return builder.setEditChoicesBeforeSending(i15);
        }
    }

    static RemoteInput a(u uVar) {
        return a.a(uVar);
    }

    static RemoteInput[] b(u[] uVarArr) {
        if (uVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[uVarArr.length];
        for (int i15 = 0; i15 < uVarArr.length; i15++) {
            remoteInputArr[i15] = a(uVarArr[i15]);
        }
        return remoteInputArr;
    }

    public boolean c() {
        return this.f177976d;
    }

    public Set<String> d() {
        return this.f177979g;
    }

    public CharSequence[] e() {
        return this.f177975c;
    }

    public int f() {
        return this.f177977e;
    }

    public Bundle g() {
        return this.f177978f;
    }

    public CharSequence h() {
        return this.f177974b;
    }

    public String i() {
        return this.f177973a;
    }

    public boolean j() {
        if (c()) {
            return false;
        }
        return ((e() != null && e().length != 0) || d() == null || d().isEmpty()) ? false : true;
    }
}
