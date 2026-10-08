package fn2;

import en2.e;
import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import mx.c;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.b;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import x50.NavigationButtonData;
import x50.i;
import xl2.q5;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lfn2/a;", "Lxw/f;", "Lfn2/a$a;", "Len2/f$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Lfn2/a$a;)Len2/f$a;", "Lmx/a;", "c", "()Lmx/a;", "a", "Lmx/c;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, en2.f.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: fn2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001e"}, d2 = {"Lfn2/a$a;", "", "Len2/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "goToFraudsAndCyberattacks", "goToIllegalContent", "goBack", "<init>", "(Len2/e;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Len2/e;", "getState", "()Len2/e;", "b", "Ler/a;", "()Ler/a;", "c", "d", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToFraudsAndCyberattacks;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToIllegalContent;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goBack;

        public Params(e eVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = eVar;
            this.goToFraudsAndCyberattacks = aVar;
            this.goToIllegalContent = aVar2;
            this.goBack = aVar3;
        }

        public final er.a<i0> a() {
            return this.goBack;
        }

        public final er.a<i0> b() {
            return this.goToFraudsAndCyberattacks;
        }

        public final er.a<i0> c() {
            return this.goToIllegalContent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.goToFraudsAndCyberattacks, params.goToFraudsAndCyberattacks) && t.c(this.goToIllegalContent, params.goToIllegalContent) && t.c(this.goBack, params.goBack);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.goToFraudsAndCyberattacks.hashCode()) * 31) + this.goToIllegalContent.hashCode()) * 31) + this.goBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", goToFraudsAndCyberattacks=" + this.goToFraudsAndCyberattacks + ", goToIllegalContent=" + this.goToIllegalContent + ", goBack=" + this.goBack + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    public final Label c() {
        return this.labelProvider.c(q5.f219559m0);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public en2.f.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(q5.f219561n0), null, null, null, 28, null), null, null, null, null, 61, null);
        BodySection bodySection = new BodySection(null, new b.Title(new SingleCardLabel(this.labelProvider.c(q5.f219555k0), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(q5.f219553j0), null, null, 0, 0, null, 62, null), 1, null);
        x0.Icon.Companion companion = x0.Icon.INSTANCE;
        return new en2.f.Data(new DefaultSingleCardData(null, params.b(), false, null, null, false, null, null, bodySection, null, companion.b(), null, 2813, null), new DefaultSingleCardData(null, params.c(), false, null, null, false, null, null, new BodySection(null, new b.Title(new SingleCardLabel(this.labelProvider.c(q5.f219559m0), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(q5.f219557l0), null, null, 0, 0, null, 62, null), 1, null), null, companion.b(), null, 2813, null), baseScaffoldData);
    }
}
