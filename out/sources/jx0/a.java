package jx0;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import ix0.g;
import ix0.h;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.i;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ljx0/a;", "Lxw/f;", "Ljx0/a$a;", "Lix0/h$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Ljx0/a$a;)Lix0/h$a;", "a", "Lmx/c;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, h.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: jx0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, d2 = {"Ljx0/a$a;", "", "Lix0/g;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClicked", "onOnlineConfirmationClicked", "onEIdConfirmationClicked", "<init>", "(Lix0/g;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lix0/g;", "d", "()Lix0/g;", "b", "Ler/a;", "()Ler/a;", "c", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final g state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClicked;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onOnlineConfirmationClicked;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onEIdConfirmationClicked;

        public Params(g gVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = gVar;
            this.onBackClicked = aVar;
            this.onOnlineConfirmationClicked = aVar2;
            this.onEIdConfirmationClicked = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBackClicked;
        }

        public final er.a<i0> b() {
            return this.onEIdConfirmationClicked;
        }

        public final er.a<i0> c() {
            return this.onOnlineConfirmationClicked;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final g getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackClicked, params.onBackClicked) && t.c(this.onOnlineConfirmationClicked, params.onOnlineConfirmationClicked) && t.c(this.onEIdConfirmationClicked, params.onEIdConfirmationClicked);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBackClicked.hashCode()) * 31) + this.onOnlineConfirmationClicked.hashCode()) * 31) + this.onEIdConfirmationClicked.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClicked=" + this.onBackClicked + ", onOnlineConfirmationClicked=" + this.onOnlineConfirmationClicked + ", onEIdConfirmationClicked=" + this.onEIdConfirmationClicked + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f106473a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1994576417);
            if (p076m2.t.k()) {
                p076m2.t.o(1994576417, i15, -1, "pl.gov.coi.mobywatel.feature.adddocument.presentation.screen.confirmationmethod.mapper.ConfirmationMethodScreenMapper.invoke.<anonymous> (ConfirmationMethodScreenMapper.kt:39)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f106474a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1671760777);
            if (p076m2.t.k()) {
                p076m2.t.o(-1671760777, i15, -1, "pl.gov.coi.mobywatel.feature.adddocument.presentation.screen.confirmationmethod.mapper.ConfirmationMethodScreenMapper.invoke.<anonymous> (ConfirmationMethodScreenMapper.kt:61)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public h.a b(Params params) {
        if (!(params.getState() instanceof g.Initialized)) {
            throw new oq.p();
        }
        Label labelC = this.labelProvider.c(yw0.a.f229977f);
        Label labelC2 = this.labelProvider.c(yw0.a.f229972a);
        er.a<i0> aVarA = params.a();
        LeadingSection leadingSection = new LeadingSection(false, null, new i.Icon(jz.a.f106839p, null, b.f106473a, null, null, 26, null), 3, null);
        x0.Icon.Companion companion = x0.Icon.INSTANCE;
        x0.Icon iconB = companion.b();
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, params.c(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(yw0.a.f229976e), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(yw0.a.f229975d), null, null, 0, 0, null, 62, null), 1, null), leadingSection, iconB, null, 2301, null);
        LeadingSection leadingSection2 = new LeadingSection(false, null, new i.Icon(jz.a.L0, null, c.f106474a, null, null, 26, null), 3, null);
        x0.Icon iconB2 = companion.b();
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, params.b(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(yw0.a.f229974c), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(yw0.a.f229973b), null, null, 0, 0, null, 62, null), 1, null), leadingSection2, iconB2, null, 2301, null);
        if (!((g.Initialized) params.getState()).getEIdConfirmationAvailable()) {
            defaultSingleCardData2 = null;
        }
        return new h.a.DataLoaded(labelC, labelC2, v.s(defaultSingleCardData, defaultSingleCardData2), aVarA);
    }
}
