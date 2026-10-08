package d42;

import android.net.Uri;
import android.net.http.SslCertificate;
import android.webkit.ValueCallback;
import androidx.compose.ui.graphics.Color;
import bz.DownloadFileData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import p071kotlin.Metadata;
import vr0.BEUserCard;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Ld42/m;", "Lxw/f;", "Ld42/m$a;", "Ld42/k$a;", "Lmx/c;", "labelProvider", "Lg42/j;", "paymentsCardsHelper", "<init>", "(Lmx/c;Lg42/j;)V", "Lvr0/p;", "Lkotlin/Function2;", "", "Loq/i0;", "payWithCard", "Ln50/g;", "f", "(Lvr0/p;Ler/p;)Ln50/g;", "params", "Ld42/f$a;", "state", "Li50/a;", "m", "(Ld42/m$a;Ld42/f$a;)Li50/a;", "r", "(Ld42/m$a;)Ld42/k$a;", "Lmx/a;", "l", "()Lmx/a;", "q", "i", "a", "Lmx/c;", "b", "Lg42/j;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements xw.f<Params, k.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g42.j paymentsCardsHelper;

    /* JADX INFO: renamed from: d42.m$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010$R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010$R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010$R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b\"\u0010$R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b)\u0010$R)\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010+\u001a\u0004\b,\u0010-R%\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0006¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b'\u0010/R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b%\u0010$R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b*\u0010$¨\u00060"}, d2 = {"Ld42/m$a;", "", "Ld42/f;", "state", "Lkotlin/Function0;", "Loq/i0;", "close", "payAndSaveCard", "payWithoutSave", "deleteCard", "onSnackBarHidden", "Lkotlin/Function2;", "", "payWithCard", "Lkotlin/Function1;", "Landroid/net/Uri;", "onResponseReceived", "onCloseWithError", "onSslError", "<init>", "(Ld42/f;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/p;Ler/l;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ld42/f;", "j", "()Ld42/f;", "b", "Ler/a;", "()Ler/a;", "c", "g", "d", "i", "e", "f", "Ler/p;", "h", "()Ler/p;", "Ler/l;", "()Ler/l;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final f state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> close;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> payAndSaveCard;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> payWithoutSave;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> deleteCard;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onSnackBarHidden;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.p<String, String, oq.i0> payWithCard;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Uri, oq.i0> onResponseReceived;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onCloseWithError;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onSslError;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(f fVar, er.a<oq.i0> aVar, er.a<oq.i0> aVar2, er.a<oq.i0> aVar3, er.a<oq.i0> aVar4, er.a<oq.i0> aVar5, er.p<? super String, ? super String, oq.i0> pVar, er.l<? super Uri, oq.i0> lVar, er.a<oq.i0> aVar6, er.a<oq.i0> aVar7) {
            this.state = fVar;
            this.close = aVar;
            this.payAndSaveCard = aVar2;
            this.payWithoutSave = aVar3;
            this.deleteCard = aVar4;
            this.onSnackBarHidden = aVar5;
            this.payWithCard = pVar;
            this.onResponseReceived = lVar;
            this.onCloseWithError = aVar6;
            this.onSslError = aVar7;
        }

        public final er.a<oq.i0> a() {
            return this.close;
        }

        public final er.a<oq.i0> b() {
            return this.deleteCard;
        }

        public final er.a<oq.i0> c() {
            return this.onCloseWithError;
        }

        public final er.l<Uri, oq.i0> d() {
            return this.onResponseReceived;
        }

        public final er.a<oq.i0> e() {
            return this.onSnackBarHidden;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.state, params.state) && fr.t.c(this.close, params.close) && fr.t.c(this.payAndSaveCard, params.payAndSaveCard) && fr.t.c(this.payWithoutSave, params.payWithoutSave) && fr.t.c(this.deleteCard, params.deleteCard) && fr.t.c(this.onSnackBarHidden, params.onSnackBarHidden) && fr.t.c(this.payWithCard, params.payWithCard) && fr.t.c(this.onResponseReceived, params.onResponseReceived) && fr.t.c(this.onCloseWithError, params.onCloseWithError) && fr.t.c(this.onSslError, params.onSslError);
        }

        public final er.a<oq.i0> f() {
            return this.onSslError;
        }

        public final er.a<oq.i0> g() {
            return this.payAndSaveCard;
        }

        public final er.p<String, String, oq.i0> h() {
            return this.payWithCard;
        }

        public int hashCode() {
            return (((((((((((((((((this.state.hashCode() * 31) + this.close.hashCode()) * 31) + this.payAndSaveCard.hashCode()) * 31) + this.payWithoutSave.hashCode()) * 31) + this.deleteCard.hashCode()) * 31) + this.onSnackBarHidden.hashCode()) * 31) + this.payWithCard.hashCode()) * 31) + this.onResponseReceived.hashCode()) * 31) + this.onCloseWithError.hashCode()) * 31) + this.onSslError.hashCode();
        }

        public final er.a<oq.i0> i() {
            return this.payWithoutSave;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final f getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", close=" + this.close + ", payAndSaveCard=" + this.payAndSaveCard + ", payWithoutSave=" + this.payWithoutSave + ", deleteCard=" + this.deleteCard + ", onSnackBarHidden=" + this.onSnackBarHidden + ", payWithCard=" + this.payWithCard + ", onResponseReceived=" + this.onResponseReceived + ", onCloseWithError=" + this.onCloseWithError + ", onSslError=" + this.onSslError + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BEUserCard f39843b;

        b(BEUserCard bEUserCard) {
            this.f39843b = bEUserCard;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-572428190);
            if (p076m2.t.k()) {
                p076m2.t.o(-572428190, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.cards.PaymentsCardsMapper.getCardPaymentCard.<anonymous> (PaymentsCardsMapper.kt:147)");
            }
            long jE = m.this.paymentsCardsHelper.e(this.f39843b, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jE;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BEUserCard f39845b;

        c(BEUserCard bEUserCard) {
            this.f39845b = bEUserCard;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(1275896712);
            if (p076m2.t.k()) {
                p076m2.t.o(1275896712, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.cards.PaymentsCardsMapper.getCardPaymentCard.<anonymous> (PaymentsCardsMapper.kt:171)");
            }
            long jE = m.this.paymentsCardsHelper.e(this.f39845b, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jE;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"d42/m$d", "Lw70/p;", "", "b", "()Z", "a", "", "c", "()I", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements w70.p {
        d() {
        }

        @Override // w70.o
        /* JADX INFO: renamed from: a */
        public boolean getF177789a() {
            return true;
        }

        @Override // w70.p
        public boolean b() {
            return true;
        }

        @Override // w70.p
        public int c() {
            return 2;
        }

        @Override // w70.p
        /* JADX INFO: renamed from: d */
        public /* bridge */ String getF177790b() {
            return super.getF177790b();
        }

        @Override // w70.p
        public /* bridge */ int e() {
            return super.e();
        }

        @Override // w70.o
        public /* bridge */ List<Object> f() {
            return super.f();
        }

        @Override // w70.p
        public /* bridge */ boolean g() {
            return super.g();
        }

        @Override // w70.p
        public /* bridge */ boolean h() {
            return super.h();
        }

        @Override // w70.p
        public /* bridge */ boolean i() {
            return super.i();
        }

        @Override // w70.p
        public /* bridge */ w70.p.a j() {
            return super.j();
        }
    }

    @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"d42/m$e", "Lw70/n;", "Landroid/net/Uri;", "url", "Loq/i0;", "z7", "(Landroid/net/Uri;)V", "", "scheme", "c2", "(Ljava/lang/String;Landroid/net/Uri;)V", "", "primaryError", "Landroid/net/http/SslCertificate;", "certificate", "f6", "(Ljava/lang/String;ILandroid/net/http/SslCertificate;)V", "", "canGoBack", "Lkotlin/Function0;", "goBack", "M1", "(Ljava/lang/String;ZLer/a;)V", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements w70.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Params f39846a;

        e(Params params) {
            this.f39846a = params;
        }

        @Override // w70.n
        public void M1(String url, boolean canGoBack, er.a<oq.i0> goBack) {
            if (canGoBack) {
                goBack.a();
            } else {
                this.f39846a.c().a();
            }
        }

        @Override // w70.n
        public /* bridge */ void N7(String str, er.l<? super String, oq.i0> lVar) {
            super.N7(str, lVar);
        }

        @Override // w70.n
        public /* bridge */ void O1(DownloadFileData downloadFileData) {
            super.O1(downloadFileData);
        }

        @Override // w70.n
        public /* bridge */ void R2(int i15) {
            super.R2(i15);
        }

        @Override // w70.n
        public /* bridge */ void b8(ValueCallback<Uri[]> valueCallback) {
            super.b8(valueCallback);
        }

        @Override // w70.n
        public void c2(String scheme, Uri url) {
        }

        @Override // w70.n
        public void f6(String url, int primaryError, SslCertificate certificate) {
            this.f39846a.f().a();
        }

        @Override // w70.n
        public /* bridge */ void n1(String str, iy.b0 b0Var, String str2) {
            super.n1(str, b0Var, str2);
        }

        @Override // w70.n
        public void z7(Uri url) {
            this.f39846a.d().b(url);
        }
    }

    public m(mx.c cVar, g42.j jVar) {
        this.labelProvider = cVar;
        this.paymentsCardsHelper = jVar;
    }

    private final DefaultSingleCardData f(final BEUserCard bEUserCard, final er.p<? super String, ? super String, oq.i0> pVar) {
        if (!bEUserCard.getActive()) {
            return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.paymentsCardsHelper.c(bEUserCard.getCardNumberMasked()), this.paymentsCardsHelper.f(bEUserCard.getCardNumberMasked()), null, 0, 0, null, 60, null)), new SingleCardLabel(this.paymentsCardsHelper.b(bEUserCard), null, null, 0, 0, null, 62, null), 1, null), new LeadingSection(false, null, new n50.i.Icon(this.paymentsCardsHelper.d(bEUserCard), null, new c(bEUserCard), null, null, 26, null), 3, null), null, null, 3323, null);
        }
        LeadingSection leadingSection = new LeadingSection(false, null, new n50.i.Icon(this.paymentsCardsHelper.d(bEUserCard), null, new b(bEUserCard), null, null, 26, null), 3, null);
        return new DefaultSingleCardData(null, new er.a() { // from class: d42.l
            @Override // er.a
            public final Object a() {
                return m.h(pVar, bEUserCard);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.paymentsCardsHelper.c(bEUserCard.getCardNumberMasked()), this.paymentsCardsHelper.f(bEUserCard.getCardNumberMasked()), null, 0, 0, null, 60, null)), new SingleCardLabel(this.paymentsCardsHelper.b(bEUserCard), null, null, 0, 0, null, 62, null), 1, null), leadingSection, n50.x0.Icon.INSTANCE.b(), null, 2301, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(er.p pVar, BEUserCard bEUserCard) {
        pVar.B(bEUserCard.getCardTokenId(), bEUserCard.getTokenNumber());
        return oq.i0.f148189a;
    }

    private final BaseScaffoldData m(Params params, f.a state) {
        List<BEUserCard> listC = state.c();
        ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(f((BEUserCard) it.next(), params.h()));
        }
        CardListData cardListData = new CardListData(arrayList, null, false, null, null, 30, null);
        if (state.c().isEmpty()) {
            cardListData = null;
        }
        List<n50.k> listD = cardListData != null ? cardListData.d() : null;
        if (listD == null || listD.isEmpty()) {
            return new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(t32.b.f187503w0), null, null, null, 28, null), null, null, null, null, 61, null);
        }
        return new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(t32.b.f187503w0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216850f, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
    }

    public final Label i() {
        return this.labelProvider.c(t32.b.F);
    }

    public final Label l() {
        return this.labelProvider.c(t32.b.f187476n0);
    }

    public final Label q() {
        return this.labelProvider.c(t32.b.J);
    }

    @Override // er.l
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public k.a b(Params params) {
        f state = params.getState();
        if ((state instanceof Init) || (state instanceof Setup)) {
            return k.a.b.f39815a;
        }
        if (!(state instanceof f.a.Displayed) && !(state instanceof Loading)) {
            if (state instanceof Showing) {
                Showing showing = (Showing) state;
                return new k.a.WebView(new w70.c.Post(new d(), new e(params), null, showing.getBaseUrl(), showing.getBody(), 4, null), params.c());
            }
            if (state instanceof i.Dispatching) {
                return k.a.e.f39824a;
            }
            if (state instanceof Error) {
                return new k.a.Error(((Error) state).getErrorVMS());
            }
            if (state instanceof Error) {
                return new k.a.Error(((Error) state).getErrorVMS());
            }
            if (state instanceof i.Error) {
                return new k.a.Error(((i.Error) state).getErrorVMS());
            }
            if (state instanceof i.Loading) {
                return k.a.e.f39824a;
            }
            throw new oq.p();
        }
        er.a<oq.i0> aVarE = params.e();
        f.a aVar = (f.a) state;
        List<BEUserCard> listC = aVar.c();
        ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(f((BEUserCard) it.next(), params.h()));
        }
        CardListData cardListData = new CardListData(arrayList, null, false, null, null, 30, null);
        if (aVar.c().isEmpty()) {
            cardListData = null;
        }
        CardListData cardListData2 = cardListData;
        LeadingSection leadingSection = new LeadingSection(false, null, new n50.i.Icon(jz.a.E, null, null, null, null, 30, null), 3, null);
        BodySection bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(t32.b.Q), null, null, 0, 0, null, 62, null)), null, 5, null);
        n50.x0.Icon.Companion companion = n50.x0.Icon.INSTANCE;
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, params.g(), false, null, null, false, null, null, bodySection, leadingSection, companion.b(), null, 2301, null);
        LeadingSection leadingSection2 = new LeadingSection(false, null, new n50.i.Icon(jz.a.C, null, null, null, null, 30, null), 3, null);
        return new k.a.Initialized(aVarE, cardListData2, defaultSingleCardData, new DefaultSingleCardData(null, params.i(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(t32.b.R), null, null, 0, 0, null, 62, null)), null, 5, null), leadingSection2, companion.b(), null, 2301, null), m(params, aVar), aVar.getDialog());
    }
}
