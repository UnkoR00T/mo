package h9;

import java.util.Objects;
import t7.v;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f81943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f81944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f81945c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f81946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f81947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f81948c;

        private a(int i15, int i16, float f15) {
            this.f81946a = i15;
            this.f81947b = i16;
            this.f81948c = f15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a b(int i15) {
            int i16 = (i15 >> 13) & 7;
            if (i16 == 0) {
                return null;
            }
            return new a(i16, (i15 >> 10) & 7, ((i15 & 511) * ((i15 & 512) != 0 ? -1 : 1)) / 10.0f);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f81946a == aVar.f81946a && this.f81947b == aVar.f81947b && Float.compare(this.f81948c, aVar.f81948c) == 0;
        }

        public int hashCode() {
            return (((this.f81946a * 31) + this.f81947b) * 31) + Float.hashCode(this.f81948c);
        }

        public String toString() {
            return "GainField{name=" + this.f81946a + ", originator=" + this.f81947b + ", gain=" + this.f81948c + '}';
        }
    }

    private h(float f15, a aVar, a aVar2) {
        this.f81943a = f15;
        this.f81944b = aVar;
        this.f81945c = aVar2;
    }

    public static h d(float f15, int i15, int i16) {
        a aVarB = a.b(i15);
        a aVarB2 = a.b(i16);
        if (f15 <= 0.0f && aVarB == null && aVarB2 == null) {
            return null;
        }
        return new h(f15, aVarB, aVarB2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Float.compare(this.f81943a, hVar.f81943a) == 0 && Objects.equals(this.f81944b, hVar.f81944b) && Objects.equals(this.f81945c, hVar.f81945c);
    }

    public int hashCode() {
        int iHashCode = Float.hashCode(this.f81943a) * 31;
        a aVar = this.f81944b;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        a aVar2 = this.f81945c;
        return iHashCode2 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public String toString() {
        return "ReplayGain Xing/Info: peak=" + this.f81943a + ", field 1=" + this.f81944b + ", field 2=" + this.f81945c;
    }
}
