package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.t0;
import com.google.android.gms.internal.vision.u0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u0<MessageType extends u0<MessageType, BuilderType>, BuilderType extends t0<MessageType, BuilderType>> implements u3 {
    protected int zza = 0;

    protected static <T> void a(Iterable<T> iterable, List<? super T> list) {
        p2.d(iterable);
        if (iterable instanceof f3) {
            List<?> listC = ((f3) iterable).c();
            f3 f3Var = (f3) list;
            int size = list.size();
            for (Object obj : listC) {
                if (obj == null) {
                    int size2 = f3Var.size() - size;
                    StringBuilder sb5 = new StringBuilder(37);
                    sb5.append("Element at index ");
                    sb5.append(size2);
                    sb5.append(" is null.");
                    String string = sb5.toString();
                    for (int size3 = f3Var.size() - 1; size3 >= size; size3--) {
                        f3Var.remove(size3);
                    }
                    throw new NullPointerException(string);
                }
                if (obj instanceof e1) {
                    f3Var.C3((e1) obj);
                } else {
                    f3Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof f4) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size4 = list.size();
        for (T t15 : iterable) {
            if (t15 == null) {
                int size5 = list.size() - size4;
                StringBuilder sb6 = new StringBuilder(37);
                sb6.append("Element at index ");
                sb6.append(size5);
                sb6.append(" is null.");
                String string2 = sb6.toString();
                for (int size6 = list.size() - 1; size6 >= size4; size6--) {
                    list.remove(size6);
                }
                throw new NullPointerException(string2);
            }
            list.add(t15);
        }
    }

    @Override // com.google.android.gms.internal.vision.u3
    public final e1 i() {
        try {
            n1 n1VarW = e1.w(q());
            g(n1VarW.b());
            return n1VarW.a();
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

    void j(int i15) {
        throw new UnsupportedOperationException();
    }

    public final byte[] k() {
        try {
            byte[] bArr = new byte[q()];
            t1 t1VarF = t1.f(bArr);
            g(t1VarF);
            t1VarF.N();
            return bArr;
        } catch (IOException e15) {
            String name = getClass().getName();
            StringBuilder sb5 = new StringBuilder(name.length() + 62 + "byte array".length());
            sb5.append("Serializing ");
            sb5.append(name);
            sb5.append(" to a ");
            sb5.append("byte array");
            sb5.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb5.toString(), e15);
        }
    }

    int l() {
        throw new UnsupportedOperationException();
    }
}
