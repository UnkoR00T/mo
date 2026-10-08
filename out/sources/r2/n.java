package r2;

import java.util.Arrays;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R*\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017¨\u0006\u001f"}, d2 = {"Lr2/n;", "", "", "source", "destination", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;)V", "Loq/i0;", "b", "()V", "", "destinationOffset", "startIndex", "endIndex", "c", "(III)V", "a", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "getSource", "getDestination", "setDestination", "([Ljava/lang/Object;)V", "I", "pendingMoveOffset", "d", "pendingMoveStart", "e", "pendingMoveEnd", "f", "highest", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object[] source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Object[] destination;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int pendingMoveOffset = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int pendingMoveStart = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int pendingMoveEnd = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int highest = -1;

    public n(Object[] objArr, Object[] objArr2) {
        this.source = objArr;
        this.destination = objArr2;
    }

    private final void b() {
        int i15 = this.pendingMoveOffset;
        if (i15 >= 0) {
            Object[] objArr = this.source;
            pq.n.n(objArr, this.destination, i15, this.pendingMoveStart, this.pendingMoveEnd);
            if (objArr == this.destination) {
                pq.n.z(objArr, p.f170802a, this.pendingMoveStart, this.pendingMoveEnd);
            }
            int i16 = this.pendingMoveOffset + (this.pendingMoveEnd - this.pendingMoveStart);
            this.pendingMoveOffset = -1;
            this.pendingMoveEnd = -1;
            if (i16 > this.highest) {
                this.highest = i16;
            }
        }
    }

    public final Object[] a() {
        b();
        int i15 = this.highest;
        if (i15 >= 0) {
            Object[] objArr = this.destination;
            if (i15 < objArr.length) {
                int length = objArr.length;
                if (length == i15 + 1) {
                    objArr[i15] = p.f170802a;
                } else {
                    pq.n.z(objArr, p.f170802a, i15, length);
                }
            }
        }
        return this.destination;
    }

    public final void c(int destinationOffset, int startIndex, int endIndex) {
        Object[] objArr = this.source;
        Object[] objArr2 = this.destination;
        if (objArr == objArr2) {
            if (startIndex == destinationOffset) {
                return;
            }
            int i15 = (endIndex - startIndex) + destinationOffset + destinationOffset;
            if (i15 >= objArr2.length) {
                Object[] objArr3 = this.source;
                this.destination = Arrays.copyOf(objArr3, objArr3.length);
                break;
            }
            for (int i16 = destinationOffset; i16 < i15; i16++) {
                if (objArr2[i16] != p.f170802a) {
                    Object[] objArr4 = this.source;
                    this.destination = Arrays.copyOf(objArr4, objArr4.length);
                    break;
                }
            }
        }
        if (this.pendingMoveEnd == startIndex) {
            this.pendingMoveEnd = endIndex;
            return;
        }
        b();
        this.pendingMoveOffset = destinationOffset;
        this.pendingMoveStart = startIndex;
        this.pendingMoveEnd = endIndex;
    }
}
