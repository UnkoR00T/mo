package v;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class l extends x1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f202658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f202659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<x1.a> f202660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<x1.c> f202661d;

    l(int i15, int i16, List<x1.a> list, List<x1.c> list2) {
        this.f202658a = i15;
        this.f202659b = i16;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f202660c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f202661d = list2;
    }

    @Override // v.x1
    public int a() {
        return this.f202658a;
    }

    @Override // v.x1
    public List<x1.c> b() {
        return this.f202661d;
    }

    @Override // v.x1
    public int e() {
        return this.f202659b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1.b) {
            x1.b bVar = (x1.b) obj;
            if (this.f202658a == bVar.a() && this.f202659b == bVar.e() && this.f202660c.equals(bVar.f()) && this.f202661d.equals(bVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // v.x1
    public List<x1.a> f() {
        return this.f202660c;
    }

    public int hashCode() {
        return ((((((this.f202658a ^ 1000003) * 1000003) ^ this.f202659b) * 1000003) ^ this.f202660c.hashCode()) * 1000003) ^ this.f202661d.hashCode();
    }

    public String toString() {
        return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.f202658a + ", recommendedFileFormat=" + this.f202659b + ", audioProfiles=" + this.f202660c + ", videoProfiles=" + this.f202661d + "}";
    }
}
