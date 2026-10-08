package da4;

import aa4.GradeDetailsData;
import ba4.j;
import ba4.k;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import w94.PreviousGrade;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001,B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ%\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b#\u0010$J%\u0010(\u001a\u00020 2\u0006\u0010&\u001a\u00020%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lda4/h;", "Lxw/f;", "Lda4/h$a;", "Lba4/k$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lba4/j$c;", "state", "params", "Lba4/k$a$b;", "z", "(Lba4/j$c;Lda4/h$a;)Lba4/k$a$b;", "Lba4/j$a;", "Lba4/k$a$a;", "G", "(Lba4/j$a;Lda4/h$a;)Lba4/k$a$a;", "Lba4/j$b;", "I", "(Lba4/j$b;Lda4/h$a;)Lba4/k$a$a;", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Li50/a;", i.f37094u, "(Ler/a;)Li50/a;", "onHide", i.f37087n, "Laa4/a;", "gradeDetails", "onShowFullGradeText", "Ln30/b;", "E", "(Laa4/a;Ler/a;)Ln30/b;", "q", "(Laa4/a;)Ln30/b;", "Lw94/f;", "previousGrade", "onShowFullPreviousGradeText", "J", "(Lw94/f;Ler/a;)Ln30/b;", "M", "(Lda4/h$a;)Lba4/k$a;", "a", "Lmx/c;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements xw.f<Params, k.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: da4.h$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b \u0010\u001dR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001e\u0010\u001d¨\u0006!"}, d2 = {"Lda4/h$a;", "", "Lba4/j;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onShowFullGradeText", "onHideFullGradeText", "onShowFullPreviousGradeText", "onHideFullPreviousGradeText", "<init>", "(Lba4/j;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lba4/j;", "f", "()Lba4/j;", "b", "Ler/a;", "()Ler/a;", "c", "d", "e", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final j state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onShowFullGradeText;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onHideFullGradeText;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onShowFullPreviousGradeText;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onHideFullPreviousGradeText;

        public Params(j jVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = jVar;
            this.onBack = aVar;
            this.onShowFullGradeText = aVar2;
            this.onHideFullGradeText = aVar3;
            this.onShowFullPreviousGradeText = aVar4;
            this.onHideFullPreviousGradeText = aVar5;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onHideFullGradeText;
        }

        public final er.a<i0> c() {
            return this.onHideFullPreviousGradeText;
        }

        public final er.a<i0> d() {
            return this.onShowFullGradeText;
        }

        public final er.a<i0> e() {
            return this.onShowFullPreviousGradeText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onShowFullGradeText, params.onShowFullGradeText) && t.c(this.onHideFullGradeText, params.onHideFullGradeText) && t.c(this.onShowFullPreviousGradeText, params.onShowFullPreviousGradeText) && t.c(this.onHideFullPreviousGradeText, params.onHideFullPreviousGradeText);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final j getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onShowFullGradeText.hashCode()) * 31) + this.onHideFullGradeText.hashCode()) * 31) + this.onShowFullPreviousGradeText.hashCode()) * 31) + this.onHideFullPreviousGradeText.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onShowFullGradeText=" + this.onShowFullGradeText + ", onHideFullGradeText=" + this.onHideFullGradeText + ", onShowFullPreviousGradeText=" + this.onShowFullPreviousGradeText + ", onHideFullPreviousGradeText=" + this.onHideFullPreviousGradeText + ')';
        }
    }

    public h(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final CardListData E(GradeDetailsData gradeDetails, er.a<i0> onShowFullGradeText) {
        Integer numA = z94.a.a(gradeDetails.getIcon());
        if (gradeDetails.getIcon().getType() == w94.c.TEXT) {
            numA = null;
        }
        return new CardListData(v.e(new DefaultSingleCardData("gradeDetails_grade", new er.a() { // from class: da4.a
            @Override // er.a
            public final Object a() {
                return h.F();
            }
        }, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(s94.a.f179499g), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(gradeDetails.getGrade(), "gradeDetails_grade_value"), null, null, 2, 0, null, 54, null)), null), numA != null ? new LeadingSection(false, null, new n50.i.Resource(new n50.i.Resource.a.DrawableResource(numA.intValue(), null, 2, null), null, null, 6, null), 3, null) : null, gradeDetails.getDescriptive() ? new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(s94.a.f179494b), this.labelProvider.c(s94.a.f179495c)), k30.d.a.f107773a, null, onShowFullGradeText, 35, null)) : null, null, 2300, null)), null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F() {
        return i0.f148189a;
    }

    private final k.a.DisplayingFullGradeText G(j.DisplayingFullGradeText state, Params params) {
        return new k.a.DisplayingFullGradeText(H(params.b()), mx.b.b(state.getGradeDetails().getGrade(), "gradeDetails_fullGradeText"), params.b());
    }

    private final BaseScaffoldData H(er.a<i0> onHide) {
        return new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), onHide), this.labelProvider.c(s94.a.f179499g), null, null, null, 28, null), null, null, null, null, 61, null);
    }

    private final k.a.DisplayingFullGradeText I(j.DisplayingFullPreviousGradeText state, Params params) {
        BaseScaffoldData baseScaffoldDataH = H(params.c());
        PreviousGrade previousGrade = state.getGradeDetails().getPreviousGrade();
        String grade = previousGrade != null ? previousGrade.getGrade() : null;
        if (grade == null) {
            grade = "";
        }
        return new k.a.DisplayingFullGradeText(baseScaffoldDataH, mx.b.b(grade, "gradeDetails_fullPreviousGradeText"), params.c());
    }

    private final CardListData J(PreviousGrade previousGrade, er.a<i0> onShowFullPreviousGradeText) {
        return new CardListData(v.e(new DefaultSingleCardData("gradeDetails_previousGrade", new er.a() { // from class: da4.b
            @Override // er.a
            public final Object a() {
                return h.K();
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(previousGrade.getGrade(), "gradeDetails_previousGrade_value"), null, null, 2, 0, null, 54, null)), new SingleCardLabel(mx.b.b(this.labelProvider.c(s94.a.f179503k).getText() + ": " + previousGrade.getCreatedAt().format(DateTimeFormatter.ofPattern(fz.c.DOTTED.getFormat())), "gradeDetails_previousGrade_date"), null, null, 0, 0, null, 62, null)), null, previousGrade.getDescriptive() ? new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(s94.a.f179494b), null, 2, null), k30.d.a.f107773a, null, onShowFullPreviousGradeText, 35, null)) : null, null, 2300, null)), null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K() {
        return i0.f148189a;
    }

    private final BaseScaffoldData L(er.a<i0> onBack) {
        return new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), onBack), this.labelProvider.c(s94.a.f179502j), null, null, null, 28, null), null, null, null, null, 61, null);
    }

    private final CardListData q(GradeDetailsData gradeDetails) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new DefaultSingleCardData("gradeDetails_subject", new er.a() { // from class: da4.c
            @Override // er.a
            public final Object a() {
                return h.r();
            }
        }, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(s94.a.f179507o), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(gradeDetails.getSubjectName(), "gradeDetails_subject_value"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 2300, null));
        arrayList.add(new DefaultSingleCardData("gradeDetails_categoryRow", new er.a() { // from class: da4.d
            @Override // er.a
            public final Object a() {
                return h.s();
            }
        }, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(s94.a.f179500h), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(gradeDetails.getCategory(), "gradeDetails_category_value"), null, null, 0, 0, null, 62, null)), null), null, null, null, 2300, null));
        arrayList.add(new DefaultSingleCardData("gradeDetails_date", new er.a() { // from class: da4.e
            @Override // er.a
            public final Object a() {
                return h.u();
            }
        }, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(s94.a.f179503k), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(gradeDetails.getCreatedAt().format(DateTimeFormatter.ofPattern(fz.c.DOTTED.getFormat())), "gradeCreatedAt"), null, null, 0, 0, null, 62, null)), null), null, null, null, 2300, null));
        arrayList.add(new DefaultSingleCardData("gradeDetails_teacher", new er.a() { // from class: da4.f
            @Override // er.a
            public final Object a() {
                return h.v();
            }
        }, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(s94.a.f179509q), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(gradeDetails.getTeacher(), "gradeDetails_teacher_value"), null, null, 0, 0, null, 62, null)), null), null, null, null, 2300, null));
        SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(s94.a.f179501i), null, null, 0, 0, null, 62, null);
        String comment = gradeDetails.getComment();
        if (comment == null) {
            comment = "-";
        }
        arrayList.add(new DefaultSingleCardData("gradeDetails_comment", new er.a() { // from class: da4.g
            @Override // er.a
            public final Object a() {
                return h.x();
            }
        }, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.b(comment, "gradeDetails_comment_value"), null, null, 0, 0, null, 62, null)), null), null, null, null, 2300, null));
        return new CardListData(arrayList, null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x() {
        return i0.f148189a;
    }

    private final k.a.DisplayingGradeDetails z(j.DisplayingGradeDetails state, Params params) {
        BaseScaffoldData baseScaffoldDataL = L(params.a());
        CardListData cardListDataE = E(state.getGradeDetails(), params.d());
        CardListData cardListDataQ = q(state.getGradeDetails());
        PreviousGrade previousGrade = state.getGradeDetails().getPreviousGrade();
        return new k.a.DisplayingGradeDetails(baseScaffoldDataL, cardListDataE, cardListDataQ, previousGrade != null ? J(previousGrade, params.e()) : null, state.getGradeDetails().getPreviousGrade() != null ? this.labelProvider.c(s94.a.f179506n) : null, params.a());
    }

    @Override // er.l
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public k.a b(Params params) {
        j state = params.getState();
        if (state instanceof j.e) {
            return k.a.d.f17910a;
        }
        if (state instanceof j.DisplayingGradeDetails) {
            return z((j.DisplayingGradeDetails) state, params);
        }
        if (state instanceof j.DisplayingFullGradeText) {
            return G((j.DisplayingFullGradeText) state, params);
        }
        if (state instanceof j.DisplayingFullPreviousGradeText) {
            return I((j.DisplayingFullPreviousGradeText) state, params);
        }
        if (state instanceof j.ErrorLoadingGradeDetails) {
            return new k.a.ErrorLoadingGradeDetails(((j.ErrorLoadingGradeDetails) state).getErrorVMS());
        }
        throw new p();
    }
}
