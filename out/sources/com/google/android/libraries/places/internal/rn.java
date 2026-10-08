package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class rn {
    public static m40 a(final hr0 hr0Var) {
        return new qn(new hr0() { // from class: com.google.android.libraries.places.internal.pn
            @Override // com.google.android.libraries.places.internal.hr0
            public final /* synthetic */ Object zzb() {
                return ak.n0.E(((yv0) hr0Var).zzb());
            }
        }, 2, g00.class, g00.class);
    }

    static /* synthetic */ void b(f80 f80Var, Class cls, boolean z15) throws m90 {
        Class clsA;
        boolean z16;
        try {
            clsA = ((e80) (z15 ? f80Var.f() : f80Var.g())).a();
            z16 = false;
        } catch (ClassCastException unused) {
            clsA = Object.class;
            z16 = true;
        }
        if (cls.isAssignableFrom(clsA)) {
            return;
        }
        String str = true != z15 ? "response" : "request";
        l90 l90Var = l90.f32814l;
        String strB = f80Var.b();
        String name = clsA.getName();
        String str2 = true != z16 ? "" : ", assumed because method doesn't use ReflectableMarshaller";
        String string = cls.toString();
        StringBuilder sb5 = new StringBuilder(str.length() + 52 + String.valueOf(strB).length() + 2 + name.length() + str2.length() + 24 + string.length());
        sb5.append("AsyncClientInterceptor: The ");
        sb5.append(str);
        sb5.append(" message type of method ");
        sb5.append(strB);
        sb5.append(" (");
        sb5.append(name);
        sb5.append(str2);
        sb5.append(") must be a subclass of ");
        sb5.append(string);
        throw new m90(l90Var.e(sb5.toString()), null);
    }
}
