package ii;

/* JADX INFO: loaded from: classes4.dex */
abstract class d2 extends h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l0.a f92396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l0.a f92397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l0.a f92398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l0.a f92399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l0.a f92400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l0.a f92401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l0.a f92402g;

    d2(l0.a aVar, l0.a aVar2, l0.a aVar3, l0.a aVar4, l0.a aVar5, l0.a aVar6, l0.a aVar7) {
        if (aVar == null) {
            throw new NullPointerException("Null freeParkingLot");
        }
        this.f92396a = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null paidParkingLot");
        }
        this.f92397b = aVar2;
        if (aVar3 == null) {
            throw new NullPointerException("Null freeStreetParking");
        }
        this.f92398c = aVar3;
        if (aVar4 == null) {
            throw new NullPointerException("Null paidStreetParking");
        }
        this.f92399d = aVar4;
        if (aVar5 == null) {
            throw new NullPointerException("Null valetParking");
        }
        this.f92400e = aVar5;
        if (aVar6 == null) {
            throw new NullPointerException("Null freeGarageParking");
        }
        this.f92401f = aVar6;
        if (aVar7 == null) {
            throw new NullPointerException("Null paidGarageParking");
        }
        this.f92402g = aVar7;
    }

    @Override // ii.h0
    public final l0.a b() {
        return this.f92401f;
    }

    @Override // ii.h0
    public final l0.a c() {
        return this.f92396a;
    }

    @Override // ii.h0
    public final l0.a d() {
        return this.f92398c;
    }

    @Override // ii.h0
    public final l0.a e() {
        return this.f92402g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            if (this.f92396a.equals(h0Var.c()) && this.f92397b.equals(h0Var.f()) && this.f92398c.equals(h0Var.d()) && this.f92399d.equals(h0Var.g()) && this.f92400e.equals(h0Var.h()) && this.f92401f.equals(h0Var.b()) && this.f92402g.equals(h0Var.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // ii.h0
    public final l0.a f() {
        return this.f92397b;
    }

    @Override // ii.h0
    public final l0.a g() {
        return this.f92399d;
    }

    @Override // ii.h0
    public final l0.a h() {
        return this.f92400e;
    }

    public final int hashCode() {
        return ((((((((((((this.f92396a.hashCode() ^ 1000003) * 1000003) ^ this.f92397b.hashCode()) * 1000003) ^ this.f92398c.hashCode()) * 1000003) ^ this.f92399d.hashCode()) * 1000003) ^ this.f92400e.hashCode()) * 1000003) ^ this.f92401f.hashCode()) * 1000003) ^ this.f92402g.hashCode();
    }

    public final String toString() {
        String string = this.f92396a.toString();
        int length = string.length();
        String string2 = this.f92397b.toString();
        int length2 = string2.length();
        String string3 = this.f92398c.toString();
        int length3 = string3.length();
        String string4 = this.f92399d.toString();
        int length4 = string4.length();
        String string5 = this.f92400e.toString();
        int length5 = string5.length();
        String string6 = this.f92401f.toString();
        int length6 = string6.length();
        String string7 = this.f92402g.toString();
        StringBuilder sb5 = new StringBuilder(length + 47 + length2 + 20 + length3 + 20 + length4 + 15 + length5 + 20 + length6 + 20 + string7.length() + 1);
        sb5.append("ParkingOptions{freeParkingLot=");
        sb5.append(string);
        sb5.append(", paidParkingLot=");
        sb5.append(string2);
        sb5.append(", freeStreetParking=");
        sb5.append(string3);
        sb5.append(", paidStreetParking=");
        sb5.append(string4);
        sb5.append(", valetParking=");
        sb5.append(string5);
        sb5.append(", freeGarageParking=");
        sb5.append(string6);
        sb5.append(", paidGarageParking=");
        sb5.append(string7);
        sb5.append("}");
        return sb5.toString();
    }
}
