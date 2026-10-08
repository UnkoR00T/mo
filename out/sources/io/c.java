package io;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public class c extends a {
    public c(String str) {
        super(str);
    }

    public static c f(String str) {
        return h(str.getBytes(m.f93605a));
    }

    public static c g(BigInteger bigInteger) {
        return h(d.a(bigInteger));
    }

    public static c h(byte[] bArr) {
        return new c(b.g(bArr, true));
    }

    public static c i(String str) {
        if (str == null) {
            return null;
        }
        return new c(str);
    }

    @Override // io.a
    public boolean equals(Object obj) {
        return (obj instanceof c) && toString().equals(obj.toString());
    }
}
