package t02;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0013\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0015\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001b\u0010\u0018\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u001b\u0010\u001b\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u001b\u0010\u001e\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011¨\u0006 "}, d2 = {"Lt02/g;", "Lgz/b;", "Lt02/g$b;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "<init>", "(Lmx/c;Lhz/i;)V", "params", "q", "(Lt02/g$b;Ltq/e;)Ljava/lang/Object;", "Lhz/h;", "a", "Loq/k;", "o", "()Lhz/h;", "titleFieldNotEmptyValidator", "b", "p", "titleFieldValidator", "c", "n", "contentFieldValidator", "d", "m", "contentFieldNotEmptyValidator", "e", "l", "caseSignFieldValidator", "f", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements gz.b<b, hz.g> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f186612g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final oq.k titleFieldNotEmptyValidator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k titleFieldValidator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k contentFieldValidator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k contentFieldNotEmptyValidator;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final oq.k caseSignFieldValidator;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\t\n\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lt02/g$b;", "Lgz/b$a;", "", "value", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "b", "Lt02/g$b$a;", "Lt02/g$b$b;", "Lt02/g$b$c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt02/g$b$a;", "Lt02/g$b;", "", "value", "<init>", "(Ljava/lang/String;)V", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends b {
            public a(String str) {
                super(str, null);
            }
        }

        /* JADX INFO: renamed from: t02.g$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"Lt02/g$b$b;", "Lt02/g$b;", "", "value", "", "validateNotEmpty", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "c", "Z", "()Z", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Content extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String value;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean validateNotEmpty;

            public Content(String str, boolean z15) {
                super(str, null);
                this.value = str;
                this.validateNotEmpty = z15;
            }

            @Override // t02.g.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getValue() {
                return this.value;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final boolean getValidateNotEmpty() {
                return this.validateNotEmpty;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Content)) {
                    return false;
                }
                Content content = (Content) other;
                return fr.t.c(this.value, content.value) && this.validateNotEmpty == content.validateNotEmpty;
            }

            public int hashCode() {
                return (this.value.hashCode() * 31) + Boolean.hashCode(this.validateNotEmpty);
            }

            public String toString() {
                return "Content(value=" + this.value + ", validateNotEmpty=" + this.validateNotEmpty + ')';
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lt02/g$b$c;", "Lt02/g$b;", "", "value", "", "validateNotEmpty", "<init>", "(Ljava/lang/String;Z)V", "b", "Z", "()Z", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class c extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final boolean validateNotEmpty;

            public c(String str, boolean z15) {
                super(str, null);
                this.validateNotEmpty = z15;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final boolean getValidateNotEmpty() {
                return this.validateNotEmpty;
            }
        }

        public /* synthetic */ b(String str, fr.k kVar) {
            this(str);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public String getValue() {
            return this.value;
        }

        private b(String str) {
            this.value = str;
        }
    }

    public g(final mx.c cVar, final hz.i iVar) {
        this.titleFieldNotEmptyValidator = oq.l.a(new er.a() { // from class: t02.b
            @Override // er.a
            public final Object a() {
                return g.r(iVar, cVar);
            }
        });
        this.titleFieldValidator = oq.l.a(new er.a() { // from class: t02.c
            @Override // er.a
            public final Object a() {
                return g.s(iVar, cVar);
            }
        });
        this.contentFieldValidator = oq.l.a(new er.a() { // from class: t02.d
            @Override // er.a
            public final Object a() {
                return g.k(iVar, cVar);
            }
        });
        this.contentFieldNotEmptyValidator = oq.l.a(new er.a() { // from class: t02.e
            @Override // er.a
            public final Object a() {
                return g.j(iVar, cVar);
            }
        });
        this.caseSignFieldValidator = oq.l.a(new er.a() { // from class: t02.f
            @Override // er.a
            public final Object a() {
                return g.i(iVar, cVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hz.h i(hz.i iVar, mx.c cVar) {
        return iVar.a().y(50, cVar.c(e02.a.F3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hz.h j(hz.i iVar, mx.c cVar) {
        return iVar.a().M(cVar.c(e02.a.f46535g2)).y(5000, cVar.c(e02.a.G3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hz.h k(hz.i iVar, mx.c cVar) {
        return iVar.a().y(5000, cVar.c(e02.a.G3));
    }

    private final hz.h l() {
        return (hz.h) this.caseSignFieldValidator.getValue();
    }

    private final hz.h m() {
        return (hz.h) this.contentFieldNotEmptyValidator.getValue();
    }

    private final hz.h n() {
        return (hz.h) this.contentFieldValidator.getValue();
    }

    private final hz.h o() {
        return (hz.h) this.titleFieldNotEmptyValidator.getValue();
    }

    private final hz.h p() {
        return (hz.h) this.titleFieldValidator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hz.h r(hz.i iVar, mx.c cVar) {
        return iVar.a().M(cVar.c(e02.a.J3)).y(GF2Field.MASK, cVar.e(e02.a.I3, Integer.valueOf(GF2Field.MASK)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hz.h s(hz.i iVar, mx.c cVar) {
        return iVar.a().y(GF2Field.MASK, cVar.e(e02.a.I3, Integer.valueOf(GF2Field.MASK)));
    }

    public Object q(b bVar, tq.e<? super hz.g> eVar) {
        hz.h hVarL;
        if (bVar instanceof b.c) {
            hVarL = ((b.c) bVar).getValidateNotEmpty() ? o() : p();
        } else if (bVar instanceof b.Content) {
            hVarL = ((b.Content) bVar).getValidateNotEmpty() ? m() : n();
        } else {
            if (!(bVar instanceof b.a)) {
                throw new oq.p();
            }
            hVarL = l();
        }
        return hVarL.a(bVar.getValue());
    }
}
