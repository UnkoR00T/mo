package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.ex;
import com.google.android.libraries.places.internal.fx;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fx<MessageType extends fx<MessageType, BuilderType>, BuilderType extends ex<MessageType, BuilderType>> implements g00 {
    protected transient int zza = 0;

    protected static void f(Iterable iterable, List list) {
        ex.q(iterable, list);
    }

    @Override // com.google.android.libraries.places.internal.g00
    public final void b(OutputStream outputStream) {
        int iJ = j();
        int i15 = dy.f32108c;
        if (iJ > 4096) {
            iJ = 4096;
        }
        cy cyVar = new cy(outputStream, iJ);
        e(cyVar);
        cyVar.D();
    }

    int d(v00 v00Var) {
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.g00
    public final byte[] i() {
        try {
            int iJ = j();
            byte[] bArr = new byte[iJ];
            int i15 = dy.f32108c;
            zx zxVar = new zx(bArr, 0, iJ);
            e(zxVar);
            zxVar.g();
            return bArr;
        } catch (IOException e15) {
            String name = getClass().getName();
            StringBuilder sb5 = new StringBuilder(name.length() + 72);
            sb5.append("Serializing ");
            sb5.append(name);
            sb5.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb5.toString(), e15);
        }
    }
}
