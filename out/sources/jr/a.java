package jr;

import java.util.Random;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Ljr/a;", "Ljr/c;", "<init>", "()V", "", "bitCount", "b", "(I)I", "e", "()I", "until", "f", "", "c", "()D", "Ljava/util/Random;", "h", "()Ljava/util/Random;", "impl", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends c {
    @Override // jr.c
    public int b(int bitCount) {
        return d.f(h().nextInt(), bitCount);
    }

    @Override // jr.c
    public double c() {
        return h().nextDouble();
    }

    @Override // jr.c
    public int e() {
        return h().nextInt();
    }

    @Override // jr.c
    public int f(int until) {
        return h().nextInt(until);
    }

    public abstract Random h();
}
