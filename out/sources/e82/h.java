package e82;

import mx.Label;
import oq.p;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015¨\u0006\u001b"}, d2 = {"Le82/h;", "Lgz/b;", "Le82/h$a;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "<init>", "(Lmx/c;Lhz/i;)V", "params", "f", "(Le82/h$a;Ltq/e;)Ljava/lang/Object;", "Lh82/b;", "a", "Loq/k;", "e", "()Lh82/b;", "noSpecialCharactersRule", "Lhz/h;", "b", "Lhz/h;", "officeValidator", "c", "entityNameValidator", "d", "descriptionValidator", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements gz.b<a, hz.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final oq.k noSpecialCharactersRule;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hz.h officeValidator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hz.h entityNameValidator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hz.h descriptionValidator;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\t\n\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Le82/h$a;", "Lgz/b$a;", "Lmx/a;", "text", "<init>", "(Lmx/a;)V", "a", "Lmx/a;", "()Lmx/a;", "c", "b", "Le82/h$a$a;", "Le82/h$a$b;", "Le82/h$a$c;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Label text;

        /* JADX INFO: renamed from: e82.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le82/h$a$a;", "Le82/h$a;", "Lmx/a;", "text", "<init>", "(Lmx/a;)V", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C1128a extends a {
            public C1128a(Label label) {
                super(label, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le82/h$a$b;", "Le82/h$a;", "Lmx/a;", "text", "<init>", "(Lmx/a;)V", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b extends a {
            public b(Label label) {
                super(label, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le82/h$a$c;", "Le82/h$a;", "Lmx/a;", "text", "<init>", "(Lmx/a;)V", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class c extends a {
            public c(Label label) {
                super(label, null);
            }
        }

        public /* synthetic */ a(Label label, fr.k kVar) {
            this(label);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getText() {
            return this.text;
        }

        private a(Label label) {
            this.text = label;
        }
    }

    public h(final mx.c cVar, hz.i iVar) {
        this.noSpecialCharactersRule = oq.l.a(new er.a() { // from class: e82.g
            @Override // er.a
            public final Object a() {
                return h.g(cVar);
            }
        });
        hz.c.Companion companion = hz.c.INSTANCE;
        this.officeValidator = (hz.h) companion.a(iVar.a().y(GF2Field.MASK, cVar.c(v72.b.f204280o)).M(cVar.c(v72.b.f204244c)), new h82.c(cVar.c(v72.b.f204277n)));
        this.entityNameValidator = (hz.h) companion.a(iVar.a().y(GF2Field.MASK, cVar.c(v72.b.f204280o)), e());
        this.descriptionValidator = (hz.h) companion.a(iVar.a().O(0, cVar.e(v72.b.f204274m, 0)).y(1000, cVar.c(v72.b.f204280o)).M(cVar.c(v72.b.f204244c)), e());
    }

    private final h82.b e() {
        return (h82.b) this.noSpecialCharactersRule.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h82.b g(mx.c cVar) {
        return new h82.b(cVar.c(v72.b.f204277n));
    }

    public Object f(a aVar, tq.e<? super hz.g> eVar) {
        hz.h hVar;
        if (aVar instanceof a.c) {
            hVar = this.officeValidator;
        } else if (aVar instanceof a.b) {
            hVar = this.entityNameValidator;
        } else {
            if (!(aVar instanceof a.C1128a)) {
                throw new p();
            }
            hVar = this.descriptionValidator;
        }
        return hVar.a(aVar.getText().getText());
    }
}
