package bs;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends h implements qs.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Annotation f21247c;

    public i(zs.f fVar, Annotation annotation) {
        super(fVar, null);
        this.f21247c = annotation;
    }

    @Override // qs.c
    public qs.a a() {
        return new g(this.f21247c);
    }
}
