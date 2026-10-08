package p32;

import eo0.DeliveryMessageDetailsEvidence;
import eo0.c0;
import eo0.y0;
import er.l;
import fo0.MessageLabel;
import fr.t;
import h30.ButtonData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import o32.State;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lp32/b;", "Lxw/f;", "Lp32/b$a;", "Ln30/b;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Lkotlin/Function0;", "Loq/i0;", "onDownloadClick", "Ln50/g;", "e", "(Lmx/a;Ler/a;)Ln50/g;", "params", "f", "(Lp32/b$a;)Ln30/b;", "a", "Lmx/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements xw.f<Params, CardListData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: p32.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, d2 = {"Lp32/b$a;", "", "Lo32/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "downloadTechnicalEvidencesArchive", "downloadUpoDocumentClick", "downloadUpoPreviewClick", "Lkotlin/Function1;", "Leo0/c0;", "getTechnicalEvidenceFile", "<init>", "(Lo32/b;Ler/a;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo32/b;", "e", "()Lo32/b;", "b", "Ler/a;", "()Ler/a;", "c", "d", "Ler/l;", "()Ler/l;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> downloadTechnicalEvidencesArchive;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> downloadUpoDocumentClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> downloadUpoPreviewClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<c0, i0> getTechnicalEvidenceFile;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super c0, i0> lVar) {
            this.state = state;
            this.downloadTechnicalEvidencesArchive = aVar;
            this.downloadUpoDocumentClick = aVar2;
            this.downloadUpoPreviewClick = aVar3;
            this.getTechnicalEvidenceFile = lVar;
        }

        public final er.a<i0> a() {
            return this.downloadTechnicalEvidencesArchive;
        }

        public final er.a<i0> b() {
            return this.downloadUpoDocumentClick;
        }

        public final er.a<i0> c() {
            return this.downloadUpoPreviewClick;
        }

        public final l<c0, i0> d() {
            return this.getTechnicalEvidenceFile;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final State getState() {
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
            return t.c(this.state, params.state) && t.c(this.downloadTechnicalEvidencesArchive, params.downloadTechnicalEvidencesArchive) && t.c(this.downloadUpoDocumentClick, params.downloadUpoDocumentClick) && t.c(this.downloadUpoPreviewClick, params.downloadUpoPreviewClick) && t.c(this.getTechnicalEvidenceFile, params.getTechnicalEvidenceFile);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.downloadTechnicalEvidencesArchive.hashCode()) * 31) + this.downloadUpoDocumentClick.hashCode()) * 31) + this.downloadUpoPreviewClick.hashCode()) * 31) + this.getTechnicalEvidenceFile.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", downloadTechnicalEvidencesArchive=" + this.downloadTechnicalEvidencesArchive + ", downloadUpoDocumentClick=" + this.downloadUpoDocumentClick + ", downloadUpoPreviewClick=" + this.downloadUpoPreviewClick + ", getTechnicalEvidenceFile=" + this.getTechnicalEvidenceFile + ')';
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final DefaultSingleCardData e(Label label, er.a<i0> onDownloadClick) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(label, null, null, 0, 0, null, 62, null)), null, 5, null), null, new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(e02.a.f46604s), null, 2, null), k30.d.a.f107773a, null, onDownloadClick, 35, null)), null, 2815, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, DeliveryMessageDetailsEvidence deliveryMessageDetailsEvidence) {
        params.d().b(c0.a(deliveryMessageDetailsEvidence.getId()));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public CardListData b(final Params params) {
        State state = params.getState();
        List listC = v.c();
        if (state.getDetails().getDeliveryMessage().getServiceType() == y0.E_DELIVERY) {
            List<MessageLabel> listD = state.getDetails().getDeliveryMessage().d();
            if (!(listD instanceof Collection) || !listD.isEmpty()) {
                for (MessageLabel messageLabel : listD) {
                    if (messageLabel.getType() == fo0.f.INBOX || messageLabel.getType() == fo0.f.SENT) {
                        listC.add(e(this.labelProvider.c(e02.a.f46645y4), params.a()));
                        break;
                    }
                }
            }
        }
        if (state.getDetails().getDeliveryMessage().getServiceType() == y0.E_DELIVERY) {
            List<MessageLabel> listD2 = state.getDetails().getDeliveryMessage().d();
            if (!(listD2 instanceof Collection) || !listD2.isEmpty()) {
                Iterator<T> it = listD2.iterator();
                while (it.hasNext()) {
                    if (((MessageLabel) it.next()).getType() == fo0.f.SENT) {
                        List<DeliveryMessageDetailsEvidence> listF = state.getDetails().f();
                        ArrayList arrayList = new ArrayList(v.y(listF, 10));
                        for (final DeliveryMessageDetailsEvidence deliveryMessageDetailsEvidence : listF) {
                            arrayList.add(Boolean.valueOf(listC.add(e(mx.b.b(deliveryMessageDetailsEvidence.getDescription(), "fileName"), new er.a() { // from class: p32.a
                                @Override // er.a
                                public final Object a() {
                                    return b.h(params, deliveryMessageDetailsEvidence);
                                }
                            }))));
                        }
                        break;
                    }
                }
            }
        }
        if (state.getDetails().getDeliveryMessage().getServiceType() == y0.E_PUAP) {
            List<MessageLabel> listD3 = state.getDetails().getDeliveryMessage().d();
            if (!(listD3 instanceof Collection) || !listD3.isEmpty()) {
                for (MessageLabel messageLabel2 : listD3) {
                    if (messageLabel2.getType() == fo0.f.INBOX || messageLabel2.getType() == fo0.f.SENT) {
                        listC.addAll(v.q(e(this.labelProvider.c(e02.a.S2), params.b()), e(this.labelProvider.c(e02.a.f46529f2), params.c())));
                        break;
                    }
                }
            }
        }
        return new CardListData(v.a(listC), null, false, null, null, 30, null);
    }
}
