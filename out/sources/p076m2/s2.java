package p076m2;

import java.util.List;
import oq.r;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001Bo\b\u0000\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001a\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u0017\u0010'R6\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f0\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b!\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010-\u001a\u0004\b%\u0010.R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b(\u0010*¨\u0006/"}, d2 = {"Lm2/s2;", "", "Lm2/o2;", "content", "parameter", "Lm2/l0;", "composition", "Lm2/i5;", "slotStorage", "Lm2/b;", "anchor", "", "Loq/r;", "Lm2/f4;", "invalidations", "Lm2/v3;", "locals", "nestedReferences", "<init>", "(Lm2/o2;Ljava/lang/Object;Lm2/l0;Lm2/i5;Lm2/b;Ljava/util/List;Lm2/v3;Ljava/util/List;)V", "Loq/i0;", "j", "()V", "a", "Lm2/o2;", "c", "()Lm2/o2;", "b", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "Lm2/l0;", "()Lm2/l0;", "d", "Lm2/i5;", "h", "()Lm2/i5;", "e", "Lm2/b;", "()Lm2/b;", "f", "Ljava/util/List;", "()Ljava/util/List;", "i", "(Ljava/util/List;)V", "Lm2/v3;", "()Lm2/v3;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o2<Object> content;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object parameter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l0 composition;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i5 slotStorage;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b anchor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private List<? extends r<f4, ? extends Object>> invalidations;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final v3 locals;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<s2> nestedReferences;

    public s2(o2<Object> o2Var, Object obj, l0 l0Var, i5 i5Var, b bVar, List<? extends r<f4, ? extends Object>> list, v3 v3Var, List<s2> list2) {
        this.content = o2Var;
        this.parameter = obj;
        this.composition = l0Var;
        this.slotStorage = i5Var;
        this.anchor = bVar;
        this.invalidations = list;
        this.locals = v3Var;
        this.nestedReferences = list2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getAnchor() {
        return this.anchor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final l0 getComposition() {
        return this.composition;
    }

    public final o2<Object> c() {
        return this.content;
    }

    public final List<r<f4, Object>> d() {
        return this.invalidations;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final v3 getLocals() {
        return this.locals;
    }

    public final List<s2> f() {
        return this.nestedReferences;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Object getParameter() {
        return this.parameter;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final i5 getSlotStorage() {
        return this.slotStorage;
    }

    public final void i(List<? extends r<f4, ? extends Object>> list) {
        this.invalidations = list;
    }

    public final void j() {
        if (this.anchor.a()) {
            this.invalidations = v.L0(this.invalidations, ((x) this.composition).R(this.anchor));
        }
    }
}
