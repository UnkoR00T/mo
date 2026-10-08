package io;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f93600a;

    public a(String str) {
        Objects.requireNonNull(str);
        this.f93600a = str;
    }

    public static a d(byte[] bArr) {
        return new a(b.g(bArr, false));
    }

    public static a e(String str) {
        if (str == null) {
            return null;
        }
        return new a(str);
    }

    public byte[] a() {
        return b.c(this.f93600a);
    }

    public BigInteger b() {
        return new BigInteger(1, a());
    }

    public String c() {
        return new String(a(), m.f93605a);
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && toString().equals(obj.toString());
    }

    public int hashCode() {
        return this.f93600a.hashCode();
    }

    public String toString() {
        return this.f93600a;
    }
}
