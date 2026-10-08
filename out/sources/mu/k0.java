package mu;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lmu/k0;", "T", "", "Lmu/g;", "upstream", "", "extraBufferCapacity", "Llu/a;", "onBufferOverflow", "Ltq/i;", "context", "<init>", "(Lmu/g;ILlu/a;Ltq/i;)V", "a", "Lmu/g;", "b", "I", "c", "Llu/a;", "d", "Ltq/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final g<T> upstream;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int extraBufferCapacity;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final lu.a onBufferOverflow;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final tq.i context;

    /* JADX WARN: Multi-variable type inference failed */
    public k0(g<? extends T> gVar, int i15, lu.a aVar, tq.i iVar) {
        this.upstream = gVar;
        this.extraBufferCapacity = i15;
        this.onBufferOverflow = aVar;
        this.context = iVar;
    }
}
