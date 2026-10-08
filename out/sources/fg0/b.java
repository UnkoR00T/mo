package fg0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import qt3.BarcodeSchemaDto;
import qt3.DocumentBottomAnnotationDto;
import qt3.DocumentBottomAnnotationSectionDto;
import qt3.DocumentDynamicSectionDto;
import qt3.DocumentSchemaAttributeDto;
import qt3.DocumentSchemaBooleanTranslationDto;
import qt3.DocumentSchemaDto;
import qt3.DocumentSchemaEnumTranslationDto;
import qt3.DocumentSchemaLabel;
import qt3.DocumentSchemaLabelDto;
import qt3.DocumentStaticSectionDto;
import qt3.DocumentTopAnnotationDto;
import qt3.DocumentsGroupDto;
import qt3.LabelDto;
import qt3.MissingDocumentAttributeDto;
import qt3.MultiDocumentSchemaDto;
import qt3.MultiDocumentSelectorLabelDto;
import qt3.MultiDocumentViewDto;
import qt3.PictureSchemaDto;
import qt3.QrCodeSchemaDto;
import qt3.VerificationSelectorDto;
import qt3.c0;
import qt3.d0;
import qt3.g0;
import qt3.j;
import qt3.m0;
import qt3.n;
import qt3.q;
import qt3.u;
import yf0.BarcodeSchema;
import yf0.DocumentBottomAnnotation;
import yf0.DocumentBottomAnnotationSection;
import yf0.DocumentDynamicSection;
import yf0.DocumentSchema;
import yf0.DocumentSchemaAttribute;
import yf0.DocumentSchemaBooleanTranslation;
import yf0.DocumentSchemaEnumTranslation;
import yf0.DocumentStaticSection;
import yf0.DocumentTopAnnotation;
import yf0.DocumentsGroup;
import yf0.MissingDocumentAttribute;
import yf0.PictureSchema;
import yf0.QrCodeSchema;
import yf0.i;
import zf0.DocumentConfigLabel;
import zf0.MultiDocumentSchema;
import zf0.MultiDocumentSelectorLabel;
import zf0.MultiDocumentView;
import zf0.VerificationSelector;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Ø\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010\"\u001a\u00020!*\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010&\u001a\u00020%*\u00020$¢\u0006\u0004\b&\u0010'\u001a\u0011\u0010*\u001a\u00020)*\u00020(¢\u0006\u0004\b*\u0010+\u001a\u0011\u0010.\u001a\u00020-*\u00020,¢\u0006\u0004\b.\u0010/\u001a\u0011\u00102\u001a\u000201*\u000200¢\u0006\u0004\b2\u00103\u001a\u0011\u00106\u001a\u000205*\u000204¢\u0006\u0004\b6\u00107\u001a\u0011\u0010:\u001a\u000209*\u000208¢\u0006\u0004\b:\u0010;\u001a\u0011\u0010>\u001a\u00020=*\u00020<¢\u0006\u0004\b>\u0010?\u001a\u0011\u0010B\u001a\u00020A*\u00020@¢\u0006\u0004\bB\u0010C\u001a\u0011\u0010F\u001a\u00020E*\u00020D¢\u0006\u0004\bF\u0010G\u001a\u0011\u0010J\u001a\u00020I*\u00020H¢\u0006\u0004\bJ\u0010K\u001a\u0011\u0010M\u001a\u00020I*\u00020L¢\u0006\u0004\bM\u0010N\u001a\u0011\u0010Q\u001a\u00020P*\u00020O¢\u0006\u0004\bQ\u0010R\u001a\u0011\u0010U\u001a\u00020T*\u00020S¢\u0006\u0004\bU\u0010V\u001a\u0011\u0010Y\u001a\u00020X*\u00020W¢\u0006\u0004\bY\u0010Z\u001a\u0011\u0010]\u001a\u00020\\*\u00020[¢\u0006\u0004\b]\u0010^\u001a\u0011\u0010a\u001a\u00020`*\u00020_¢\u0006\u0004\ba\u0010b\u001a\u0011\u0010e\u001a\u00020d*\u00020c¢\u0006\u0004\be\u0010f\u001a\u0011\u0010i\u001a\u00020h*\u00020g¢\u0006\u0004\bi\u0010j\u001a\u0011\u0010m\u001a\u00020l*\u00020k¢\u0006\u0004\bm\u0010n\u001a\u0011\u0010q\u001a\u00020p*\u00020o¢\u0006\u0004\bq\u0010r¨\u0006s"}, d2 = {"Lqt3/l;", "Lyf0/e;", "e", "(Lqt3/l;)Lyf0/e;", "Lqt3/i;", "Lyf0/f;", "f", "(Lqt3/i;)Lyf0/f;", "Lqt3/s;", "Lyf0/l;", "n", "(Lqt3/s;)Lyf0/l;", "Lqt3/f;", "Lyf0/b;", "b", "(Lqt3/f;)Lyf0/b;", "Lqt3/j0;", "Lzf0/d;", "B", "(Lqt3/j0;)Lzf0/d;", "Lqt3/j;", "Lyf0/n;", "q", "(Lqt3/j;)Lyf0/n;", "Lqt3/g0;", "Lzf0/d$a;", "A", "(Lqt3/g0;)Lzf0/d$a;", "Lqt3/e0;", "Lyf0/o;", "s", "(Lqt3/e0;)Lyf0/o;", "Lqt3/l0;", "Lyf0/q;", "v", "(Lqt3/l0;)Lyf0/q;", "Lqt3/b;", "Lyf0/a;", "a", "(Lqt3/b;)Lyf0/a;", "Lqt3/m;", "Lyf0/h;", "h", "(Lqt3/m;)Lyf0/h;", "Lqt3/k;", "Lyf0/g;", "g", "(Lqt3/k;)Lyf0/g;", "Lqt3/n;", "Lyf0/i;", "i", "(Lqt3/n;)Lyf0/i;", "Lqt3/r;", "Lyf0/k;", "m", "(Lqt3/r;)Lyf0/k;", "Lqt3/g;", "Lyf0/c;", "c", "(Lqt3/g;)Lyf0/c;", "Lqt3/q;", "Lyf0/j$a;", "j", "(Lqt3/q;)Lyf0/j$a;", "Lqt3/d0;", "Lyf0/o$a;", "r", "(Lqt3/d0;)Lyf0/o$a;", "Lqt3/m0;", "Lyf0/q$a;", "u", "(Lqt3/m0;)Lyf0/q$a;", "Lqt3/p;", "Lyf0/j;", "l", "(Lqt3/p;)Lyf0/j;", "Lqt3/o;", "k", "(Lqt3/o;)Lyf0/j;", "Lqt3/h0;", "Lzf0/b;", "y", "(Lqt3/h0;)Lzf0/b;", "Lqt3/t;", "Lyf0/m;", "p", "(Lqt3/t;)Lyf0/m;", "Lqt3/u;", "Lyf0/m$a;", "o", "(Lqt3/u;)Lyf0/m$a;", "Lqt3/k0;", "Lyf0/p;", "t", "(Lqt3/k0;)Lyf0/p;", "Lqt3/r0;", "Lzf0/e;", "C", "(Lqt3/r0;)Lzf0/e;", "Lqt3/i0;", "Lzf0/c;", "z", "(Lqt3/i0;)Lzf0/c;", "Lqt3/b0;", "Lzf0/a;", "x", "(Lqt3/b0;)Lzf0/a;", "Lqt3/c0;", "Lzf0/a$a;", "w", "(Lqt3/c0;)Lzf0/a$a;", "Lqt3/h;", "Lyf0/d;", "d", "(Lqt3/h;)Lyf0/d;", "containers_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f62440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f62441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f62442c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f62443d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f62444e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f62445f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f62446g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f62447h;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.DATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j.DATE_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[j.NUMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[j.NOTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[j.ENUM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[j.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[j.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f62440a = iArr;
            int[] iArr2 = new int[g0.values().length];
            try {
                iArr2[g0.LEFT_TAB.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[g0.RIGHT_TAB.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[g0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            f62441b = iArr2;
            int[] iArr3 = new int[n.values().length];
            try {
                iArr3[n.UPPERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[n.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            f62442c = iArr3;
            int[] iArr4 = new int[q.values().length];
            try {
                iArr4[q.PL.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[q.UK.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[q.EN.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[q.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            f62443d = iArr4;
            int[] iArr5 = new int[d0.values().length];
            try {
                iArr5[d0.DEFAULT_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[d0.HIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[d0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            f62444e = iArr5;
            int[] iArr6 = new int[m0.values().length];
            try {
                iArr6[m0.QR_CODE_V10.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr6[m0.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            f62445f = iArr6;
            int[] iArr7 = new int[u.values().length];
            try {
                iArr7[u.ASC.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr7[u.DESC.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr7[u.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            f62446g = iArr7;
            int[] iArr8 = new int[c0.values().length];
            try {
                iArr8[c0.PL.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr8[c0.UK.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr8[c0.EN.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr8[c0.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused30) {
            }
            f62447h = iArr8;
        }
    }

    public static final MultiDocumentView.a A(g0 g0Var) {
        int i15 = a.f62441b[g0Var.ordinal()];
        if (i15 == 1) {
            return MultiDocumentView.a.LEFT_TAB;
        }
        if (i15 == 2) {
            return MultiDocumentView.a.RIGHT_TAB;
        }
        if (i15 == 3) {
            return MultiDocumentView.a.UNKNOWN;
        }
        throw new p();
    }

    public static final MultiDocumentView B(MultiDocumentViewDto multiDocumentViewDto) {
        return new MultiDocumentView(d(multiDocumentViewDto.getDynamicSections()), A(multiDocumentViewDto.getMultiDocumentGroup()));
    }

    public static final VerificationSelector C(VerificationSelectorDto verificationSelectorDto) {
        return new VerificationSelector(d(verificationSelectorDto.getDynamicSections()), z(verificationSelectorDto.getLabel()));
    }

    public static final BarcodeSchema a(BarcodeSchemaDto barcodeSchemaDto) {
        String fieldReference = barcodeSchemaDto.getFieldReference();
        List<DocumentSchemaLabelDto> listB = barcodeSchemaDto.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(l((DocumentSchemaLabelDto) it.next()));
        }
        return new BarcodeSchema(fieldReference, arrayList);
    }

    public static final DocumentBottomAnnotation b(DocumentBottomAnnotationDto documentBottomAnnotationDto) {
        List<DocumentBottomAnnotationSectionDto> listA = documentBottomAnnotationDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(c((DocumentBottomAnnotationSectionDto) it.next()));
        }
        return new DocumentBottomAnnotation(arrayList);
    }

    public static final DocumentBottomAnnotationSection c(DocumentBottomAnnotationSectionDto documentBottomAnnotationSectionDto) {
        ArrayList arrayList;
        List<DocumentSchemaLabel> listA = documentBottomAnnotationSectionDto.a();
        ArrayList arrayList2 = null;
        if (listA != null) {
            List<DocumentSchemaLabel> list = listA;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(k((DocumentSchemaLabel) it.next()));
            }
        } else {
            arrayList = null;
        }
        String linkUrl = documentBottomAnnotationSectionDto.getLinkUrl();
        List<DocumentSchemaLabel> listB = documentBottomAnnotationSectionDto.b();
        if (listB != null) {
            List<DocumentSchemaLabel> list2 = listB;
            arrayList2 = new ArrayList(v.y(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(k((DocumentSchemaLabel) it4.next()));
            }
        }
        return new DocumentBottomAnnotationSection(arrayList, linkUrl, arrayList2);
    }

    public static final DocumentDynamicSection d(DocumentDynamicSectionDto documentDynamicSectionDto) {
        return new DocumentDynamicSection(documentDynamicSectionDto.a());
    }

    public static final DocumentSchema e(DocumentSchemaDto documentSchemaDto) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String schemaId = documentSchemaDto.getSchemaId();
        String schemaVersion = documentSchemaDto.getSchemaVersion();
        String documentName = documentSchemaDto.getDocumentName();
        PictureSchema pictureSchemaT = t(documentSchemaDto.getPicture());
        String documentPeselFieldReference = documentSchemaDto.getDocumentPeselFieldReference();
        DocumentTopAnnotationDto topAnnotation = documentSchemaDto.getTopAnnotation();
        DocumentTopAnnotation documentTopAnnotationN = topAnnotation != null ? n(topAnnotation) : null;
        QrCodeSchemaDto qrCode = documentSchemaDto.getQrCode();
        QrCodeSchema qrCodeSchemaV = qrCode != null ? v(qrCode) : null;
        BarcodeSchemaDto barcode = documentSchemaDto.getBarcode();
        BarcodeSchema barcodeSchemaA = barcode != null ? a(barcode) : null;
        List<DocumentSchemaAttributeDto> listE = documentSchemaDto.e();
        if (listE != null) {
            List<DocumentSchemaAttributeDto> list = listE;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(f((DocumentSchemaAttributeDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        List<DocumentSchemaLabelDto> listB = documentSchemaDto.b();
        if (listB != null) {
            List<DocumentSchemaLabelDto> list2 = listB;
            arrayList2 = new ArrayList(v.y(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(l((DocumentSchemaLabelDto) it4.next()));
            }
        } else {
            arrayList2 = null;
        }
        List<DocumentSchemaAttributeDto> listA = documentSchemaDto.a();
        if (listA != null) {
            List<DocumentSchemaAttributeDto> list3 = listA;
            arrayList3 = new ArrayList(v.y(list3, 10));
            Iterator<T> it5 = list3.iterator();
            while (it5.hasNext()) {
                arrayList3.add(f((DocumentSchemaAttributeDto) it5.next()));
            }
        } else {
            arrayList3 = null;
        }
        DocumentBottomAnnotationDto bottomAnnotation = documentSchemaDto.getBottomAnnotation();
        DocumentBottomAnnotation documentBottomAnnotationB = bottomAnnotation != null ? b(bottomAnnotation) : null;
        MultiDocumentViewDto multiDocumentView = documentSchemaDto.getMultiDocumentView();
        return new DocumentSchema(schemaId, schemaVersion, documentName, pictureSchemaT, documentPeselFieldReference, null, documentTopAnnotationN, qrCodeSchemaV, barcodeSchemaA, arrayList, arrayList2, arrayList3, documentBottomAnnotationB, multiDocumentView != null ? B(multiDocumentView) : null, 32, null);
    }

    public static final DocumentSchemaAttribute f(DocumentSchemaAttributeDto documentSchemaAttributeDto) {
        ArrayList arrayList;
        ArrayList arrayList2;
        yf0.n nVarQ = q(documentSchemaAttributeDto.getDataType());
        List<DocumentSchemaLabelDto> listG = documentSchemaAttributeDto.g();
        ArrayList arrayList3 = new ArrayList(v.y(listG, 10));
        Iterator<T> it = listG.iterator();
        while (it.hasNext()) {
            arrayList3.add(l((DocumentSchemaLabelDto) it.next()));
        }
        MissingDocumentAttributeDto onMissingAttribute = documentSchemaAttributeDto.getOnMissingAttribute();
        ArrayList arrayList4 = null;
        MissingDocumentAttribute missingDocumentAttributeS = onMissingAttribute != null ? s(onMissingAttribute) : null;
        List<String> listE = documentSchemaAttributeDto.e();
        String fieldReference = documentSchemaAttributeDto.getFieldReference();
        List<DocumentSchemaEnumTranslationDto> listC = documentSchemaAttributeDto.c();
        if (listC != null) {
            List<DocumentSchemaEnumTranslationDto> list = listC;
            ArrayList arrayList5 = new ArrayList(v.y(list, 10));
            Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList5.add(h((DocumentSchemaEnumTranslationDto) it4.next()));
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        List<DocumentSchemaBooleanTranslationDto> listA = documentSchemaAttributeDto.a();
        if (listA != null) {
            List<DocumentSchemaBooleanTranslationDto> list2 = listA;
            ArrayList arrayList6 = new ArrayList(v.y(list2, 10));
            Iterator<T> it5 = list2.iterator();
            while (it5.hasNext()) {
                arrayList6.add(g((DocumentSchemaBooleanTranslationDto) it5.next()));
            }
            arrayList2 = arrayList6;
        } else {
            arrayList2 = null;
        }
        List<n> listF = documentSchemaAttributeDto.f();
        if (listF != null) {
            List<n> list3 = listF;
            arrayList4 = new ArrayList(v.y(list3, 10));
            Iterator<T> it6 = list3.iterator();
            while (it6.hasNext()) {
                arrayList4.add(i((n) it6.next()));
            }
        }
        return new DocumentSchemaAttribute(nVarQ, missingDocumentAttributeS, arrayList3, listE, fieldReference, arrayList, arrayList2, arrayList4);
    }

    public static final DocumentSchemaBooleanTranslation g(DocumentSchemaBooleanTranslationDto documentSchemaBooleanTranslationDto) {
        List<DocumentSchemaLabelDto> listB = documentSchemaBooleanTranslationDto.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(l((DocumentSchemaLabelDto) it.next()));
        }
        List<DocumentSchemaLabelDto> listA = documentSchemaBooleanTranslationDto.a();
        ArrayList arrayList2 = new ArrayList(v.y(listA, 10));
        Iterator<T> it4 = listA.iterator();
        while (it4.hasNext()) {
            arrayList2.add(l((DocumentSchemaLabelDto) it4.next()));
        }
        return new DocumentSchemaBooleanTranslation(arrayList, arrayList2);
    }

    public static final DocumentSchemaEnumTranslation h(DocumentSchemaEnumTranslationDto documentSchemaEnumTranslationDto) {
        String enumValue = documentSchemaEnumTranslationDto.getEnumValue();
        List<DocumentSchemaLabelDto> listA = documentSchemaEnumTranslationDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(l((DocumentSchemaLabelDto) it.next()));
        }
        return new DocumentSchemaEnumTranslation(enumValue, arrayList);
    }

    public static final i i(n nVar) {
        int i15 = a.f62442c[nVar.ordinal()];
        if (i15 == 1) {
            return i.UPPERCASE;
        }
        if (i15 == 2) {
            return i.UNKNOWN;
        }
        throw new p();
    }

    public static final yf0.DocumentSchemaLabel.a j(q qVar) {
        int i15 = a.f62443d[qVar.ordinal()];
        if (i15 == 1) {
            return yf0.DocumentSchemaLabel.a.PL;
        }
        if (i15 == 2) {
            return yf0.DocumentSchemaLabel.a.UK;
        }
        if (i15 == 3) {
            return yf0.DocumentSchemaLabel.a.EN;
        }
        if (i15 == 4) {
            return yf0.DocumentSchemaLabel.a.UNKNOWN;
        }
        throw new p();
    }

    public static final yf0.DocumentSchemaLabel k(DocumentSchemaLabel documentSchemaLabel) {
        return new yf0.DocumentSchemaLabel(j(documentSchemaLabel.getLanguage()), documentSchemaLabel.getValue());
    }

    public static final yf0.DocumentSchemaLabel l(DocumentSchemaLabelDto documentSchemaLabelDto) {
        return new yf0.DocumentSchemaLabel(j(documentSchemaLabelDto.getLanguage()), documentSchemaLabelDto.getValue());
    }

    public static final DocumentStaticSection m(DocumentStaticSectionDto documentStaticSectionDto) {
        List<DocumentSchemaLabelDto> listA = documentStaticSectionDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(l((DocumentSchemaLabelDto) it.next()));
        }
        return new DocumentStaticSection(arrayList);
    }

    public static final DocumentTopAnnotation n(DocumentTopAnnotationDto documentTopAnnotationDto) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List<DocumentSchemaLabelDto> listD = documentTopAnnotationDto.d();
        if (listD != null) {
            List<DocumentSchemaLabelDto> list = listD;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(l((DocumentSchemaLabelDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        List<DocumentSchemaLabelDto> listB = documentTopAnnotationDto.b();
        if (listB != null) {
            List<DocumentSchemaLabelDto> list2 = listB;
            arrayList2 = new ArrayList(v.y(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(l((DocumentSchemaLabelDto) it4.next()));
            }
        } else {
            arrayList2 = null;
        }
        List<DocumentStaticSectionDto> listC = documentTopAnnotationDto.c();
        if (listC != null) {
            List<DocumentStaticSectionDto> list3 = listC;
            arrayList3 = new ArrayList(v.y(list3, 10));
            Iterator<T> it5 = list3.iterator();
            while (it5.hasNext()) {
                arrayList3.add(m((DocumentStaticSectionDto) it5.next()));
            }
        } else {
            arrayList3 = null;
        }
        DocumentDynamicSectionDto dynamicSections = documentTopAnnotationDto.getDynamicSections();
        return new DocumentTopAnnotation(arrayList, arrayList2, arrayList3, dynamicSections != null ? d(dynamicSections) : null);
    }

    public static final DocumentsGroup.a o(u uVar) {
        int i15 = a.f62446g[uVar.ordinal()];
        if (i15 == 1) {
            return DocumentsGroup.a.ASC;
        }
        if (i15 == 2) {
            return DocumentsGroup.a.DESC;
        }
        if (i15 == 3) {
            return DocumentsGroup.a.UNKNOWN;
        }
        throw new p();
    }

    public static final DocumentsGroup p(DocumentsGroupDto documentsGroupDto) {
        DocumentsGroup.a aVarO = o(documentsGroupDto.getSortOrder());
        List<DocumentSchemaLabelDto> listA = documentsGroupDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(l((DocumentSchemaLabelDto) it.next()));
        }
        return new DocumentsGroup(aVarO, arrayList);
    }

    public static final yf0.n q(j jVar) {
        switch (a.f62440a[jVar.ordinal()]) {
            case 1:
                return yf0.n.TEXT;
            case 2:
                return yf0.n.NAME;
            case 3:
                return yf0.n.DATE;
            case 4:
                return yf0.n.DATE_TIME;
            case 5:
                return yf0.n.NUMBER;
            case 6:
                return yf0.n.NOTE;
            case 7:
                return yf0.n.ENUM;
            case 8:
                return yf0.n.BOOLEAN;
            case 9:
                return yf0.n.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final MissingDocumentAttribute.a r(d0 d0Var) {
        int i15 = a.f62444e[d0Var.ordinal()];
        if (i15 == 1) {
            return MissingDocumentAttribute.a.DEFAULT_VALUE;
        }
        if (i15 == 2) {
            return MissingDocumentAttribute.a.HIDE;
        }
        if (i15 == 3) {
            return MissingDocumentAttribute.a.UNKNOWN;
        }
        throw new p();
    }

    public static final MissingDocumentAttribute s(MissingDocumentAttributeDto missingDocumentAttributeDto) {
        MissingDocumentAttribute.a aVarR = r(missingDocumentAttributeDto.getOnMissing());
        j dataType = missingDocumentAttributeDto.getDataType();
        return new MissingDocumentAttribute(aVarR, dataType != null ? q(dataType) : null, missingDocumentAttributeDto.getDefaultValue());
    }

    public static final PictureSchema t(PictureSchemaDto pictureSchemaDto) {
        String pictureId = pictureSchemaDto.getPictureId();
        String emblemTextHexColor = pictureSchemaDto.getEmblemTextHexColor();
        String attributesValueTextHexColor = pictureSchemaDto.getAttributesValueTextHexColor();
        String attributesTitleTextHexColor = pictureSchemaDto.getAttributesTitleTextHexColor();
        List<DocumentSchemaAttributeDto> listA = pictureSchemaDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(f((DocumentSchemaAttributeDto) it.next()));
        }
        return new PictureSchema(pictureId, emblemTextHexColor, attributesValueTextHexColor, attributesTitleTextHexColor, arrayList, pictureSchemaDto.getSourceContainerRef());
    }

    public static final QrCodeSchema.a u(m0 m0Var) {
        int i15 = a.f62445f[m0Var.ordinal()];
        if (i15 == 1) {
            return QrCodeSchema.a.QR_CODE_V10;
        }
        if (i15 == 2) {
            return QrCodeSchema.a.UNKNOWN;
        }
        throw new p();
    }

    public static final QrCodeSchema v(QrCodeSchemaDto qrCodeSchemaDto) {
        return new QrCodeSchema(u(qrCodeSchemaDto.getType()), qrCodeSchemaDto.getFieldReference());
    }

    public static final DocumentConfigLabel.EnumC6332a w(c0 c0Var) {
        int i15 = a.f62447h[c0Var.ordinal()];
        if (i15 == 1) {
            return DocumentConfigLabel.EnumC6332a.PL;
        }
        if (i15 == 2) {
            return DocumentConfigLabel.EnumC6332a.UK;
        }
        if (i15 == 3) {
            return DocumentConfigLabel.EnumC6332a.EN;
        }
        if (i15 == 4) {
            return DocumentConfigLabel.EnumC6332a.UNKNOWN;
        }
        throw new p();
    }

    public static final DocumentConfigLabel x(LabelDto labelDto) {
        return new DocumentConfigLabel(w(labelDto.getLanguage()), labelDto.getValue());
    }

    public static final MultiDocumentSchema y(MultiDocumentSchemaDto multiDocumentSchemaDto) {
        DocumentsGroupDto leftTab = multiDocumentSchemaDto.getLeftTab();
        DocumentsGroup documentsGroupP = leftTab != null ? p(leftTab) : null;
        DocumentsGroupDto rightTab = multiDocumentSchemaDto.getRightTab();
        DocumentsGroup documentsGroupP2 = rightTab != null ? p(rightTab) : null;
        VerificationSelectorDto verificationSelector = multiDocumentSchemaDto.getVerificationSelector();
        return new MultiDocumentSchema(documentsGroupP, documentsGroupP2, verificationSelector != null ? C(verificationSelector) : null);
    }

    public static final MultiDocumentSelectorLabel z(MultiDocumentSelectorLabelDto multiDocumentSelectorLabelDto) {
        ArrayList arrayList;
        List<LabelDto> listA = multiDocumentSelectorLabelDto.a();
        ArrayList arrayList2 = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList2.add(x((LabelDto) it.next()));
        }
        List<LabelDto> listB = multiDocumentSelectorLabelDto.b();
        ArrayList arrayList3 = new ArrayList(v.y(listB, 10));
        Iterator<T> it4 = listB.iterator();
        while (it4.hasNext()) {
            arrayList3.add(x((LabelDto) it4.next()));
        }
        List<LabelDto> listC = multiDocumentSelectorLabelDto.c();
        if (listC != null) {
            List<LabelDto> list = listC;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it5 = list.iterator();
            while (it5.hasNext()) {
                arrayList.add(x((LabelDto) it5.next()));
            }
        } else {
            arrayList = null;
        }
        return new MultiDocumentSelectorLabel(arrayList2, arrayList3, arrayList);
    }
}
