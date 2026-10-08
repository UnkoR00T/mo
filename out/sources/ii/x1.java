package ii;

/* JADX INFO: loaded from: classes4.dex */
abstract class x1 extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l0.a f92844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l0.a f92845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l0.a f92846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l0.a f92847d;

    x1(l0.a aVar, l0.a aVar2, l0.a aVar3, l0.a aVar4) {
        if (aVar == null) {
            throw new NullPointerException("Null wheelchairAccessibleParking");
        }
        this.f92844a = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null wheelchairAccessibleEntrance");
        }
        this.f92845b = aVar2;
        if (aVar3 == null) {
            throw new NullPointerException("Null wheelchairAccessibleRestroom");
        }
        this.f92846c = aVar3;
        if (aVar4 == null) {
            throw new NullPointerException("Null wheelchairAccessibleSeating");
        }
        this.f92847d = aVar4;
    }

    @Override // ii.a
    public final l0.a b() {
        return this.f92845b;
    }

    @Override // ii.a
    public final l0.a c() {
        return this.f92844a;
    }

    @Override // ii.a
    public final l0.a d() {
        return this.f92846c;
    }

    @Override // ii.a
    public final l0.a e() {
        return this.f92847d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f92844a.equals(aVar.c()) && this.f92845b.equals(aVar.b()) && this.f92846c.equals(aVar.d()) && this.f92847d.equals(aVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f92844a.hashCode() ^ 1000003) * 1000003) ^ this.f92845b.hashCode()) * 1000003) ^ this.f92846c.hashCode()) * 1000003) ^ this.f92847d.hashCode();
    }

    public final String toString() {
        String string = this.f92844a.toString();
        int length = string.length();
        String string2 = this.f92845b.toString();
        int length2 = string2.length();
        String string3 = this.f92846c.toString();
        int length3 = string3.length();
        String string4 = this.f92847d.toString();
        StringBuilder sb5 = new StringBuilder(length + 80 + length2 + 31 + length3 + 30 + string4.length() + 1);
        sb5.append("AccessibilityOptions{wheelchairAccessibleParking=");
        sb5.append(string);
        sb5.append(", wheelchairAccessibleEntrance=");
        sb5.append(string2);
        sb5.append(", wheelchairAccessibleRestroom=");
        sb5.append(string3);
        sb5.append(", wheelchairAccessibleSeating=");
        sb5.append(string4);
        sb5.append("}");
        return sb5.toString();
    }
}
