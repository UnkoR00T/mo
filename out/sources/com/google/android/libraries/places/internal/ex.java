package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.ex;
import com.google.android.libraries.places.internal.fx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ex<MessageType extends fx<MessageType, BuilderType>, BuilderType extends ex<MessageType, BuilderType>> implements f00 {
    private static void o(List list, int i15) {
        int size = list.size() - i15;
        StringBuilder sb5 = new StringBuilder(String.valueOf(size).length() + 26);
        sb5.append("Element at index ");
        sb5.append(size);
        sb5.append(" is null.");
        String string = sb5.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i15) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    protected static void q(Iterable iterable, List list) {
        iterable.getClass();
        if (!(iterable instanceof rz)) {
            if (iterable instanceof q00) {
                list.addAll((Collection) iterable);
                return;
            }
            if (iterable instanceof Collection) {
                int size = ((Collection) iterable).size();
                if (list instanceof ArrayList) {
                    ((ArrayList) list).ensureCapacity(list.size() + size);
                } else if (list instanceof s00) {
                    ((s00) list).h(list.size() + size);
                }
            }
            int size2 = list.size();
            if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
                for (Object obj : iterable) {
                    if (obj == null) {
                        o(list, size2);
                    }
                    list.add(obj);
                }
                return;
            }
            List list2 = (List) iterable;
            int size3 = list2.size();
            for (int i15 = 0; i15 < size3; i15++) {
                Object obj2 = list2.get(i15);
                if (obj2 == null) {
                    o(list, size2);
                }
                list.add(obj2);
            }
            return;
        }
        List listZza = ((rz) iterable).zza();
        rz rzVar = (rz) list;
        int size4 = list.size();
        for (Object obj3 : listZza) {
            if (obj3 == null) {
                int size5 = rzVar.size() - size4;
                StringBuilder sb5 = new StringBuilder(String.valueOf(size5).length() + 26);
                sb5.append("Element at index ");
                sb5.append(size5);
                sb5.append(" is null.");
                String string = sb5.toString();
                int size6 = rzVar.size();
                while (true) {
                    size6--;
                    if (size6 < size4) {
                        throw new NullPointerException(string);
                    }
                    rzVar.remove(size6);
                }
            } else if (obj3 instanceof tx) {
                rzVar.zzb();
            } else if (obj3 instanceof byte[]) {
                byte[] bArr = (byte[]) obj3;
                try {
                    tx.o(bArr, 0, bArr.length, false);
                    rzVar.zzb();
                } catch (lz e15) {
                    throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e15);
                }
            } else {
                rzVar.add((String) obj3);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.f00
    public final /* bridge */ /* synthetic */ f00 d1(g00 g00Var) {
        if (n().getClass().isInstance(g00Var)) {
            return p((fx) g00Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    protected abstract ex p(fx fxVar);
}
