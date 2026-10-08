package pr;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lpr/y2;", "Lmr/e;", "Lpr/b1;", "Lzs/c;", "fqName", "<init>", "(Lorg/jetbrains/kotlin/name/FqName;)V", "a", "Lzs/c;", "getFqName", "()Lorg/jetbrains/kotlin/name/FqName;", "Lvr/h;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassifierDescriptor;", "descriptor", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y2 implements mr.e, b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final zs.c fqName;

    public y2(zs.c cVar) {
        this.fqName = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final zs.c getFqName() {
        return this.fqName;
    }

    @Override // pr.b1
    public vr.h getDescriptor() {
        throw new IllegalStateException(("Cannot load descriptor of a type alias: " + this.fqName).toString());
    }
}
