package rb0;

import fr.t;
import fu.r;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import p071kotlin.Metadata;
import pe0.DocumentPhotoData;
import pe0.ItemData;
import pe0.VerificationDocumentData;
import pq.v;
import vf0.MainDocumentPhotoData;
import yf0.DocumentSchemaAttribute;
import yf0.MissingDocumentAttribute;
import yf0.n;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ%\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u0013*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lrb0/l;", "Lxw/f;", "Lrb0/l$a;", "Lpe0/d;", "Lez/e;", "dateFormatter", "Lrb0/j;", "dynamicDocumentSchemaDecoder", "<init>", "(Lez/e;Lrb0/j;)V", "Lqb0/k$b;", "data", "", "Lpe0/c;", "i", "(Lqb0/k$b;)Ljava/util/List;", "h", "Lyf0/o;", "missingAttribute", "", "attributeValue", "e", "(Lyf0/o;Ljava/lang/String;)Ljava/lang/String;", "Lyf0/n;", "defaultValue", "c", "(Lyf0/n;Ljava/lang/String;)Ljava/lang/String;", "params", "f", "(Lrb0/l$a;)Lpe0/d;", "a", "Lez/e;", "b", "Lrb0/j;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements xw.f<Params, VerificationDocumentData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j dynamicDocumentSchemaDecoder;

    /* JADX INFO: renamed from: rb0.l$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lrb0/l$a;", "", "Lqb0/k$c;", "state", "<init>", "(Lqb0/k$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqb0/k$c;", "()Lqb0/k$c;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final qb0.k.DocumentDisplayed state;

        public Params(qb0.k.DocumentDisplayed documentDisplayed) {
            this.state = documentDisplayed;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final qb0.k.DocumentDisplayed getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.state, ((Params) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f172915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f172916b;

        static {
            int[] iArr = new int[MissingDocumentAttribute.a.values().length];
            try {
                iArr[MissingDocumentAttribute.a.DEFAULT_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MissingDocumentAttribute.a.HIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f172915a = iArr;
            int[] iArr2 = new int[n.values().length];
            try {
                iArr2[n.DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[n.DATE_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f172916b = iArr2;
        }
    }

    public l(ez.e eVar, j jVar) {
        this.dateFormatter = eVar;
        this.dynamicDocumentSchemaDecoder = jVar;
    }

    private final String c(n nVar, String str) {
        int i15 = b.f172916b[nVar.ordinal()];
        if (i15 != 1) {
            return i15 != 2 ? str : this.dateFormatter.d(new fz.b.String(str, fz.c.OFFSET_DATE_TIME_SEC, false, 4, null), fz.c.DOTTED_TIME_PLUS_DATE);
        }
        return this.dateFormatter.d(new fz.b.String(str, fz.c.DASHED_REVERSED, false, 4, null), fz.c.DOTTED);
    }

    private final String e(MissingDocumentAttribute missingAttribute, String attributeValue) {
        if (attributeValue == null || r.t0(attributeValue)) {
            attributeValue = null;
        }
        if (attributeValue != null) {
            return attributeValue;
        }
        MissingDocumentAttribute.a onMissing = missingAttribute != null ? missingAttribute.getOnMissing() : null;
        int i15 = onMissing == null ? -1 : b.f172915a[onMissing.ordinal()];
        if (i15 != 1) {
            if (i15 != 2) {
                return Label.INSTANCE.b().getText();
            }
            return null;
        }
        n dataType = missingAttribute.getDataType();
        if (dataType == null) {
            return null;
        }
        String defaultValue = missingAttribute.getDefaultValue();
        if (defaultValue == null) {
            defaultValue = Label.INSTANCE.c().getText();
        }
        return c(dataType, defaultValue);
    }

    private final List<ItemData> h(qb0.k.DocumentData data) {
        List<DocumentSchemaAttribute> listD = data.getDocumentSchema().d();
        if (listD == null) {
            return v.n();
        }
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        for (Object obj : listD) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            DocumentSchemaAttribute documentSchemaAttribute = (DocumentSchemaAttribute) obj;
            String strE = e(documentSchemaAttribute.getOnMissingAttribute(), this.dynamicDocumentSchemaDecoder.b(documentSchemaAttribute.getDataType(), documentSchemaAttribute.getFieldReference(), documentSchemaAttribute.e(), documentSchemaAttribute.c(), data.getRawDocumentData(), documentSchemaAttribute.a()));
            ItemData itemData = strE != null ? new ItemData(mx.b.d(this.dynamicDocumentSchemaDecoder.a(documentSchemaAttribute.g()), "commonAttributeTitle_" + i15), mx.b.b(strE, "attributeValue_" + i15)) : null;
            if (itemData != null) {
                arrayList.add(itemData);
            }
            i15 = i16;
        }
        return arrayList;
    }

    private final List<ItemData> i(qb0.k.DocumentData data) {
        List<DocumentSchemaAttribute> listA = data.getDocumentSchema().getPicture().a();
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        for (Object obj : listA) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            DocumentSchemaAttribute documentSchemaAttribute = (DocumentSchemaAttribute) obj;
            String strE = e(documentSchemaAttribute.getOnMissingAttribute(), this.dynamicDocumentSchemaDecoder.b(documentSchemaAttribute.getDataType(), documentSchemaAttribute.getFieldReference(), documentSchemaAttribute.e(), documentSchemaAttribute.c(), data.getRawDocumentData(), documentSchemaAttribute.a()));
            ItemData itemData = strE != null ? new ItemData(mx.b.d(this.dynamicDocumentSchemaDecoder.a(documentSchemaAttribute.g()), "pictureAttribute_" + i15), mx.b.b(strE, "attributeValue_" + i15)) : null;
            if (itemData != null) {
                arrayList.add(itemData);
            }
            i15 = i16;
        }
        return arrayList;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public VerificationDocumentData b(Params params) {
        String documentId = params.getState().getData().getDocumentId();
        pe0.e eVar = pe0.e.DISABLED_PERSON_IDENTIFICATION_CARD;
        Label labelD = mx.b.d(params.getState().getData().getDocumentSchema().getDocumentName(), "documentName");
        int i15 = jz.a.f106731a3;
        String scopeName = params.getState().getData().getScopeName();
        MainDocumentPhotoData documentPhoto = params.getState().getData().getDocumentPhoto();
        return new VerificationDocumentData(documentId, eVar, labelD, i15, scopeName, documentPhoto != null ? new DocumentPhotoData(documentPhoto.getPhoto(), documentPhoto.getDocumentId(), documentPhoto.getScopeName()) : null, v.L0(i(params.getState().getData()), h(params.getState().getData())), params.getState().getData().getDocumentSchema().getSchemaId(), null, 256, null);
    }
}
