package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.q;
import com.google.android.gms.internal.clearcut.r;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q<MessageType extends q<MessageType, BuilderType>, BuilderType extends r<MessageType, BuilderType>> implements l2 {
    private static boolean zzey = false;
    protected int zzex = 0;

    void a(int i15) {
        throw new UnsupportedOperationException();
    }

    int d() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.clearcut.l2
    public final a0 e() {
        try {
            f0 f0VarT = a0.t(l());
            i(f0VarT.b());
            return f0VarT.a();
        } catch (IOException e15) {
            String name = getClass().getName();
            StringBuilder sb5 = new StringBuilder(name.length() + 62 + "ByteString".length());
            sb5.append("Serializing ");
            sb5.append(name);
            sb5.append(" to a ");
            sb5.append("ByteString");
            sb5.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb5.toString(), e15);
        }
    }
}
