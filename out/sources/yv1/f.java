package yv1;

import android.graphics.Bitmap;
import er.p;
import fr.t;
import gv1.DocumentSchema;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import lv1.DynamicDocument;
import lz3.h;
import mv1.DynamicDocumentData;
import mx.Label;
import n30.CardListData;
import n50.CustomSingleCardData;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import r50.g;
import sv1.DynamicDocumentsListCustomContentData;
import x50.NavigationButtonData;
import x50.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001&B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0016\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010 \u001a\u00020\u001f*\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u00020\u001f*\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010!J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lyv1/f;", "Lxw/f;", "Lyv1/f$a;", "Lxv1/d$a;", "Lmx/c;", "labelProvider", "Lrz/a;", "bitmapDecoder", "Liy/a;", "base64Coder", "Ltv1/e;", "decoder", "<init>", "(Lmx/c;Lrz/a;Liy/a;Ltv1/e;)V", "", "shortDocumentName", "Lgv1/i;", "schema", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Li50/a;", "e", "(Ljava/lang/String;Lgv1/i;Ler/a;)Li50/a;", "Lmv1/c;", "documentData", "Landroid/graphics/Bitmap;", "i", "(Lmv1/c;)Landroid/graphics/Bitmap;", "", "index", "Lmx/a;", "h", "(Lmv1/c;I)Lmx/a;", "f", "params", "l", "(Lyv1/f$a;)Lxv1/d$a;", "a", "Lmx/c;", "b", "Lrz/a;", "c", "Liy/a;", "d", "Ltv1/e;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, xv1.d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rz.a bitmapDecoder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final tv1.e decoder;

    /* JADX INFO: renamed from: yv1.f$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR+\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0017\u0010\u001d¨\u0006!"}, d2 = {"Lyv1/f$a;", "", "Lxv1/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lkotlin/Function2;", "", "Llz3/h;", "onDocumentCardClick", "onAddNewSchoolCardClick", "<init>", "(Lxv1/c;Ler/a;Ler/p;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxv1/c;", "d", "()Lxv1/c;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/p;", "()Ler/p;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final xv1.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<String, h, i0> onDocumentCardClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddNewSchoolCardClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(xv1.c cVar, er.a<i0> aVar, p<? super String, ? super h, i0> pVar, er.a<i0> aVar2) {
            this.state = cVar;
            this.onBackClick = aVar;
            this.onDocumentCardClick = pVar;
            this.onAddNewSchoolCardClick = aVar2;
        }

        public final er.a<i0> a() {
            return this.onAddNewSchoolCardClick;
        }

        public final er.a<i0> b() {
            return this.onBackClick;
        }

        public final p<String, h, i0> c() {
            return this.onDocumentCardClick;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final xv1.c getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onDocumentCardClick, params.onDocumentCardClick) && t.c(this.onAddNewSchoolCardClick, params.onAddNewSchoolCardClick);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onDocumentCardClick.hashCode()) * 31) + this.onAddNewSchoolCardClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onDocumentCardClick=" + this.onDocumentCardClick + ", onAddNewSchoolCardClick=" + this.onAddNewSchoolCardClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f229963a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.REVOKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.CREATING_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.NOT_READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.ALREADY_DOWNLOADED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.TAKES_TOO_LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f229963a = iArr;
        }
    }

    public f(mx.c cVar, rz.a aVar, iy.a aVar2, tv1.e eVar) {
        this.labelProvider = cVar;
        this.bitmapDecoder = aVar;
        this.base64Coder = aVar2;
        this.decoder = eVar;
    }

    private final BaseScaffoldData e(String shortDocumentName, DocumentSchema schema, er.a<i0> onBack) {
        if (shortDocumentName == null) {
            shortDocumentName = schema != null ? schema.getDocumentName() : null;
        }
        return new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), onBack), shortDocumentName != null ? mx.b.d(shortDocumentName, "topBarTitle") : null, null, null, null, 28, null), null, null, null, null, 61, null);
    }

    private final Label f(DynamicDocumentData dynamicDocumentData, int i15) {
        String strA = this.decoder.a(dynamicDocumentData);
        String upperCase = strA != null ? strA.toUpperCase(Locale.ROOT) : null;
        if (upperCase == null) {
            upperCase = this.labelProvider.c(dv1.a.f44650n0).getText();
        }
        return mx.b.b(upperCase, "school_card_description_" + i15);
    }

    private final Label h(DynamicDocumentData dynamicDocumentData, int i15) {
        String strB = this.decoder.b(dynamicDocumentData);
        String strC = this.decoder.c(dynamicDocumentData);
        String text = strC + ' ' + strB;
        if (strB == null || strC == null) {
            text = null;
        }
        if (text == null) {
            text = this.labelProvider.c(dv1.a.f44650n0).getText();
        }
        return mx.b.b(text, "school_card_title_" + i15);
    }

    private final Bitmap i(DynamicDocumentData documentData) {
        Object objB;
        String strD = this.decoder.d(documentData);
        rz.a aVar = this.bitmapDecoder;
        dx.i iVarC = iy.a.c(this.base64Coder, strD, null, 2, null);
        if (iVarC instanceof dx.i.Left) {
            objB = new byte[0];
        } else {
            if (!(iVarC instanceof dx.i.Right)) {
                throw new oq.p();
            }
            objB = ((dx.i.Right) iVarC).b();
        }
        return aVar.a((byte[]) objB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, DynamicDocumentData dynamicDocumentData, h hVar) {
        params.c().B(dynamicDocumentData.getDocumentId(), hVar);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public xv1.d.a b(final Params params) {
        r50.a.WithIcon withIcon;
        DynamicDocumentData dynamicDocumentDataC;
        xv1.c state = params.getState();
        if (t.c(state, xv1.c.a.f221466a)) {
            return new xv1.d.a.Initial(params.b());
        }
        if (!(state instanceof xv1.c.b)) {
            throw new oq.p();
        }
        er.a<i0> aVarB = params.b();
        xv1.c.b bVar = (xv1.c.b) state;
        String documentShortName = bVar.getDocumentShortName();
        DynamicDocument dynamicDocument = (DynamicDocument) v.n0(bVar.b());
        BaseScaffoldData baseScaffoldDataE = e(documentShortName, (dynamicDocument == null || (dynamicDocumentDataC = dynamicDocument.c()) == null) ? null : dynamicDocumentDataC.getSchema(), params.b());
        List<DynamicDocument> listB = bVar.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        int i15 = 0;
        for (Object obj : listB) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            DynamicDocument dynamicDocument2 = (DynamicDocument) obj;
            final h status = dynamicDocument2.getStatus();
            final DynamicDocumentData data = dynamicDocument2.getData();
            Label labelH = h(data, i15);
            Label labelF = f(data, i15);
            Bitmap bitmapI = i(data);
            int i17 = status == null ? -1 : b.f229963a[status.ordinal()];
            if (i17 == 1) {
                withIcon = new r50.a.WithIcon(null, this.labelProvider.c(dv1.a.f44667y), null, 0, false, g.NOTICE, 13, null);
            } else if (i17 == 2) {
                withIcon = new r50.a.WithIcon(null, this.labelProvider.c(dv1.a.f44664v), null, 0, false, g.NEGATIVE, 13, null);
            } else if (i17 == 3) {
                withIcon = new r50.a.WithIcon(null, this.labelProvider.c(dv1.a.f44665w), null, 0, false, g.NOTICE, 13, null);
            } else if (i17 != 4) {
                withIcon = i17 != 5 ? null : new r50.a.WithIcon(null, this.labelProvider.c(dv1.a.f44666x), null, 0, false, g.NOTICE, 13, null);
            } else {
                withIcon = new r50.a.WithIcon(null, this.labelProvider.c(dv1.a.f44663u), null, 0, false, g.POSITIVE, 13, null);
            }
            arrayList.add(new CustomSingleCardData("school_card_" + i15, new sv1.b(new DynamicDocumentsListCustomContentData(labelH, labelF, withIcon, bitmapI)), new er.a() { // from class: yv1.e
                @Override // er.a
                public final Object a() {
                    return f.m(params, data, status);
                }
            }, false, null, null, false, null, 248, null));
            i15 = i16;
        }
        return new xv1.d.a.Initialized(aVarB, baseScaffoldDataE, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(dv1.a.f44625b), null, 2, null), k30.d.a.f107773a, null, params.a(), 35, null), new CardListData(arrayList, null, false, null, null, 30, null), params.getState() instanceof xv1.c.b.Dialog ? ((xv1.c.b.Dialog) params.getState()).getDialog() : null);
    }
}
