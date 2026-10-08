package ii;

import java.time.Duration;

/* JADX INFO: loaded from: classes4.dex */
abstract class q1 extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Duration f92716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f92717b;

    q1(Duration duration, int i15) {
        if (duration == null) {
            throw new NullPointerException("Null duration");
        }
        this.f92716a = duration;
        this.f92717b = i15;
    }

    @Override // ii.z
    public final int a() {
        return this.f92717b;
    }

    @Override // ii.z
    public final Duration b() {
        return this.f92716a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f92716a.equals(zVar.b()) && this.f92717b == zVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f92716a.hashCode() ^ 1000003) * 1000003) ^ this.f92717b;
    }

    public final String toString() {
        String string = this.f92716a.toString();
        int length = string.length();
        int i15 = this.f92717b;
        StringBuilder sb5 = new StringBuilder(length + 30 + String.valueOf(i15).length() + 1);
        sb5.append("Leg{duration=");
        sb5.append(string);
        sb5.append(", distanceMeters=");
        sb5.append(i15);
        sb5.append("}");
        return sb5.toString();
    }
}
