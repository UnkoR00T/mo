package pc4;

import f24.DocumentConfigLabel;
import fr0.BEDocumentConfigLabel;
import g24.AdditionalLogo;
import g24.BarcodeSchema;
import g24.DocumentBottomAnnotation;
import g24.DocumentSchema;
import g24.DocumentSchemaBooleanTranslation;
import g24.DocumentSchemaEnumTranslation;
import g24.DocumentStaticSection;
import g24.DocumentTopAnnotation;
import g24.PictureSchema;
import gr0.BeAdditionalLogo;
import gr0.DocumentBottomAnnotationSection;
import gr0.DocumentDynamicSection;
import gr0.DocumentSchemaAttribute;
import gr0.DocumentSchemaForwardAttribute;
import gr0.DocumentSchemaLabel;
import gr0.DocumentsGroup;
import gr0.MissingDocumentAttribute;
import gr0.QrCodeSchema;
import h24.MultiDocumentSchema;
import h24.MultiDocumentSelectorLabel;
import h24.VerificationSelector;
import hr0.MultiDocumentView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000ø\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010\"\u001a\u00020!*\u00020 H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010&\u001a\u00020%*\u00020$H\u0002¢\u0006\u0004\b&\u0010'\u001a\u0013\u0010*\u001a\u00020)*\u00020(H\u0002¢\u0006\u0004\b*\u0010+\u001a\u0013\u0010.\u001a\u00020-*\u00020,H\u0002¢\u0006\u0004\b.\u0010/\u001a\u0013\u00102\u001a\u000201*\u000200H\u0002¢\u0006\u0004\b2\u00103\u001a\u0013\u00106\u001a\u000205*\u000204H\u0002¢\u0006\u0004\b6\u00107\u001a\u0013\u0010:\u001a\u000209*\u000208H\u0002¢\u0006\u0004\b:\u0010;\u001a\u0013\u0010>\u001a\u00020=*\u00020<H\u0002¢\u0006\u0004\b>\u0010?\u001a\u0013\u0010B\u001a\u00020A*\u00020@H\u0002¢\u0006\u0004\bB\u0010C\u001a\u0013\u0010F\u001a\u00020E*\u00020DH\u0002¢\u0006\u0004\bF\u0010G\u001a\u0013\u0010J\u001a\u00020I*\u00020HH\u0002¢\u0006\u0004\bJ\u0010K\u001a\u0013\u0010N\u001a\u00020M*\u00020LH\u0002¢\u0006\u0004\bN\u0010O\u001a\u0013\u0010R\u001a\u00020Q*\u00020PH\u0002¢\u0006\u0004\bR\u0010S\u001a\u0013\u0010V\u001a\u00020U*\u00020TH\u0002¢\u0006\u0004\bV\u0010W\u001a\u0013\u0010Z\u001a\u00020Y*\u00020XH\u0002¢\u0006\u0004\bZ\u0010[\u001a\u0013\u0010^\u001a\u00020]*\u00020\\H\u0002¢\u0006\u0004\b^\u0010_\u001a\u0013\u0010b\u001a\u00020a*\u00020`H\u0002¢\u0006\u0004\bb\u0010c\u001a\u0013\u0010f\u001a\u00020e*\u00020dH\u0002¢\u0006\u0004\bf\u0010g\u001a\u0013\u0010i\u001a\u00020!*\u00020hH\u0002¢\u0006\u0004\bi\u0010j\u001a\u0013\u0010m\u001a\u00020l*\u00020kH\u0002¢\u0006\u0004\bm\u0010n\u001a\u0013\u0010q\u001a\u00020p*\u00020oH\u0002¢\u0006\u0004\bq\u0010r\u001a\u0013\u0010u\u001a\u00020t*\u00020sH\u0002¢\u0006\u0004\bu\u0010v\u001a\u001d\u0010{\u001a\u000e\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020z0x*\u00020w¢\u0006\u0004\b{\u0010|¨\u0006}"}, d2 = {"Lgr0/h;", "Lg24/h;", "j", "(Lgr0/h;)Lg24/h;", "Lgr0/w;", "Lg24/t;", "w", "(Lgr0/w;)Lg24/t;", "Lgr0/b;", "Lg24/a;", "b", "(Lgr0/b;)Lg24/a;", "Lgr0/i;", "Lg24/i;", "z", "(Lgr0/i;)Lg24/i;", "Lgr0/s;", "Lg24/r;", "n", "(Lgr0/s;)Lg24/r;", "Lgr0/v;", "Lg24/s;", "q", "(Lgr0/v;)Lg24/s;", "Lgr0/v$a;", "Lg24/s$a;", "v", "(Lgr0/v$a;)Lg24/s$a;", "Lgr0/n;", "Lg24/n;", "B", "(Lgr0/n;)Lg24/n;", "Lgr0/n$a;", "Lg24/g;", "i", "(Lgr0/n$a;)Lg24/g;", "Lgr0/k;", "Lg24/k;", "p", "(Lgr0/k;)Lg24/k;", "Lgr0/j;", "Lg24/j;", "d", "(Lgr0/j;)Lg24/j;", "Lgr0/l;", "Lg24/l;", "A", "(Lgr0/l;)Lg24/l;", "Lgr0/p;", "Lg24/p;", "E", "(Lgr0/p;)Lg24/p;", "Lgr0/o;", "Lg24/o;", ip.a.f96138c, "(Lgr0/o;)Lg24/o;", "Lgr0/g;", "Lg24/f;", "o", "(Lgr0/g;)Lg24/f;", "Lgr0/x;", "Lg24/u;", "x", "(Lgr0/x;)Lg24/u;", "Lgr0/x$a;", "Lg24/u$a;", "y", "(Lgr0/x$a;)Lg24/u$a;", "Lgr0/a;", "Lg24/b;", "c", "(Lgr0/a;)Lg24/b;", "Lgr0/e;", "Lg24/d;", "e", "(Lgr0/e;)Lg24/d;", "Lgr0/f;", "Lg24/e;", "f", "(Lgr0/f;)Lg24/e;", "Lhr0/c;", "Lh24/c;", "u", "(Lhr0/c;)Lh24/c;", "Lgr0/m;", "Lg24/m;", "k", "(Lgr0/m;)Lg24/m;", "Lhr0/c$a;", "Lh24/c$a;", "r", "(Lhr0/c$a;)Lh24/c$a;", "Lhr0/d;", "Lh24/d;", "F", "(Lhr0/d;)Lh24/d;", "Lhr0/b;", "Lh24/b;", "t", "(Lhr0/b;)Lh24/b;", "Lfr0/f;", "Lf24/f;", "g", "(Lfr0/f;)Lf24/f;", "Lfr0/f$a;", "h", "(Lfr0/f$a;)Lg24/g;", "Lhr0/a;", "Lh24/a;", "s", "(Lhr0/a;)Lh24/a;", "Lgr0/q;", "Lg24/q;", "m", "(Lgr0/q;)Lg24/q;", "Lgr0/q$a;", "Lg24/q$a;", "C", "(Lgr0/q$a;)Lg24/q$a;", "Lrq0/b;", "Ldx/i;", "Ldx/b;", "Lf24/i;", "l", "(Lrq0/b;)Ldx/i;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j1 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f155031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f155032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f155033d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f155034e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f155035f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f155036g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f155037h;

        static {
            int[] iArr = new int[gr0.s.values().length];
            try {
                iArr[gr0.s.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gr0.s.NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gr0.s.DATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[gr0.s.DATE_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[gr0.s.NUMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[gr0.s.NOTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[gr0.s.ENUM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[gr0.s.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[gr0.s.MULTILINE_TEXT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[gr0.s.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f155030a = iArr;
            int[] iArr2 = new int[MissingDocumentAttribute.a.values().length];
            try {
                iArr2[MissingDocumentAttribute.a.HIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[MissingDocumentAttribute.a.DEFAULT_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[MissingDocumentAttribute.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            f155031b = iArr2;
            int[] iArr3 = new int[DocumentSchemaLabel.a.values().length];
            try {
                iArr3[DocumentSchemaLabel.a.PL.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[DocumentSchemaLabel.a.EN.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[DocumentSchemaLabel.a.UK.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[DocumentSchemaLabel.a.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            f155032c = iArr3;
            int[] iArr4 = new int[gr0.l.values().length];
            try {
                iArr4[gr0.l.UPPERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[gr0.l.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            f155033d = iArr4;
            int[] iArr5 = new int[QrCodeSchema.a.values().length];
            try {
                iArr5[QrCodeSchema.a.QR_CODE_V10.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[QrCodeSchema.a.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            f155034e = iArr5;
            int[] iArr6 = new int[MultiDocumentView.a.values().length];
            try {
                iArr6[MultiDocumentView.a.LEFT_TAB.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr6[MultiDocumentView.a.RIGHT_TAB.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr6[MultiDocumentView.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            f155035f = iArr6;
            int[] iArr7 = new int[BEDocumentConfigLabel.a.values().length];
            try {
                iArr7[BEDocumentConfigLabel.a.PL.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr7[BEDocumentConfigLabel.a.EN.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr7[BEDocumentConfigLabel.a.UK.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr7[BEDocumentConfigLabel.a.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            f155036g = iArr7;
            int[] iArr8 = new int[DocumentsGroup.a.values().length];
            try {
                iArr8[DocumentsGroup.a.ASC.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr8[DocumentsGroup.a.DESC.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr8[DocumentsGroup.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused31) {
            }
            f155037h = iArr8;
        }
    }

    private static final g24.l A(gr0.l lVar) {
        int i15 = a.f155033d[lVar.ordinal()];
        if (i15 == 1) {
            return g24.l.UPPERCASE;
        }
        if (i15 == 2) {
            return g24.l.UNKNOWN;
        }
        throw new oq.p();
    }

    private static final g24.DocumentSchemaLabel B(DocumentSchemaLabel documentSchemaLabel) {
        return new g24.DocumentSchemaLabel(i(documentSchemaLabel.getLanguage()), documentSchemaLabel.getValue());
    }

    private static final g24.DocumentsGroup.a C(DocumentsGroup.a aVar) {
        int i15 = a.f155037h[aVar.ordinal()];
        if (i15 == 1) {
            return g24.DocumentsGroup.a.ASC;
        }
        if (i15 == 2) {
            return g24.DocumentsGroup.a.DESC;
        }
        if (i15 == 3) {
            return g24.DocumentsGroup.a.UNKNOWN;
        }
        throw new oq.p();
    }

    private static final DocumentStaticSection D(gr0.DocumentStaticSection documentStaticSection) {
        List<DocumentSchemaLabel> listA = documentStaticSection.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(B((DocumentSchemaLabel) it.next()));
        }
        return new DocumentStaticSection(arrayList);
    }

    private static final DocumentTopAnnotation E(gr0.DocumentTopAnnotation documentTopAnnotation) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List<DocumentSchemaLabel> listD = documentTopAnnotation.d();
        if (listD != null) {
            List<DocumentSchemaLabel> list = listD;
            arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(B((DocumentSchemaLabel) it.next()));
            }
        } else {
            arrayList = null;
        }
        List<DocumentSchemaLabel> listB = documentTopAnnotation.b();
        if (listB != null) {
            List<DocumentSchemaLabel> list2 = listB;
            arrayList2 = new ArrayList(pq.v.y(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(B((DocumentSchemaLabel) it4.next()));
            }
        } else {
            arrayList2 = null;
        }
        List<gr0.DocumentStaticSection> listC = documentTopAnnotation.c();
        if (listC != null) {
            List<gr0.DocumentStaticSection> list3 = listC;
            arrayList3 = new ArrayList(pq.v.y(list3, 10));
            Iterator<T> it5 = list3.iterator();
            while (it5.hasNext()) {
                arrayList3.add(D((gr0.DocumentStaticSection) it5.next()));
            }
        } else {
            arrayList3 = null;
        }
        DocumentDynamicSection dynamicSections = documentTopAnnotation.getDynamicSections();
        return new DocumentTopAnnotation(arrayList, arrayList2, arrayList3, dynamicSections != null ? o(dynamicSections) : null);
    }

    private static final VerificationSelector F(hr0.VerificationSelector verificationSelector) {
        return new VerificationSelector(o(verificationSelector.getDynamicSections()), t(verificationSelector.getLabel()));
    }

    private static final AdditionalLogo b(BeAdditionalLogo beAdditionalLogo) {
        return new AdditionalLogo(beAdditionalLogo.getId(), beAdditionalLogo.getFieldReference());
    }

    private static final BarcodeSchema c(gr0.BarcodeSchema barcodeSchema) {
        String fieldReference = barcodeSchema.getFieldReference();
        List<DocumentSchemaLabel> listB = barcodeSchema.b();
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(B((DocumentSchemaLabel) it.next()));
        }
        return new BarcodeSchema(fieldReference, arrayList);
    }

    private static final DocumentSchemaBooleanTranslation d(gr0.DocumentSchemaBooleanTranslation documentSchemaBooleanTranslation) {
        List<DocumentSchemaLabel> listB = documentSchemaBooleanTranslation.b();
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(B((DocumentSchemaLabel) it.next()));
        }
        List<DocumentSchemaLabel> listA = documentSchemaBooleanTranslation.a();
        ArrayList arrayList2 = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it4 = listA.iterator();
        while (it4.hasNext()) {
            arrayList2.add(B((DocumentSchemaLabel) it4.next()));
        }
        return new DocumentSchemaBooleanTranslation(arrayList, arrayList2);
    }

    private static final DocumentBottomAnnotation e(gr0.DocumentBottomAnnotation documentBottomAnnotation) {
        List<DocumentBottomAnnotationSection> listA = documentBottomAnnotation.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(f((DocumentBottomAnnotationSection) it.next()));
        }
        return new DocumentBottomAnnotation(arrayList);
    }

    private static final g24.DocumentBottomAnnotationSection f(DocumentBottomAnnotationSection documentBottomAnnotationSection) {
        ArrayList arrayList;
        List<DocumentSchemaLabel> listA = documentBottomAnnotationSection.a();
        ArrayList arrayList2 = null;
        if (listA != null) {
            List<DocumentSchemaLabel> list = listA;
            arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(B((DocumentSchemaLabel) it.next()));
            }
        } else {
            arrayList = null;
        }
        String linkUrl = documentBottomAnnotationSection.getLinkUrl();
        List<DocumentSchemaLabel> listB = documentBottomAnnotationSection.b();
        if (listB != null) {
            List<DocumentSchemaLabel> list2 = listB;
            arrayList2 = new ArrayList(pq.v.y(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(B((DocumentSchemaLabel) it4.next()));
            }
        }
        return new g24.DocumentBottomAnnotationSection(arrayList, linkUrl, arrayList2);
    }

    private static final DocumentConfigLabel g(BEDocumentConfigLabel bEDocumentConfigLabel) {
        BEDocumentConfigLabel.a language = bEDocumentConfigLabel.getLanguage();
        return new DocumentConfigLabel(language != null ? h(language) : null, bEDocumentConfigLabel.getValue());
    }

    private static final g24.g h(BEDocumentConfigLabel.a aVar) {
        int i15 = a.f155036g[aVar.ordinal()];
        if (i15 == 1) {
            return g24.g.PL;
        }
        if (i15 == 2) {
            return g24.g.EN;
        }
        if (i15 == 3) {
            return g24.g.UK;
        }
        if (i15 == 4) {
            return g24.g.UNKNOWN;
        }
        throw new oq.p();
    }

    private static final g24.g i(DocumentSchemaLabel.a aVar) {
        int i15 = a.f155032c[aVar.ordinal()];
        if (i15 == 1) {
            return g24.g.PL;
        }
        if (i15 == 2) {
            return g24.g.EN;
        }
        if (i15 == 3) {
            return g24.g.UK;
        }
        if (i15 == 4) {
            return g24.g.UNKNOWN;
        }
        throw new oq.p();
    }

    public static final DocumentSchema j(gr0.DocumentSchema documentSchema) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String schemaId = documentSchema.getSchemaId();
        String schemaVersion = documentSchema.getSchemaVersion();
        String documentName = documentSchema.getDocumentName();
        PictureSchema pictureSchemaW = w(documentSchema.getPicture());
        String documentPeselFieldReference = documentSchema.getDocumentPeselFieldReference();
        hr0.VerificationSelector multiDocumentSelectorForVerification = documentSchema.getMultiDocumentSelectorForVerification();
        ArrayList arrayList4 = null;
        VerificationSelector verificationSelectorF = multiDocumentSelectorForVerification != null ? F(multiDocumentSelectorForVerification) : null;
        gr0.DocumentTopAnnotation topAnnotation = documentSchema.getTopAnnotation();
        DocumentTopAnnotation documentTopAnnotationE = topAnnotation != null ? E(topAnnotation) : null;
        QrCodeSchema qrCode = documentSchema.getQrCode();
        g24.QrCodeSchema qrCodeSchemaX = qrCode != null ? x(qrCode) : null;
        gr0.BarcodeSchema barcode = documentSchema.getBarcode();
        BarcodeSchema barcodeSchemaC = barcode != null ? c(barcode) : null;
        List<DocumentSchemaAttribute> listF = documentSchema.f();
        if (listF != null) {
            List<DocumentSchemaAttribute> list = listF;
            arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(z((DocumentSchemaAttribute) it.next()));
            }
        } else {
            arrayList = null;
        }
        List<DocumentSchemaLabel> listC = documentSchema.c();
        if (listC != null) {
            List<DocumentSchemaLabel> list2 = listC;
            arrayList2 = new ArrayList(pq.v.y(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(B((DocumentSchemaLabel) it4.next()));
            }
        } else {
            arrayList2 = null;
        }
        List<DocumentSchemaAttribute> listB = documentSchema.b();
        if (listB != null) {
            List<DocumentSchemaAttribute> list3 = listB;
            arrayList3 = new ArrayList(pq.v.y(list3, 10));
            Iterator<T> it5 = list3.iterator();
            while (it5.hasNext()) {
                arrayList3.add(z((DocumentSchemaAttribute) it5.next()));
            }
        } else {
            arrayList3 = null;
        }
        gr0.DocumentBottomAnnotation bottomAnnotation = documentSchema.getBottomAnnotation();
        DocumentBottomAnnotation documentBottomAnnotationE = bottomAnnotation != null ? e(bottomAnnotation) : null;
        MultiDocumentView multiDocumentView = documentSchema.getMultiDocumentView();
        h24.MultiDocumentView multiDocumentViewU = multiDocumentView != null ? u(multiDocumentView) : null;
        List<DocumentSchemaForwardAttribute> listI = documentSchema.i();
        if (listI != null) {
            List<DocumentSchemaForwardAttribute> list4 = listI;
            arrayList4 = new ArrayList(pq.v.y(list4, 10));
            Iterator<T> it6 = list4.iterator();
            while (it6.hasNext()) {
                arrayList4.add(k((DocumentSchemaForwardAttribute) it6.next()));
            }
        }
        return new DocumentSchema(schemaId, schemaVersion, documentName, arrayList4, pictureSchemaW, documentPeselFieldReference, verificationSelectorF, documentTopAnnotationE, qrCodeSchemaX, barcodeSchemaC, arrayList, arrayList2, arrayList3, null, documentBottomAnnotationE, multiDocumentViewU, PKIFailureInfo.certRevoked, null);
    }

    private static final g24.DocumentSchemaForwardAttribute k(DocumentSchemaForwardAttribute documentSchemaForwardAttribute) {
        List<DocumentSchemaLabel> listA = documentSchemaForwardAttribute.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(B((DocumentSchemaLabel) it.next()));
        }
        return new g24.DocumentSchemaForwardAttribute(arrayList);
    }

    public static final dx.i<dx.b, f24.i> l(rq0.b bVar) {
        Object objB;
        f24.i iVar;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    if (bVar == rq0.b.d.ID_CARD) {
                        iVar = f24.i.ID_CARD;
                    } else if (bVar == rq0.b.d.DRIVING_LICENCE) {
                        iVar = f24.i.DRIVING_LICENCE;
                    } else if (bVar == rq0.b.d.VEHICLE_CARD) {
                        iVar = f24.i.VEHICLE_CARD;
                    } else if (bVar == rq0.b.d.FAMILY_CARD) {
                        iVar = f24.i.FAMILY_CARD;
                    } else if (bVar == rq0.b.d.DIIA_REFUGEE_CARD) {
                        iVar = f24.i.REFUGEE_CARD;
                    } else if (bVar == rq0.b.d.DIIA_REFUGEE_CHILD_CARD) {
                        iVar = f24.i.REFUGEE_CHILD_CARD;
                    } else if (bVar == rq0.b.d.STUDENT_CARD) {
                        iVar = f24.i.STUDENT_CARD;
                    } else if (bVar == rq0.b.d.RAILWAY_CARD) {
                        iVar = f24.i.RAILWAY_CARD;
                    } else if (bVar == rq0.b.d.PENSIONER_CARD) {
                        iVar = f24.i.PENSIONER_CARD;
                    } else if (bVar == rq0.b.d.DEPUTY_CARD) {
                        iVar = f24.i.DEPUTY_CARD;
                    } else if (bVar == rq0.b.d.ADVOCATE_CARD) {
                        iVar = f24.i.ADVOCATE_CARD;
                    } else if (bVar == rq0.b.d.MIDWIFE_CARD) {
                        iVar = f24.i.MIDWIFE_CARD;
                    } else if (bVar == rq0.b.d.NURSE_CARD) {
                        iVar = f24.i.NURSE_CARD;
                    } else if (bVar == rq0.b.e.RASKA_SENIOR_LICENCE) {
                        iVar = f24.i.RASKA_SENIOR_LICENCE;
                    } else if (bVar == rq0.b.e.ZDUNSKOWOLSKA_RESIDENT_LICENCE) {
                        iVar = f24.i.ZDUNSKOWOLSKA_RESIDENT_LICENCE;
                    } else if (bVar == rq0.b.e.OLAWA_RESIDENT_LICENCE) {
                        iVar = f24.i.OLAWA_RESIDENT_LICENCE;
                    } else if (bVar == rq0.b.e.OLAWA_FAMILY_LICENCE) {
                        iVar = f24.i.OLAWA_FAMILY_LICENCE;
                    } else if (bVar == rq0.b.e.OLAWA_SENIOR_LICENCE) {
                        iVar = f24.i.OLAWA_SENIOR_LICENCE;
                    } else if (bVar == rq0.b.e.ZDUNSKOWOLSKA_FAMILY_LICENCE) {
                        iVar = f24.i.ZDUNSKOWOLSKA_FAMILY_LICENCE;
                    } else if (bVar == rq0.b.e.ZDUNSKOWOLSKA_SENIOR_LICENCE) {
                        iVar = f24.i.ZDUNSKOWOLSKA_SENIOR_LICENCE;
                    } else if (bVar == rq0.b.e.SUCHY_LAS_FAMILY_LICENCE) {
                        iVar = f24.i.SUCHY_LAS_FAMILY_LICENCE;
                    } else if (bVar == rq0.b.e.MIEJSKA_AUGUSTOW_TOURIST_LICENCE) {
                        iVar = f24.i.MIEJSKA_AUGUSTOW_TOURIST_LICENCE;
                    } else if (bVar == rq0.b.e.CHELM_FAMILY_LICENCE) {
                        iVar = f24.i.CHELM_FAMILY_LICENCE;
                    } else if (bVar == rq0.b.e.CHELM_SENIOR_LICENCE) {
                        iVar = f24.i.CHELM_SENIOR_LICENCE;
                    } else if (bVar == rq0.b.e.CHELM_RESIDENT_LICENCE) {
                        iVar = f24.i.CHELM_RESIDENT_LICENCE;
                    } else if (bVar == rq0.b.e.LODZ_SENIOR_LICENCE) {
                        iVar = f24.i.LODZ_SENIOR_LICENCE;
                    } else if (bVar == rq0.b.e.LODZ_FAMILY_LICENCE) {
                        iVar = f24.i.LODZ_FAMILY_LICENCE;
                    } else if (bVar == rq0.b.e.SENATOR_CARD) {
                        iVar = f24.i.SENATOR_CARD;
                    } else if (bVar == rq0.b.e.RACIBORSKA_RESIDENT_LICENCE) {
                        iVar = f24.i.RACIBORSKA_RESIDENT_LICENCE;
                    } else if (bVar == rq0.b.e.RACIBORSKA_SENIOR_LICENCE) {
                        iVar = f24.i.RACIBORSKA_SENIOR_LICENCE;
                    } else if (bVar == rq0.b.e.RACIBORSKA_FAMILY_LICENCE) {
                        iVar = f24.i.RACIBORSKA_FAMILY_LICENCE;
                    } else if (bVar == rq0.b.e.GIZYCKA_RESIDENT_LICENCE) {
                        iVar = f24.i.GIZYCKA_RESIDENT_LICENCE;
                    } else if (bVar == rq0.b.e.PZPN_LICENCE) {
                        iVar = f24.i.PZPN_LICENCE;
                    } else if (bVar == rq0.b.e.KOBYLKA_RESIDENT_LICENCE) {
                        iVar = f24.i.KOBYLKA_RESIDENT_LICENCE;
                    } else if (bVar == rq0.b.e.WROCLAWSKA_SENIOR_LICENCE) {
                        iVar = f24.i.WROCLAWSKA_SENIOR_LICENCE;
                    } else if (bVar == rq0.b.e.MIEKINIA_SENIOR_LICENCE) {
                        iVar = f24.i.MIEKINIA_SENIOR_LICENCE;
                    } else if (bVar == rq0.b.e.MIEKINIA_FAMILY_LICENCE) {
                        iVar = f24.i.MIEKINIA_FAMILY_LICENCE;
                    } else if (bVar == rq0.b.e.TOPR_LICENCE) {
                        iVar = f24.i.TOPR_LICENCE;
                    } else if (bVar == rq0.b.e.MAZOVIA_LICENCE) {
                        iVar = f24.i.MAZOVIA_LICENCE;
                    } else if (bVar == rq0.b.e.GENERAL_COUNSEL_LICENCE) {
                        iVar = f24.i.GENERAL_COUNSEL_LICENCE;
                    } else if (bVar == rq0.b.e.OLECKO_RESIDENT_LICENCE) {
                        iVar = f24.i.OLECKO_RESIDENT_LICENCE;
                    } else if (bVar == rq0.b.e.BYDGOSZCZ_FAMILY_LICENCE) {
                        iVar = f24.i.BYDGOSZCZ_FAMILY_LICENCE;
                    } else if (bVar == rq0.b.e.WODZISLAW_FAMILY_LICENCE) {
                        iVar = f24.i.WODZISLAW_FAMILY_LICENCE;
                    } else if (bVar == rq0.b.e.MICHALOWICE_RESIDENT_LICENCE) {
                        iVar = f24.i.MICHALOWICE_RESIDENT_LICENCE;
                    } else if (bVar == rq0.b.e.KOLEJE_DOLNOSLASKIE_LICENCE) {
                        iVar = f24.i.KOLEJE_DOLNOSLASKIE_LICENCE;
                    } else if (bVar == rq0.b.e.WISLA_RESIDENT_LICENCE) {
                        iVar = f24.i.WISLA_RESIDENT_LICENCE;
                    } else if (bVar == rq0.b.e.FIREFIGHTER_OSP_LICENCE) {
                        iVar = f24.i.FIREFIGHTER_OSP_LICENCE;
                    } else if (bVar == rq0.b.e.JASTRZEBIA_GORA_RESIDENT_LICENCE) {
                        iVar = f24.i.JASTRZEBIA_GORA_RESIDENT_LICENCE;
                    } else if (bVar == rq0.b.EnumC4479b.DOCTOR) {
                        iVar = f24.i.DOCTOR;
                    } else if (bVar == rq0.b.EnumC4479b.DENTIST) {
                        iVar = f24.i.DENTIST;
                    } else if (bVar == rq0.b.EnumC4479b.ATTORNEY_AT_LAW) {
                        iVar = f24.i.ATTORNEY_AT_LAW;
                    } else if (bVar == rq0.b.EnumC4479b.TRAINEE_ATTORNEY_AT_LAW) {
                        iVar = f24.i.TRAINEE_ATTORNEY_AT_LAW;
                    } else if (bVar == rq0.b.EnumC4479b.CIVIL_ENGINEER) {
                        iVar = f24.i.CIVIL_ENGINEER;
                    } else if (bVar == rq0.b.EnumC4479b.TAX_ADVISOR) {
                        iVar = f24.i.TAX_ADVISOR;
                    } else if (bVar == rq0.b.EnumC4479b.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP) {
                        iVar = f24.i.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP;
                    } else if (bVar == rq0.b.EnumC4479b.AUDITOR) {
                        iVar = f24.i.AUDITOR;
                    } else if (bVar == rq0.b.EnumC4479b.SOLIDARITY_CARD) {
                        iVar = f24.i.SOLIDARITY_CARD;
                    } else if (bVar == rq0.b.EnumC4479b.PHD_STUDENT) {
                        iVar = f24.i.PHD_STUDENT;
                    } else if (bVar == rq0.b.EnumC4479b.PHYSIOTHERAPIST) {
                        iVar = f24.i.PHYSIOTHERAPIST;
                    } else if (bVar == rq0.b.EnumC4479b.PHARMACIST) {
                        iVar = f24.i.PHARMACIST;
                    } else if (bVar == rq0.b.EnumC4479b.SHOOTING_LICENCE) {
                        iVar = f24.i.SHOOTING_LICENCE;
                    } else if (bVar == rq0.b.EnumC4479b.SPORT_SHOOTING_COMPETITOR_LICENCE) {
                        iVar = f24.i.SPORT_SHOOTING_COMPETITOR_LICENCE;
                    } else if (bVar == rq0.b.EnumC4479b.SPORT_SHOOTING_COACH_LICENCE) {
                        iVar = f24.i.SPORT_SHOOTING_COACH_LICENCE;
                    } else if (bVar == rq0.b.EnumC4479b.SPORT_SHOOTING_INSTRUCTOR_LICENCE) {
                        iVar = f24.i.SPORT_SHOOTING_INSTRUCTOR_LICENCE;
                    } else if (bVar == rq0.b.EnumC4479b.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING) {
                        iVar = f24.i.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING;
                    } else if (bVar == rq0.b.EnumC4479b.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING) {
                        iVar = f24.i.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING;
                    } else if (bVar == rq0.b.EnumC4479b.SPORT_SHOOTING_RANGE_OFFICER_LICENCE) {
                        iVar = f24.i.SPORT_SHOOTING_RANGE_OFFICER_LICENCE;
                    } else if (bVar == rq0.b.EnumC4479b.LABORATORY_DIAGNOSTICIAN) {
                        iVar = f24.i.LABORATORY_DIAGNOSTICIAN;
                    } else if (bVar == rq0.b.EnumC4479b.PENSIONER_MSWIA) {
                        iVar = f24.i.PENSIONER_MSWIA;
                    } else if (bVar == rq0.b.c.DISABLED_PERSON_IDENTIFICATION_CARD) {
                        iVar = f24.i.DISABLED_PERSON_IDENTIFICATION_CARD;
                    } else if (bVar == rq0.b.c.TEACHER) {
                        iVar = f24.i.TEACHER;
                    } else if (bVar == rq0.b.c.BAILIFF_CARD) {
                        iVar = f24.i.BAILIFF_CARD;
                    } else if (bVar == rq0.b.c.ELECTRONIC_DIPLOMA_GRADUATION) {
                        iVar = f24.i.ELECTRONIC_DIPLOMA_GRADUATION;
                    } else if (bVar == rq0.b.c.ELECTRONIC_DIPLOMA_PHD) {
                        iVar = f24.i.ELECTRONIC_DIPLOMA_PHD;
                    } else {
                        if (bVar != rq0.b.c.ELECTRONIC_DIPLOMA_DSC) {
                            if (bVar != rq0.b.c.DEFAULT && bVar != rq0.b.EnumC4479b.DEFAULT && bVar != rq0.b.d.SCHOOL_CARD) {
                                throw new oq.p();
                            }
                            aVar.b(new dx.b.Generic(new IllegalStateException(bVar.getReferenceName() + " is not supported in containers")));
                            throw new oq.g();
                        }
                        iVar = f24.i.ELECTRONIC_DIPLOMA_DSC;
                    }
                    return new dx.i.Right(iVar);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    private static final g24.DocumentsGroup m(DocumentsGroup documentsGroup) {
        g24.DocumentsGroup.a aVarC = C(documentsGroup.getSortOrder());
        List<DocumentSchemaLabel> listA = documentsGroup.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(B((DocumentSchemaLabel) it.next()));
        }
        return new g24.DocumentsGroup(aVarC, arrayList);
    }

    private static final g24.r n(gr0.s sVar) {
        switch (a.f155030a[sVar.ordinal()]) {
            case 1:
                return g24.r.TEXT;
            case 2:
                return g24.r.NAME;
            case 3:
                return g24.r.DATE;
            case 4:
                return g24.r.DATE_TIME;
            case 5:
                return g24.r.NUMBER;
            case 6:
                return g24.r.NOTE;
            case 7:
                return g24.r.ENUM;
            case 8:
                return g24.r.BOOLEAN;
            case 9:
                return g24.r.MULTILINE_TEXT;
            case 10:
                return g24.r.UNKNOWN;
            default:
                throw new oq.p();
        }
    }

    private static final g24.DocumentDynamicSection o(DocumentDynamicSection documentDynamicSection) {
        return new g24.DocumentDynamicSection(documentDynamicSection.c(), documentDynamicSection.a(), documentDynamicSection.b());
    }

    private static final DocumentSchemaEnumTranslation p(gr0.DocumentSchemaEnumTranslation documentSchemaEnumTranslation) {
        String enumValue = documentSchemaEnumTranslation.getEnumValue();
        List<DocumentSchemaLabel> listA = documentSchemaEnumTranslation.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(B((DocumentSchemaLabel) it.next()));
        }
        return new DocumentSchemaEnumTranslation(enumValue, arrayList);
    }

    private static final g24.MissingDocumentAttribute q(MissingDocumentAttribute missingDocumentAttribute) {
        g24.MissingDocumentAttribute.a aVarV = v(missingDocumentAttribute.getOnMissing());
        gr0.s dataType = missingDocumentAttribute.getDataType();
        return new g24.MissingDocumentAttribute(aVarV, dataType != null ? n(dataType) : null, missingDocumentAttribute.getDefaultValue());
    }

    private static final h24.MultiDocumentView.a r(MultiDocumentView.a aVar) {
        int i15 = a.f155035f[aVar.ordinal()];
        if (i15 == 1) {
            return h24.MultiDocumentView.a.LEFT_TAB;
        }
        if (i15 == 2) {
            return h24.MultiDocumentView.a.RIGHT_TAB;
        }
        if (i15 == 3) {
            return h24.MultiDocumentView.a.UNKNOWN;
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultiDocumentSchema s(hr0.MultiDocumentSchema multiDocumentSchema) {
        DocumentsGroup leftTab = multiDocumentSchema.getLeftTab();
        g24.DocumentsGroup documentsGroupM = leftTab != null ? m(leftTab) : null;
        DocumentsGroup rightTab = multiDocumentSchema.getRightTab();
        g24.DocumentsGroup documentsGroupM2 = rightTab != null ? m(rightTab) : null;
        hr0.VerificationSelector verificationSelector = multiDocumentSchema.getVerificationSelector();
        return new MultiDocumentSchema(documentsGroupM, documentsGroupM2, verificationSelector != null ? F(verificationSelector) : null);
    }

    private static final MultiDocumentSelectorLabel t(hr0.MultiDocumentSelectorLabel multiDocumentSelectorLabel) {
        ArrayList arrayList;
        List<BEDocumentConfigLabel> listA = multiDocumentSelectorLabel.a();
        ArrayList arrayList2 = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList2.add(g((BEDocumentConfigLabel) it.next()));
        }
        List<BEDocumentConfigLabel> listB = multiDocumentSelectorLabel.b();
        ArrayList arrayList3 = new ArrayList(pq.v.y(listB, 10));
        Iterator<T> it4 = listB.iterator();
        while (it4.hasNext()) {
            arrayList3.add(g((BEDocumentConfigLabel) it4.next()));
        }
        List<BEDocumentConfigLabel> listC = multiDocumentSelectorLabel.c();
        if (listC != null) {
            List<BEDocumentConfigLabel> list = listC;
            arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it5 = list.iterator();
            while (it5.hasNext()) {
                arrayList.add(g((BEDocumentConfigLabel) it5.next()));
            }
        } else {
            arrayList = null;
        }
        return new MultiDocumentSelectorLabel(arrayList2, arrayList3, arrayList);
    }

    private static final h24.MultiDocumentView u(MultiDocumentView multiDocumentView) {
        return new h24.MultiDocumentView(o(multiDocumentView.getDynamicSections()), r(multiDocumentView.getMultiDocumentGroup()));
    }

    private static final g24.MissingDocumentAttribute.a v(MissingDocumentAttribute.a aVar) {
        int i15 = a.f155031b[aVar.ordinal()];
        if (i15 == 1) {
            return g24.MissingDocumentAttribute.a.HIDE;
        }
        if (i15 == 2) {
            return g24.MissingDocumentAttribute.a.DEFAULT_VALUE;
        }
        if (i15 == 3) {
            return g24.MissingDocumentAttribute.a.UNKNOWN;
        }
        throw new oq.p();
    }

    private static final PictureSchema w(gr0.PictureSchema pictureSchema) {
        String pictureId = pictureSchema.getPictureId();
        String emblemTextHexColor = pictureSchema.getEmblemTextHexColor();
        String attributesValueTextHexColor = pictureSchema.getAttributesValueTextHexColor();
        String attributesTitleTextHexColor = pictureSchema.getAttributesTitleTextHexColor();
        List<DocumentSchemaAttribute> listB = pictureSchema.b();
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(z((DocumentSchemaAttribute) it.next()));
        }
        String sourceContainerRef = pictureSchema.getSourceContainerRef();
        List<BeAdditionalLogo> listA = pictureSchema.a();
        ArrayList arrayList2 = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it4 = listA.iterator();
        while (it4.hasNext()) {
            arrayList2.add(b((BeAdditionalLogo) it4.next()));
        }
        return new PictureSchema(pictureId, emblemTextHexColor, attributesValueTextHexColor, attributesTitleTextHexColor, arrayList, sourceContainerRef, arrayList2);
    }

    private static final g24.QrCodeSchema x(QrCodeSchema qrCodeSchema) {
        return new g24.QrCodeSchema(y(qrCodeSchema.getType()), qrCodeSchema.getFieldReference());
    }

    private static final g24.QrCodeSchema.a y(QrCodeSchema.a aVar) {
        int i15 = a.f155034e[aVar.ordinal()];
        if (i15 == 1) {
            return g24.QrCodeSchema.a.QR_CODE_V10;
        }
        if (i15 == 2) {
            return g24.QrCodeSchema.a.UNKNOWN;
        }
        throw new oq.p();
    }

    private static final g24.DocumentSchemaAttribute z(DocumentSchemaAttribute documentSchemaAttribute) {
        ArrayList arrayList;
        ArrayList arrayList2;
        g24.r rVarN = n(documentSchemaAttribute.getDataType());
        MissingDocumentAttribute onMissingAttribute = documentSchemaAttribute.getOnMissingAttribute();
        ArrayList arrayList3 = null;
        g24.MissingDocumentAttribute missingDocumentAttributeQ = onMissingAttribute != null ? q(onMissingAttribute) : null;
        List<DocumentSchemaLabel> listG = documentSchemaAttribute.g();
        ArrayList arrayList4 = new ArrayList(pq.v.y(listG, 10));
        Iterator<T> it = listG.iterator();
        while (it.hasNext()) {
            arrayList4.add(B((DocumentSchemaLabel) it.next()));
        }
        List<String> listE = documentSchemaAttribute.e();
        String fieldReference = documentSchemaAttribute.getFieldReference();
        List<gr0.DocumentSchemaEnumTranslation> listC = documentSchemaAttribute.c();
        if (listC != null) {
            List<gr0.DocumentSchemaEnumTranslation> list = listC;
            ArrayList arrayList5 = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList5.add(p((gr0.DocumentSchemaEnumTranslation) it4.next()));
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        List<gr0.DocumentSchemaBooleanTranslation> listA = documentSchemaAttribute.a();
        if (listA != null) {
            List<gr0.DocumentSchemaBooleanTranslation> list2 = listA;
            ArrayList arrayList6 = new ArrayList(pq.v.y(list2, 10));
            Iterator<T> it5 = list2.iterator();
            while (it5.hasNext()) {
                arrayList6.add(d((gr0.DocumentSchemaBooleanTranslation) it5.next()));
            }
            arrayList2 = arrayList6;
        } else {
            arrayList2 = null;
        }
        List<gr0.l> listF = documentSchemaAttribute.f();
        if (listF != null) {
            List<gr0.l> list3 = listF;
            arrayList3 = new ArrayList(pq.v.y(list3, 10));
            Iterator<T> it6 = list3.iterator();
            while (it6.hasNext()) {
                arrayList3.add(A((gr0.l) it6.next()));
            }
        }
        return new g24.DocumentSchemaAttribute(rVarN, missingDocumentAttributeQ, arrayList4, listE, fieldReference, arrayList, arrayList2, arrayList3);
    }
}
