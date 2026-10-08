package u0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\b*\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lu0/n1;", "T", "Lu0/f0;", "", "delay", "<init>", "(I)V", "Lu0/t;", "V", "Lu0/y2;", "converter", "Lu0/w3;", "a", "(Lu0/y2;)Lu0/w3;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "f", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n1<T> implements f0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int delay;

    public n1() {
        this(0, 1, null);
    }

    public boolean equals(Object other) {
        return (other instanceof n1) && ((n1) other).delay == this.delay;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getDelay() {
        return this.delay;
    }

    public int hashCode() {
        return this.delay;
    }

    public n1(int i15) {
        this.delay = i15;
    }

    @Override // u0.j0, u0.l
    public <V extends t> w3<V> a(y2<T, V> converter) {
        return new d4(this.delay);
    }

    public /* synthetic */ n1(int i15, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? 0 : i15);
    }
}
