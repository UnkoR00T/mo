package m23;

import fr.t;
import hz.i;
import oq.p;
import p071kotlin.Metadata;
import u70.l0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0015\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lm23/f;", "Lgz/b;", "Lm23/f$b;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "<init>", "(Lmx/c;Lhz/i;)V", "Lhz/h;", "d", "()Lhz/h;", "f", "params", "e", "(Lm23/f$b;Ltq/e;)Ljava/lang/Object;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "b", "Lhz/i;", "getValidatorTextFactory", "()Lhz/i;", "c", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements gz.b<b, hz.g> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f123410d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i validatorTextFactory;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lm23/f$b;", "Lgz/b$a;", "a", "b", "Lm23/f$b$a;", "Lm23/f$b$b;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b extends gz.b.a {

        /* JADX INFO: renamed from: m23.f$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lm23/f$b$a;", "Lm23/f$b;", "", "text", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getText", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InstitutionName implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String text;

            public InstitutionName(String str) {
                this.text = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InstitutionName) && t.c(this.text, ((InstitutionName) other).text);
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                return "InstitutionName(text=" + this.text + ')';
            }
        }

        /* JADX INFO: renamed from: m23.f$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lm23/f$b$b;", "Lm23/f$b;", "", "text", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getText", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ReportNumberOptional implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String text;

            public ReportNumberOptional(String str) {
                this.text = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ReportNumberOptional) && t.c(this.text, ((ReportNumberOptional) other).text);
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                return "ReportNumberOptional(text=" + this.text + ')';
            }
        }
    }

    public f(mx.c cVar, i iVar) {
        this.labelProvider = cVar;
        this.validatorTextFactory = iVar;
    }

    private final hz.h d() {
        return (hz.h) hz.c.INSTANCE.a(this.validatorTextFactory.a().y(300, this.labelProvider.e(h23.b.Z, "300")).M(this.labelProvider.c(h23.b.S0)), new l0(this.labelProvider.e(h23.b.f80143h0, ".,?!-:;()„\""), l23.a.a()));
    }

    private final hz.h f() {
        return (hz.h) hz.c.INSTANCE.a(this.validatorTextFactory.a().y(300, this.labelProvider.e(h23.b.Z, "300")), new l0(this.labelProvider.e(h23.b.f80143h0, ".,?!-:;()„\"/"), l23.a.b()));
    }

    public Object e(b bVar, tq.e<? super hz.g> eVar) {
        if (bVar instanceof b.InstitutionName) {
            return d().a(((b.InstitutionName) bVar).getText());
        }
        if (!(bVar instanceof b.ReportNumberOptional)) {
            throw new p();
        }
        b.ReportNumberOptional reportNumberOptional = (b.ReportNumberOptional) bVar;
        boolean z15 = reportNumberOptional.getText().length() == 0;
        if (z15) {
            return hz.g.b.f86853b;
        }
        if (z15) {
            throw new p();
        }
        return f().a(reportNumberOptional.getText());
    }
}
