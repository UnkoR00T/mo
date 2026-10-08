package kd3;

import mz3.z;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0010\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkd3/n;", "Lxw/f;", "Lkd3/n$a;", "Ljb4/b;", "Lib4/c;", "errorMapper", "Lmx/c;", "labelProvider", "<init>", "(Lib4/c;Lmx/c;)V", "params", "i", "(Lkd3/n$a;)Ljb4/b;", "Ldx/b$c;", "h", "()Ldx/b$c;", "a", "Lib4/c;", "b", "Lmx/c;", "uut_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n implements xw.f<Params, jb4.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: kd3.n$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lkd3/n$a;", "", "Lkd3/n$b;", "error", "Lkotlin/Function0;", "Loq/i0;", "goBackAction", "deleteDocumentAction", "updateDocumentAction", "<init>", "(Lkd3/n$b;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd3/n$b;", "b", "()Lkd3/n$b;", "Ler/a;", "c", "()Ler/a;", "d", "uut_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b error;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> deleteDocumentAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> updateDocumentAction;

        public Params(b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.error = bVar;
            this.goBackAction = aVar;
            this.deleteDocumentAction = aVar2;
            this.updateDocumentAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.deleteDocumentAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b getError() {
            return this.error;
        }

        public final er.a<i0> c() {
            return this.goBackAction;
        }

        public final er.a<i0> d() {
            return this.updateDocumentAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.error, params.error) && fr.t.c(this.goBackAction, params.goBackAction) && fr.t.c(this.deleteDocumentAction, params.deleteDocumentAction) && fr.t.c(this.updateDocumentAction, params.updateDocumentAction);
        }

        public int hashCode() {
            return (((((this.error.hashCode() * 31) + this.goBackAction.hashCode()) * 31) + this.deleteDocumentAction.hashCode()) * 31) + this.updateDocumentAction.hashCode();
        }

        public String toString() {
            return "Params(error=" + this.error + ", goBackAction=" + this.goBackAction + ", deleteDocumentAction=" + this.deleteDocumentAction + ", updateDocumentAction=" + this.updateDocumentAction + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\n\u000b\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lkd3/n$b;", "", "Ldx/b;", "error", "<init>", "(Ldx/b;)V", "a", "Ldx/b;", "getError", "()Ldx/b;", "c", "b", "Lkd3/n$b$a;", "Lkd3/n$b$b;", "Lkd3/n$b$c;", "uut_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final dx.b error;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkd3/n$b$a;", "Lkd3/n$b;", "Ldx/b;", "error", "Ldx/b;", "a", "()Ldx/b;", "uut_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a extends b {
            public dx.b a() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: kd3.n$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lkd3/n$b$b;", "Lkd3/n$b;", "Ldx/b;", "error", "<init>", "(Ldx/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ldx/b;", "a", "()Ldx/b;", "uut_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class GetDocument extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final dx.b error;

            public GetDocument(dx.b bVar) {
                super(bVar, null);
                this.error = bVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public dx.b getError() {
                return this.error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GetDocument) && fr.t.c(this.error, ((GetDocument) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "GetDocument(error=" + this.error + ')';
            }
        }

        /* JADX INFO: renamed from: kd3.n$b$c, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lkd3/n$b$c;", "Lkd3/n$b;", "Ldx/b;", "error", "Lmz3/z$b;", "updateMethodType", "<init>", "(Ldx/b;Lmz3/z$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ldx/b;", "a", "()Ldx/b;", "c", "Lmz3/z$b;", "()Lmz3/z$b;", "uut_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class UpdateDocument extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final dx.b error;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final z.b updateMethodType;

            public UpdateDocument(dx.b bVar, z.b bVar2) {
                super(bVar, null);
                this.error = bVar;
                this.updateMethodType = bVar2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public dx.b getError() {
                return this.error;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final z.b getUpdateMethodType() {
                return this.updateMethodType;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateDocument)) {
                    return false;
                }
                UpdateDocument updateDocument = (UpdateDocument) other;
                return fr.t.c(this.error, updateDocument.error) && this.updateMethodType == updateDocument.updateMethodType;
            }

            public int hashCode() {
                return (this.error.hashCode() * 31) + this.updateMethodType.hashCode();
            }

            public String toString() {
                return "UpdateDocument(error=" + this.error + ", updateMethodType=" + this.updateMethodType + ')';
            }
        }

        public /* synthetic */ b(dx.b bVar, fr.k kVar) {
            this(bVar);
        }

        private b(dx.b bVar) {
            this.error = bVar;
        }
    }

    public n(ib4.c cVar, mx.c cVar2) {
        this.errorMapper = cVar;
        this.labelProvider = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.a.Primary) {
            params.a().a();
        } else {
            if (!(bVar instanceof ib4.c.b.AbstractC2161b.C2162b) && !(bVar instanceof ib4.c.b.AbstractC2161b.a) && !(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                throw new oq.p();
            }
            params.c().a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            params.d().a();
        } else if (!(bVar instanceof ib4.c.b.AbstractC2161b.a) && !(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
            throw new oq.p();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, ib4.c.b bVar) {
        params.c().a();
        return i0.f148189a;
    }

    public final dx.b.Business h() {
        return new dx.b.Business(null, null, this.labelProvider.c(ed3.a.f49510q), this.labelProvider.c(ed3.a.f49509p), null, this.labelProvider.c(ed3.a.f49501h), null, 83, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public jb4.b b(final Params params) {
        b error = params.getError();
        if (error instanceof b.GetDocument) {
            return this.errorMapper.b(new ib4.c.Params(((b.GetDocument) error).getError(), false, new er.l() { // from class: kd3.k
                @Override // er.l
                public final Object b(Object obj) {
                    return n.l(params, (ib4.c.b) obj);
                }
            }, 2, null));
        }
        if (error instanceof b.UpdateDocument) {
            return this.errorMapper.b(new ib4.c.Params(((b.UpdateDocument) error).getError(), false, new er.l() { // from class: kd3.l
                @Override // er.l
                public final Object b(Object obj) {
                    return n.m(params, (ib4.c.b) obj);
                }
            }, 2, null));
        }
        if (error instanceof b.a) {
            return this.errorMapper.b(new ib4.c.Params(((b.a) error).a(), false, new er.l() { // from class: kd3.m
                @Override // er.l
                public final Object b(Object obj) {
                    return n.q(params, (ib4.c.b) obj);
                }
            }, 2, null));
        }
        throw new oq.p();
    }
}
