package nr0;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import gr0.BarcodeSchema;
import gr0.BeAdditionalLogo;
import gr0.DocumentActionAttribute;
import gr0.DocumentBottomAnnotation;
import gr0.DocumentBottomAnnotationSection;
import gr0.DocumentDynamicSection;
import gr0.DocumentSchema;
import gr0.DocumentSchemaAttribute;
import gr0.DocumentSchemaBooleanTranslation;
import gr0.DocumentSchemaEnumTranslation;
import gr0.DocumentSchemaForwardAttribute;
import gr0.DocumentSchemaLabel;
import gr0.DocumentStaticSection;
import gr0.DocumentTopAnnotation;
import gr0.DocumentsGroup;
import gr0.MissingDocumentAttribute;
import gr0.PictureSchema;
import gr0.QrCodeSchema;
import gr0.l;
import gr0.s;
import hr0.MultiDocumentSchema;
import hr0.MultiDocumentView;
import hr0.VerificationSelector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.p;
import or0.AdditionalLogoDtoDto;
import or0.BarcodeSchemaDtoDto;
import or0.DocumentBottomAnnotationDtoDto;
import or0.DocumentBottomAnnotationSectionDtoDto;
import or0.DocumentDynamicSectionDtoDto;
import or0.DocumentSchemaActionAttributeDtoDto;
import or0.DocumentSchemaAttributeDtoDto;
import or0.DocumentSchemaBooleanTranslationDtoDto;
import or0.DocumentSchemaDtoDto;
import or0.DocumentSchemaEnumTranslationDtoDto;
import or0.DocumentSchemaForwardAttributeDtoDto;
import or0.DocumentSchemaLabelDto;
import or0.DocumentSchemaLabelDtoDto;
import or0.DocumentStaticSectionDtoDto;
import or0.DocumentTopAnnotationDtoDto;
import or0.DocumentsGroupDtoDto;
import or0.MissingDocumentAttributeDtoDto;
import or0.MultiDocumentSchemaDtoDto;
import or0.MultiDocumentViewDtoDto;
import or0.PictureSchemaDtoDto;
import or0.QrCodeSchemaDtoDto;
import or0.VerificationSelectorDtoDto;
import or0.d0;
import or0.e1;
import or0.v;
import or0.w0;
import or0.y0;
import or0.z;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000´\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0006*\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0010\u001a\u00020\f*\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0014\u001a\u00020\u0013*\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0018\u001a\u00020\u0017*\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0011\u0010\u001a\u001a\u00020\u0016*\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010 \u001a\u00020\u001c*\u00020\u001d¢\u0006\u0004\b \u0010!\u001a\u0011\u0010$\u001a\u00020#*\u00020\"¢\u0006\u0004\b$\u0010%\u001a\u0011\u0010&\u001a\u00020\"*\u00020#¢\u0006\u0004\b&\u0010'\u001a\u0011\u0010*\u001a\u00020)*\u00020(¢\u0006\u0004\b*\u0010+\u001a\u0011\u0010,\u001a\u00020(*\u00020)¢\u0006\u0004\b,\u0010-\u001a\u0011\u00100\u001a\u00020/*\u00020.¢\u0006\u0004\b0\u00101\u001a\u0011\u00102\u001a\u00020.*\u00020/¢\u0006\u0004\b2\u00103\u001a\u0011\u00106\u001a\u000205*\u000204¢\u0006\u0004\b6\u00107\u001a\u0011\u00108\u001a\u000204*\u000205¢\u0006\u0004\b8\u00109\u001a\u0011\u0010<\u001a\u00020;*\u00020:¢\u0006\u0004\b<\u0010=\u001a\u0011\u0010>\u001a\u00020:*\u00020;¢\u0006\u0004\b>\u0010?\u001a\u0011\u0010@\u001a\u00020\u0012*\u00020\u0013¢\u0006\u0004\b@\u0010A\u001a\u0011\u0010D\u001a\u00020C*\u00020B¢\u0006\u0004\bD\u0010E\u001a\u0011\u0010H\u001a\u00020G*\u00020F¢\u0006\u0004\bH\u0010I\u001a\u0011\u0010J\u001a\u00020B*\u00020C¢\u0006\u0004\bJ\u0010K\u001a\u0011\u0010L\u001a\u00020F*\u00020G¢\u0006\u0004\bL\u0010M\u001a\u0011\u0010P\u001a\u00020O*\u00020N¢\u0006\u0004\bP\u0010Q\u001a\u0011\u0010T\u001a\u00020S*\u00020R¢\u0006\u0004\bT\u0010U\u001a\u0011\u0010V\u001a\u00020N*\u00020O¢\u0006\u0004\bV\u0010W\u001a\u0011\u0010Z\u001a\u00020Y*\u00020X¢\u0006\u0004\bZ\u0010[\u001a\u0011\u0010\\\u001a\u00020X*\u00020Y¢\u0006\u0004\b\\\u0010]\u001a\u0011\u0010`\u001a\u00020_*\u00020^¢\u0006\u0004\b`\u0010a\u001a\u0011\u0010b\u001a\u00020^*\u00020_¢\u0006\u0004\bb\u0010c\u001a\u0011\u0010f\u001a\u00020e*\u00020d¢\u0006\u0004\bf\u0010g\u001a\u0011\u0010h\u001a\u00020d*\u00020e¢\u0006\u0004\bh\u0010i\u001a\u0011\u0010l\u001a\u00020k*\u00020j¢\u0006\u0004\bl\u0010m\u001a\u0011\u0010n\u001a\u00020j*\u00020k¢\u0006\u0004\bn\u0010o\u001a\u0011\u0010r\u001a\u00020q*\u00020p¢\u0006\u0004\br\u0010s\u001a\u0011\u0010t\u001a\u00020p*\u00020q¢\u0006\u0004\bt\u0010u\u001a\u0011\u0010x\u001a\u00020w*\u00020v¢\u0006\u0004\bx\u0010y\u001a\u0011\u0010z\u001a\u00020v*\u00020w¢\u0006\u0004\bz\u0010{\u001a\u0011\u0010}\u001a\u000205*\u00020|¢\u0006\u0004\b}\u0010~\u001a\u0012\u0010\u007f\u001a\u00020|*\u000205¢\u0006\u0005\b\u007f\u0010\u0080\u0001\u001a\u0016\u0010\u0083\u0001\u001a\u00030\u0082\u0001*\u00030\u0081\u0001¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0016\u0010\u0085\u0001\u001a\u00030\u0081\u0001*\u00030\u0082\u0001¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0013\u0010\u0087\u0001\u001a\u00020j*\u00020k¢\u0006\u0005\b\u0087\u0001\u0010o\u001a\u0016\u0010\u008a\u0001\u001a\u00030\u0089\u0001*\u00030\u0088\u0001¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0016\u0010\u008e\u0001\u001a\u00030\u008d\u0001*\u00030\u008c\u0001¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0016\u0010\u0090\u0001\u001a\u00030\u0088\u0001*\u00030\u0089\u0001¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0016\u0010\u0092\u0001\u001a\u00030\u008c\u0001*\u00030\u008d\u0001¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0016\u0010\u0096\u0001\u001a\u00030\u0095\u0001*\u00030\u0094\u0001¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0016\u0010\u0098\u0001\u001a\u00030\u0094\u0001*\u00030\u0095\u0001¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001¨\u0006\u009a\u0001"}, d2 = {"Lor0/x;", "Lgr0/h;", "f", "(Lor0/x;)Lgr0/h;", i.f37087n, "(Lgr0/h;)Lor0/x;", "Lor0/u;", "Lgr0/i;", "g", "(Lor0/u;)Lgr0/i;", "F", "(Lgr0/i;)Lor0/u;", "Lor0/t;", "Lgr0/d;", "c", "(Lor0/t;)Lgr0/d;", "E", "(Lgr0/d;)Lor0/t;", "Lor0/k0;", "Lgr0/p;", "p", "(Lor0/k0;)Lgr0/p;", "Lor0/m;", "Lgr0/e;", "d", "(Lor0/m;)Lgr0/e;", "C", "(Lgr0/e;)Lor0/m;", "Lor0/b1;", "Lhr0/c;", "y", "(Lor0/b1;)Lhr0/c;", "T", "(Lhr0/c;)Lor0/b1;", "Lgr0/m;", "Lor0/a0;", "K", "(Lgr0/m;)Lor0/a0;", "k", "(Lor0/a0;)Lgr0/m;", "Lor0/v;", "Lgr0/s;", "q", "(Lor0/v;)Lgr0/s;", "G", "(Lgr0/s;)Lor0/v;", "Lor0/y0;", "Lhr0/c$a;", "x", "(Lor0/y0;)Lhr0/c$a;", "R", "(Lhr0/c$a;)Lor0/y0;", "Lor0/c0;", "Lgr0/n;", "n", "(Lor0/c0;)Lgr0/n;", "Y", "(Lgr0/n;)Lor0/c0;", "Lor0/x0;", "Lgr0/v;", "s", "(Lor0/x0;)Lgr0/v;", "Q", "(Lgr0/v;)Lor0/x0;", "O", "(Lgr0/p;)Lor0/k0;", "Lor0/d1;", "Lgr0/x;", "v", "(Lor0/d1;)Lgr0/x;", "Lor0/j;", "Lgr0/a;", "a", "(Lor0/j;)Lgr0/a;", "V", "(Lgr0/x;)Lor0/d1;", "B", "(Lgr0/a;)Lor0/j;", "Lor0/y;", "Lgr0/k;", "i", "(Lor0/y;)Lgr0/k;", "Lor0/w;", "Lgr0/j;", "h", "(Lor0/w;)Lgr0/j;", "I", "(Lgr0/k;)Lor0/y;", "Lor0/z;", "Lgr0/l;", "j", "(Lor0/z;)Lgr0/l;", "J", "(Lgr0/l;)Lor0/z;", "Lor0/e0;", "Lgr0/o;", "o", "(Lor0/e0;)Lgr0/o;", "N", "(Lgr0/o;)Lor0/e0;", "Lor0/n;", "Lgr0/f;", "e", "(Lor0/n;)Lgr0/f;", ip.a.f96138c, "(Lgr0/f;)Lor0/n;", "Lor0/d0;", "Lgr0/n$a;", "l", "(Lor0/d0;)Lgr0/n$a;", "Z", "(Lgr0/n$a;)Lor0/d0;", "Lor0/w0;", "Lgr0/v$a;", "r", "(Lor0/w0;)Lgr0/v$a;", i.f37086m, "(Lgr0/v$a;)Lor0/w0;", "Lor0/e1;", "Lgr0/x$a;", "u", "(Lor0/e1;)Lgr0/x$a;", "W", "(Lgr0/x$a;)Lor0/e1;", "Lor0/b0;", "m", "(Lor0/b0;)Lgr0/n;", i.f37094u, "(Lgr0/n;)Lor0/b0;", "Lor0/z0;", "Lhr0/a;", "w", "(Lor0/z0;)Lhr0/a;", ip.a.f96137b, "(Lhr0/a;)Lor0/z0;", "M", "Lor0/c1;", "Lgr0/w;", "t", "(Lor0/c1;)Lgr0/w;", "Lor0/a;", "Lgr0/b;", "b", "(Lor0/a;)Lgr0/b;", "U", "(Lgr0/w;)Lor0/c1;", "A", "(Lgr0/b;)Lor0/a;", "Lor0/g1;", "Lhr0/d;", "z", "(Lor0/g1;)Lhr0/d;", "X", "(Lhr0/d;)Lor0/g1;", "offlinedocumentsservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f137835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f137836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f137837c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f137838d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f137839e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f137840f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f137841g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f137842h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ int[] f137843i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ int[] f137844j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ int[] f137845k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int[] f137846l;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.DATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[v.DATE_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[v.NUMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[v.NOTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[v.ENUM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[v.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[v.MULTILINE_TEXT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[v.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f137835a = iArr;
            int[] iArr2 = new int[s.values().length];
            try {
                iArr2[s.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[s.NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[s.DATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[s.DATE_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[s.NUMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[s.NOTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[s.ENUM.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[s.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[s.MULTILINE_TEXT.ordinal()] = 9;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[s.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused20) {
            }
            f137836b = iArr2;
            int[] iArr3 = new int[y0.values().length];
            try {
                iArr3[y0.LEFT_TAB.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[y0.RIGHT_TAB.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[y0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            f137837c = iArr3;
            int[] iArr4 = new int[MultiDocumentView.a.values().length];
            try {
                iArr4[MultiDocumentView.a.LEFT_TAB.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[MultiDocumentView.a.RIGHT_TAB.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr4[MultiDocumentView.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            f137838d = iArr4;
            int[] iArr5 = new int[z.values().length];
            try {
                iArr5[z.UPPERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr5[z.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            f137839e = iArr5;
            int[] iArr6 = new int[l.values().length];
            try {
                iArr6[l.UPPERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[l.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            f137840f = iArr6;
            int[] iArr7 = new int[d0.values().length];
            try {
                iArr7[d0.PL.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[d0.UK.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr7[d0.EN.ordinal()] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[d0.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused34) {
            }
            f137841g = iArr7;
            int[] iArr8 = new int[DocumentSchemaLabel.a.values().length];
            try {
                iArr8[DocumentSchemaLabel.a.PL.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr8[DocumentSchemaLabel.a.UK.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr8[DocumentSchemaLabel.a.EN.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr8[DocumentSchemaLabel.a.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused38) {
            }
            f137842h = iArr8;
            int[] iArr9 = new int[w0.values().length];
            try {
                iArr9[w0.DEFAULT_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr9[w0.HIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr9[w0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            f137843i = iArr9;
            int[] iArr10 = new int[MissingDocumentAttribute.a.values().length];
            try {
                iArr10[MissingDocumentAttribute.a.DEFAULT_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr10[MissingDocumentAttribute.a.HIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr10[MissingDocumentAttribute.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused44) {
            }
            f137844j = iArr10;
            int[] iArr11 = new int[e1.values().length];
            try {
                iArr11[e1.QR_CODE_V10.ordinal()] = 1;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr11[e1.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused46) {
            }
            f137845k = iArr11;
            int[] iArr12 = new int[QrCodeSchema.a.values().length];
            try {
                iArr12[QrCodeSchema.a.QR_CODE_V10.ordinal()] = 1;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr12[QrCodeSchema.a.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused48) {
            }
            f137846l = iArr12;
        }
    }

    public static final AdditionalLogoDtoDto A(BeAdditionalLogo beAdditionalLogo) {
        return new AdditionalLogoDtoDto(beAdditionalLogo.getFieldReference(), beAdditionalLogo.getId());
    }

    public static final BarcodeSchemaDtoDto B(BarcodeSchema barcodeSchema) {
        String fieldReference = barcodeSchema.getFieldReference();
        List<DocumentSchemaLabel> listB = barcodeSchema.b();
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(Y((DocumentSchemaLabel) it.next()));
        }
        return new BarcodeSchemaDtoDto(fieldReference, arrayList);
    }

    public static final DocumentBottomAnnotationDtoDto C(DocumentBottomAnnotation documentBottomAnnotation) {
        List<DocumentBottomAnnotationSection> listA = documentBottomAnnotation.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(D((DocumentBottomAnnotationSection) it.next()));
        }
        return new DocumentBottomAnnotationDtoDto(arrayList);
    }

    public static final DocumentBottomAnnotationSectionDtoDto D(DocumentBottomAnnotationSection documentBottomAnnotationSection) {
        ArrayList arrayList;
        List<DocumentSchemaLabel> listA = documentBottomAnnotationSection.a();
        ArrayList arrayList2 = null;
        if (listA != null) {
            List<DocumentSchemaLabel> list = listA;
            arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(L((DocumentSchemaLabel) it.next()));
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
                arrayList2.add(L((DocumentSchemaLabel) it4.next()));
            }
        }
        return new DocumentBottomAnnotationSectionDtoDto(arrayList, arrayList2, linkUrl);
    }

    public static final DocumentSchemaActionAttributeDtoDto E(DocumentActionAttribute documentActionAttribute) {
        String backendValue = documentActionAttribute.getActionType().getBackendValue();
        List<DocumentSchemaLabel> listB = documentActionAttribute.b();
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(Y((DocumentSchemaLabel) it.next()));
        }
        return new DocumentSchemaActionAttributeDtoDto(backendValue, arrayList);
    }

    public static final DocumentSchemaAttributeDtoDto F(DocumentSchemaAttribute documentSchemaAttribute) {
        ArrayList arrayList;
        v vVarG = G(documentSchemaAttribute.getDataType());
        List<DocumentSchemaLabel> listG = documentSchemaAttribute.g();
        ArrayList arrayList2 = new ArrayList(pq.v.y(listG, 10));
        Iterator<T> it = listG.iterator();
        while (it.hasNext()) {
            arrayList2.add(Y((DocumentSchemaLabel) it.next()));
        }
        MissingDocumentAttribute onMissingAttribute = documentSchemaAttribute.getOnMissingAttribute();
        ArrayList arrayList3 = null;
        MissingDocumentAttributeDtoDto missingDocumentAttributeDtoDtoQ = onMissingAttribute != null ? Q(onMissingAttribute) : null;
        List<String> listE = documentSchemaAttribute.e();
        String fieldReference = documentSchemaAttribute.getFieldReference();
        List<DocumentSchemaEnumTranslation> listC = documentSchemaAttribute.c();
        if (listC != null) {
            List<DocumentSchemaEnumTranslation> list = listC;
            arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList.add(I((DocumentSchemaEnumTranslation) it4.next()));
            }
        } else {
            arrayList = null;
        }
        List<l> listF = documentSchemaAttribute.f();
        if (listF != null) {
            List<l> list2 = listF;
            arrayList3 = new ArrayList(pq.v.y(list2, 10));
            Iterator<T> it5 = list2.iterator();
            while (it5.hasNext()) {
                arrayList3.add(J((l) it5.next()));
            }
        }
        return new DocumentSchemaAttributeDtoDto(vVarG, arrayList2, null, arrayList, fieldReference, listE, arrayList3, missingDocumentAttributeDtoDtoQ, 4, null);
    }

    public static final v G(s sVar) {
        switch (a.f137836b[sVar.ordinal()]) {
            case 1:
                return v.TEXT;
            case 2:
                return v.NAME;
            case 3:
                return v.DATE;
            case 4:
                return v.DATE_TIME;
            case 5:
                return v.NUMBER;
            case 6:
                return v.NOTE;
            case 7:
                return v.ENUM;
            case 8:
                return v.BOOLEAN;
            case 9:
                return v.MULTILINE_TEXT;
            case 10:
                return v.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final DocumentSchemaDtoDto H(DocumentSchema documentSchema) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String schemaId = documentSchema.getSchemaId();
        String schemaVersion = documentSchema.getSchemaVersion();
        String documentName = documentSchema.getDocumentName();
        PictureSchemaDtoDto pictureSchemaDtoDtoU = U(documentSchema.getPicture());
        String documentPeselFieldReference = documentSchema.getDocumentPeselFieldReference();
        DocumentTopAnnotation topAnnotation = documentSchema.getTopAnnotation();
        ArrayList arrayList5 = null;
        DocumentTopAnnotationDtoDto documentTopAnnotationDtoDtoO = topAnnotation != null ? O(topAnnotation) : null;
        QrCodeSchema qrCode = documentSchema.getQrCode();
        QrCodeSchemaDtoDto qrCodeSchemaDtoDtoV = qrCode != null ? V(qrCode) : null;
        BarcodeSchema barcode = documentSchema.getBarcode();
        BarcodeSchemaDtoDto barcodeSchemaDtoDtoB = barcode != null ? B(barcode) : null;
        List<DocumentSchemaAttribute> listF = documentSchema.f();
        if (listF != null) {
            List<DocumentSchemaAttribute> list = listF;
            ArrayList arrayList6 = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList6.add(F((DocumentSchemaAttribute) it.next()));
            }
            arrayList = arrayList6;
        } else {
            arrayList = null;
        }
        List<DocumentSchemaLabel> listC = documentSchema.c();
        if (listC != null) {
            List<DocumentSchemaLabel> list2 = listC;
            arrayList2 = new ArrayList(pq.v.y(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(Y((DocumentSchemaLabel) it4.next()));
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
                arrayList3.add(F((DocumentSchemaAttribute) it5.next()));
            }
        } else {
            arrayList3 = null;
        }
        List<DocumentActionAttribute> listA = documentSchema.a();
        if (listA != null) {
            List<DocumentActionAttribute> list4 = listA;
            arrayList4 = new ArrayList(pq.v.y(list4, 10));
            Iterator<T> it6 = list4.iterator();
            while (it6.hasNext()) {
                arrayList4.add(E((DocumentActionAttribute) it6.next()));
            }
        } else {
            arrayList4 = null;
        }
        DocumentBottomAnnotation bottomAnnotation = documentSchema.getBottomAnnotation();
        DocumentBottomAnnotationDtoDto documentBottomAnnotationDtoDtoC = bottomAnnotation != null ? C(bottomAnnotation) : null;
        MultiDocumentView multiDocumentView = documentSchema.getMultiDocumentView();
        MultiDocumentViewDtoDto multiDocumentViewDtoDtoT = multiDocumentView != null ? T(multiDocumentView) : null;
        List<DocumentSchemaForwardAttribute> listI = documentSchema.i();
        if (listI != null) {
            List<DocumentSchemaForwardAttribute> list5 = listI;
            ArrayList arrayList7 = new ArrayList(pq.v.y(list5, 10));
            Iterator<T> it7 = list5.iterator();
            while (it7.hasNext()) {
                arrayList7.add(K((DocumentSchemaForwardAttribute) it7.next()));
            }
            arrayList5 = arrayList7;
        }
        return new DocumentSchemaDtoDto(documentName, pictureSchemaDtoDtoU, schemaId, schemaVersion, arrayList4, arrayList3, arrayList2, barcodeSchemaDtoDtoB, documentBottomAnnotationDtoDtoC, arrayList, documentPeselFieldReference, arrayList5, multiDocumentViewDtoDtoT, qrCodeSchemaDtoDtoV, documentTopAnnotationDtoDtoO, null, 32768, null);
    }

    public static final DocumentSchemaEnumTranslationDtoDto I(DocumentSchemaEnumTranslation documentSchemaEnumTranslation) {
        String enumValue = documentSchemaEnumTranslation.getEnumValue();
        List<DocumentSchemaLabel> listA = documentSchemaEnumTranslation.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(Y((DocumentSchemaLabel) it.next()));
        }
        return new DocumentSchemaEnumTranslationDtoDto(arrayList, enumValue);
    }

    public static final z J(l lVar) {
        int i15 = a.f137840f[lVar.ordinal()];
        if (i15 == 1) {
            return z.UPPERCASE;
        }
        if (i15 == 2) {
            return z.UNKNOWN;
        }
        throw new p();
    }

    public static final DocumentSchemaForwardAttributeDtoDto K(DocumentSchemaForwardAttribute documentSchemaForwardAttribute) {
        List<DocumentSchemaLabel> listA = documentSchemaForwardAttribute.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(Y((DocumentSchemaLabel) it.next()));
        }
        return new DocumentSchemaForwardAttributeDtoDto(arrayList);
    }

    public static final DocumentSchemaLabelDto L(DocumentSchemaLabel documentSchemaLabel) {
        return new DocumentSchemaLabelDto(M(documentSchemaLabel.getLanguage()), documentSchemaLabel.getValue());
    }

    public static final d0 M(DocumentSchemaLabel.a aVar) {
        int i15 = a.f137842h[aVar.ordinal()];
        if (i15 == 1) {
            return d0.PL;
        }
        if (i15 == 2) {
            return d0.UK;
        }
        if (i15 == 3) {
            return d0.EN;
        }
        if (i15 == 4) {
            return d0.UNKNOWN;
        }
        throw new p();
    }

    public static final DocumentStaticSectionDtoDto N(DocumentStaticSection documentStaticSection) {
        List<DocumentSchemaLabel> listA = documentStaticSection.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(Y((DocumentSchemaLabel) it.next()));
        }
        return new DocumentStaticSectionDtoDto(arrayList);
    }

    public static final DocumentTopAnnotationDtoDto O(DocumentTopAnnotation documentTopAnnotation) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List<DocumentSchemaLabel> listD = documentTopAnnotation.d();
        if (listD != null) {
            List<DocumentSchemaLabel> list = listD;
            arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Y((DocumentSchemaLabel) it.next()));
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
                arrayList2.add(Y((DocumentSchemaLabel) it4.next()));
            }
        } else {
            arrayList2 = null;
        }
        List<DocumentStaticSection> listC = documentTopAnnotation.c();
        if (listC != null) {
            List<DocumentStaticSection> list3 = listC;
            arrayList3 = new ArrayList(pq.v.y(list3, 10));
            Iterator<T> it5 = list3.iterator();
            while (it5.hasNext()) {
                arrayList3.add(N((DocumentStaticSection) it5.next()));
            }
        } else {
            arrayList3 = null;
        }
        DocumentDynamicSection dynamicSections = documentTopAnnotation.getDynamicSections();
        return new DocumentTopAnnotationDtoDto(dynamicSections != null ? f.d(dynamicSections) : null, arrayList2, arrayList3, arrayList);
    }

    public static final w0 P(MissingDocumentAttribute.a aVar) {
        int i15 = a.f137844j[aVar.ordinal()];
        if (i15 == 1) {
            return w0.DEFAULT_VALUE;
        }
        if (i15 == 2) {
            return w0.HIDE;
        }
        if (i15 == 3) {
            return w0.UNKNOWN;
        }
        throw new p();
    }

    public static final MissingDocumentAttributeDtoDto Q(MissingDocumentAttribute missingDocumentAttribute) {
        w0 w0VarP = P(missingDocumentAttribute.getOnMissing());
        s dataType = missingDocumentAttribute.getDataType();
        return new MissingDocumentAttributeDtoDto(w0VarP, dataType != null ? f.e(dataType) : null, missingDocumentAttribute.getDefaultValue());
    }

    public static final y0 R(MultiDocumentView.a aVar) {
        int i15 = a.f137838d[aVar.ordinal()];
        if (i15 == 1) {
            return y0.LEFT_TAB;
        }
        if (i15 == 2) {
            return y0.RIGHT_TAB;
        }
        if (i15 == 3) {
            return y0.UNKNOWN;
        }
        throw new p();
    }

    public static final MultiDocumentSchemaDtoDto S(MultiDocumentSchema multiDocumentSchema) {
        DocumentsGroup leftTab = multiDocumentSchema.getLeftTab();
        DocumentsGroupDtoDto documentsGroupDtoDtoK = leftTab != null ? g.k(leftTab) : null;
        DocumentsGroup rightTab = multiDocumentSchema.getRightTab();
        DocumentsGroupDtoDto documentsGroupDtoDtoK2 = rightTab != null ? g.k(rightTab) : null;
        VerificationSelector verificationSelector = multiDocumentSchema.getVerificationSelector();
        return new MultiDocumentSchemaDtoDto(documentsGroupDtoDtoK, documentsGroupDtoDtoK2, verificationSelector != null ? X(verificationSelector) : null);
    }

    public static final MultiDocumentViewDtoDto T(MultiDocumentView multiDocumentView) {
        return new MultiDocumentViewDtoDto(f.d(multiDocumentView.getDynamicSections()), R(multiDocumentView.getMultiDocumentGroup()));
    }

    public static final PictureSchemaDtoDto U(PictureSchema pictureSchema) {
        String pictureId = pictureSchema.getPictureId();
        String emblemTextHexColor = pictureSchema.getEmblemTextHexColor();
        String attributesValueTextHexColor = pictureSchema.getAttributesValueTextHexColor();
        String attributesTitleTextHexColor = pictureSchema.getAttributesTitleTextHexColor();
        List<DocumentSchemaAttribute> listB = pictureSchema.b();
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(F((DocumentSchemaAttribute) it.next()));
        }
        String sourceContainerRef = pictureSchema.getSourceContainerRef();
        List<BeAdditionalLogo> listA = pictureSchema.a();
        ArrayList arrayList2 = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it4 = listA.iterator();
        while (it4.hasNext()) {
            arrayList2.add(A((BeAdditionalLogo) it4.next()));
        }
        return new PictureSchemaDtoDto(arrayList, emblemTextHexColor, pictureId, arrayList2, null, attributesTitleTextHexColor, attributesValueTextHexColor, sourceContainerRef, 16, null);
    }

    public static final QrCodeSchemaDtoDto V(QrCodeSchema qrCodeSchema) {
        return new QrCodeSchemaDtoDto(qrCodeSchema.getFieldReference(), W(qrCodeSchema.getType()));
    }

    public static final e1 W(QrCodeSchema.a aVar) {
        int i15 = a.f137846l[aVar.ordinal()];
        if (i15 == 1) {
            return e1.QR_CODE_V10;
        }
        if (i15 == 2) {
            return e1.UNKNOWN;
        }
        throw new p();
    }

    public static final VerificationSelectorDtoDto X(VerificationSelector verificationSelector) {
        return new VerificationSelectorDtoDto(f.d(verificationSelector.getDynamicSections()), g.m(verificationSelector.getLabel()));
    }

    public static final DocumentSchemaLabelDtoDto Y(DocumentSchemaLabel documentSchemaLabel) {
        return new DocumentSchemaLabelDtoDto(Z(documentSchemaLabel.getLanguage()), documentSchemaLabel.getValue());
    }

    public static final d0 Z(DocumentSchemaLabel.a aVar) {
        int i15 = a.f137842h[aVar.ordinal()];
        if (i15 == 1) {
            return d0.PL;
        }
        if (i15 == 2) {
            return d0.UK;
        }
        if (i15 == 3) {
            return d0.EN;
        }
        if (i15 == 4) {
            return d0.UNKNOWN;
        }
        throw new p();
    }

    public static final BarcodeSchema a(BarcodeSchemaDtoDto barcodeSchemaDtoDto) {
        String fieldReference = barcodeSchemaDtoDto.getFieldReference();
        List<DocumentSchemaLabelDtoDto> listB = barcodeSchemaDtoDto.b();
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(n((DocumentSchemaLabelDtoDto) it.next()));
        }
        return new BarcodeSchema(fieldReference, arrayList);
    }

    public static final BeAdditionalLogo b(AdditionalLogoDtoDto additionalLogoDtoDto) {
        return new BeAdditionalLogo(additionalLogoDtoDto.getId(), additionalLogoDtoDto.getFieldReference());
    }

    public static final DocumentActionAttribute c(DocumentSchemaActionAttributeDtoDto documentSchemaActionAttributeDtoDto) {
        DocumentActionAttribute.a aVarA = DocumentActionAttribute.a.INSTANCE.a(documentSchemaActionAttributeDtoDto.getActionType());
        List<DocumentSchemaLabelDtoDto> listB = documentSchemaActionAttributeDtoDto.b();
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(n((DocumentSchemaLabelDtoDto) it.next()));
        }
        return new DocumentActionAttribute(aVarA, arrayList);
    }

    public static final DocumentBottomAnnotation d(DocumentBottomAnnotationDtoDto documentBottomAnnotationDtoDto) {
        List<DocumentBottomAnnotationSectionDtoDto> listA = documentBottomAnnotationDtoDto.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(e((DocumentBottomAnnotationSectionDtoDto) it.next()));
        }
        return new DocumentBottomAnnotation(arrayList);
    }

    public static final DocumentBottomAnnotationSection e(DocumentBottomAnnotationSectionDtoDto documentBottomAnnotationSectionDtoDto) {
        ArrayList arrayList;
        List<DocumentSchemaLabelDto> listA = documentBottomAnnotationSectionDtoDto.a();
        ArrayList arrayList2 = null;
        if (listA != null) {
            List<DocumentSchemaLabelDto> list = listA;
            arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m((DocumentSchemaLabelDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        String linkUrl = documentBottomAnnotationSectionDtoDto.getLinkUrl();
        List<DocumentSchemaLabelDto> listB = documentBottomAnnotationSectionDtoDto.b();
        if (listB != null) {
            List<DocumentSchemaLabelDto> list2 = listB;
            arrayList2 = new ArrayList(pq.v.y(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(m((DocumentSchemaLabelDto) it4.next()));
            }
        }
        return new DocumentBottomAnnotationSection(arrayList, linkUrl, arrayList2);
    }

    public static final DocumentSchema f(DocumentSchemaDtoDto documentSchemaDtoDto) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String schemaId = documentSchemaDtoDto.getSchemaId();
        String schemaVersion = documentSchemaDtoDto.getSchemaVersion();
        String documentName = documentSchemaDtoDto.getDocumentName();
        PictureSchema pictureSchemaT = t(documentSchemaDtoDto.getPicture());
        String documentPeselFieldReference = documentSchemaDtoDto.getDocumentPeselFieldReference();
        DocumentTopAnnotationDtoDto topAnnotation = documentSchemaDtoDto.getTopAnnotation();
        ArrayList arrayList5 = null;
        DocumentTopAnnotation documentTopAnnotationP = topAnnotation != null ? p(topAnnotation) : null;
        QrCodeSchemaDtoDto qrCode = documentSchemaDtoDto.getQrCode();
        QrCodeSchema qrCodeSchemaV = qrCode != null ? v(qrCode) : null;
        BarcodeSchemaDtoDto barcode = documentSchemaDtoDto.getBarcode();
        BarcodeSchema barcodeSchemaA = barcode != null ? a(barcode) : null;
        List<DocumentSchemaAttributeDtoDto> listF = documentSchemaDtoDto.f();
        if (listF != null) {
            List<DocumentSchemaAttributeDtoDto> list = listF;
            arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(g((DocumentSchemaAttributeDtoDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        List<DocumentSchemaLabelDtoDto> listC = documentSchemaDtoDto.c();
        if (listC != null) {
            List<DocumentSchemaLabelDtoDto> list2 = listC;
            arrayList2 = new ArrayList(pq.v.y(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(n((DocumentSchemaLabelDtoDto) it4.next()));
            }
        } else {
            arrayList2 = null;
        }
        List<DocumentSchemaAttributeDtoDto> listB = documentSchemaDtoDto.b();
        if (listB != null) {
            List<DocumentSchemaAttributeDtoDto> list3 = listB;
            arrayList3 = new ArrayList(pq.v.y(list3, 10));
            Iterator<T> it5 = list3.iterator();
            while (it5.hasNext()) {
                arrayList3.add(g((DocumentSchemaAttributeDtoDto) it5.next()));
            }
        } else {
            arrayList3 = null;
        }
        List<DocumentSchemaActionAttributeDtoDto> listA = documentSchemaDtoDto.a();
        if (listA != null) {
            List<DocumentSchemaActionAttributeDtoDto> list4 = listA;
            arrayList4 = new ArrayList(pq.v.y(list4, 10));
            Iterator<T> it6 = list4.iterator();
            while (it6.hasNext()) {
                arrayList4.add(c((DocumentSchemaActionAttributeDtoDto) it6.next()));
            }
        } else {
            arrayList4 = null;
        }
        DocumentBottomAnnotationDtoDto bottomAnnotation = documentSchemaDtoDto.getBottomAnnotation();
        DocumentBottomAnnotation documentBottomAnnotationD = bottomAnnotation != null ? d(bottomAnnotation) : null;
        MultiDocumentViewDtoDto multiDocumentView = documentSchemaDtoDto.getMultiDocumentView();
        MultiDocumentView multiDocumentViewY = multiDocumentView != null ? y(multiDocumentView) : null;
        List<DocumentSchemaForwardAttributeDtoDto> listI = documentSchemaDtoDto.i();
        if (listI != null) {
            List<DocumentSchemaForwardAttributeDtoDto> list5 = listI;
            arrayList5 = new ArrayList(pq.v.y(list5, 10));
            Iterator<T> it7 = list5.iterator();
            while (it7.hasNext()) {
                arrayList5.add(k((DocumentSchemaForwardAttributeDtoDto) it7.next()));
            }
        }
        return new DocumentSchema(schemaId, schemaVersion, documentName, arrayList5, pictureSchemaT, documentPeselFieldReference, null, documentTopAnnotationP, qrCodeSchemaV, barcodeSchemaA, arrayList, arrayList2, arrayList3, arrayList4, documentBottomAnnotationD, multiDocumentViewY, 64, null);
    }

    public static final DocumentSchemaAttribute g(DocumentSchemaAttributeDtoDto documentSchemaAttributeDtoDto) {
        ArrayList arrayList;
        ArrayList arrayList2;
        s sVarQ = q(documentSchemaAttributeDtoDto.getDataType());
        List<DocumentSchemaLabelDtoDto> listG = documentSchemaAttributeDtoDto.g();
        ArrayList arrayList3 = new ArrayList(pq.v.y(listG, 10));
        Iterator<T> it = listG.iterator();
        while (it.hasNext()) {
            arrayList3.add(n((DocumentSchemaLabelDtoDto) it.next()));
        }
        MissingDocumentAttributeDtoDto onMissingAttribute = documentSchemaAttributeDtoDto.getOnMissingAttribute();
        ArrayList arrayList4 = null;
        MissingDocumentAttribute missingDocumentAttributeS = onMissingAttribute != null ? s(onMissingAttribute) : null;
        List<String> listE = documentSchemaAttributeDtoDto.e();
        String fieldReference = documentSchemaAttributeDtoDto.getFieldReference();
        List<DocumentSchemaEnumTranslationDtoDto> listC = documentSchemaAttributeDtoDto.c();
        if (listC != null) {
            List<DocumentSchemaEnumTranslationDtoDto> list = listC;
            ArrayList arrayList5 = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList5.add(i((DocumentSchemaEnumTranslationDtoDto) it4.next()));
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        List<DocumentSchemaBooleanTranslationDtoDto> listA = documentSchemaAttributeDtoDto.a();
        if (listA != null) {
            List<DocumentSchemaBooleanTranslationDtoDto> list2 = listA;
            ArrayList arrayList6 = new ArrayList(pq.v.y(list2, 10));
            Iterator<T> it5 = list2.iterator();
            while (it5.hasNext()) {
                arrayList6.add(h((DocumentSchemaBooleanTranslationDtoDto) it5.next()));
            }
            arrayList2 = arrayList6;
        } else {
            arrayList2 = null;
        }
        List<z> listF = documentSchemaAttributeDtoDto.f();
        if (listF != null) {
            List<z> list3 = listF;
            arrayList4 = new ArrayList(pq.v.y(list3, 10));
            Iterator<T> it6 = list3.iterator();
            while (it6.hasNext()) {
                arrayList4.add(j((z) it6.next()));
            }
        }
        return new DocumentSchemaAttribute(sVarQ, missingDocumentAttributeS, arrayList3, listE, fieldReference, arrayList, arrayList2, arrayList4);
    }

    public static final DocumentSchemaBooleanTranslation h(DocumentSchemaBooleanTranslationDtoDto documentSchemaBooleanTranslationDtoDto) {
        List<DocumentSchemaLabelDtoDto> listB = documentSchemaBooleanTranslationDtoDto.b();
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(n((DocumentSchemaLabelDtoDto) it.next()));
        }
        List<DocumentSchemaLabelDtoDto> listA = documentSchemaBooleanTranslationDtoDto.a();
        ArrayList arrayList2 = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it4 = listA.iterator();
        while (it4.hasNext()) {
            arrayList2.add(n((DocumentSchemaLabelDtoDto) it4.next()));
        }
        return new DocumentSchemaBooleanTranslation(arrayList, arrayList2);
    }

    public static final DocumentSchemaEnumTranslation i(DocumentSchemaEnumTranslationDtoDto documentSchemaEnumTranslationDtoDto) {
        String enumValue = documentSchemaEnumTranslationDtoDto.getEnumValue();
        List<DocumentSchemaLabelDtoDto> listA = documentSchemaEnumTranslationDtoDto.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(n((DocumentSchemaLabelDtoDto) it.next()));
        }
        return new DocumentSchemaEnumTranslation(enumValue, arrayList);
    }

    public static final l j(z zVar) {
        int i15 = a.f137839e[zVar.ordinal()];
        if (i15 == 1) {
            return l.UPPERCASE;
        }
        if (i15 == 2) {
            return l.UNKNOWN;
        }
        throw new p();
    }

    public static final DocumentSchemaForwardAttribute k(DocumentSchemaForwardAttributeDtoDto documentSchemaForwardAttributeDtoDto) {
        List<DocumentSchemaLabelDtoDto> listA = documentSchemaForwardAttributeDtoDto.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(n((DocumentSchemaLabelDtoDto) it.next()));
        }
        return new DocumentSchemaForwardAttribute(arrayList);
    }

    public static final DocumentSchemaLabel.a l(d0 d0Var) {
        int i15 = a.f137841g[d0Var.ordinal()];
        if (i15 == 1) {
            return DocumentSchemaLabel.a.PL;
        }
        if (i15 == 2) {
            return DocumentSchemaLabel.a.UK;
        }
        if (i15 == 3) {
            return DocumentSchemaLabel.a.EN;
        }
        if (i15 == 4) {
            return DocumentSchemaLabel.a.UNKNOWN;
        }
        throw new p();
    }

    public static final DocumentSchemaLabel m(DocumentSchemaLabelDto documentSchemaLabelDto) {
        return new DocumentSchemaLabel(l(documentSchemaLabelDto.getLanguage()), documentSchemaLabelDto.getValue());
    }

    public static final DocumentSchemaLabel n(DocumentSchemaLabelDtoDto documentSchemaLabelDtoDto) {
        return new DocumentSchemaLabel(l(documentSchemaLabelDtoDto.getLanguage()), documentSchemaLabelDtoDto.getValue());
    }

    public static final DocumentStaticSection o(DocumentStaticSectionDtoDto documentStaticSectionDtoDto) {
        List<DocumentSchemaLabelDtoDto> listA = documentStaticSectionDtoDto.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(n((DocumentSchemaLabelDtoDto) it.next()));
        }
        return new DocumentStaticSection(arrayList);
    }

    public static final DocumentTopAnnotation p(DocumentTopAnnotationDtoDto documentTopAnnotationDtoDto) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List<DocumentSchemaLabelDtoDto> listD = documentTopAnnotationDtoDto.d();
        if (listD != null) {
            List<DocumentSchemaLabelDtoDto> list = listD;
            arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(n((DocumentSchemaLabelDtoDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        List<DocumentSchemaLabelDtoDto> listB = documentTopAnnotationDtoDto.b();
        if (listB != null) {
            List<DocumentSchemaLabelDtoDto> list2 = listB;
            arrayList2 = new ArrayList(pq.v.y(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(n((DocumentSchemaLabelDtoDto) it4.next()));
            }
        } else {
            arrayList2 = null;
        }
        List<DocumentStaticSectionDtoDto> listC = documentTopAnnotationDtoDto.c();
        if (listC != null) {
            List<DocumentStaticSectionDtoDto> list3 = listC;
            arrayList3 = new ArrayList(pq.v.y(list3, 10));
            Iterator<T> it5 = list3.iterator();
            while (it5.hasNext()) {
                arrayList3.add(o((DocumentStaticSectionDtoDto) it5.next()));
            }
        } else {
            arrayList3 = null;
        }
        DocumentDynamicSectionDtoDto dynamicSections = documentTopAnnotationDtoDto.getDynamicSections();
        return new DocumentTopAnnotation(arrayList, arrayList2, arrayList3, dynamicSections != null ? f.a(dynamicSections) : null);
    }

    public static final s q(v vVar) {
        switch (a.f137835a[vVar.ordinal()]) {
            case 1:
                return s.TEXT;
            case 2:
                return s.NAME;
            case 3:
                return s.DATE;
            case 4:
                return s.DATE_TIME;
            case 5:
                return s.NUMBER;
            case 6:
                return s.NOTE;
            case 7:
                return s.ENUM;
            case 8:
                return s.BOOLEAN;
            case 9:
                return s.MULTILINE_TEXT;
            case 10:
                return s.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final MissingDocumentAttribute.a r(w0 w0Var) {
        int i15 = a.f137843i[w0Var.ordinal()];
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

    public static final MissingDocumentAttribute s(MissingDocumentAttributeDtoDto missingDocumentAttributeDtoDto) {
        MissingDocumentAttribute.a aVarR = r(missingDocumentAttributeDtoDto.getOnMissing());
        v dataType = missingDocumentAttributeDtoDto.getDataType();
        return new MissingDocumentAttribute(aVarR, dataType != null ? q(dataType) : null, missingDocumentAttributeDtoDto.getDefaultValue());
    }

    public static final PictureSchema t(PictureSchemaDtoDto pictureSchemaDtoDto) {
        List listN;
        String pictureId = pictureSchemaDtoDto.getPictureId();
        String emblemTextHexColor = pictureSchemaDtoDto.getEmblemTextHexColor();
        String attributesValueTextHexColor = pictureSchemaDtoDto.getAttributesValueTextHexColor();
        String attributesTitleTextHexColor = pictureSchemaDtoDto.getAttributesTitleTextHexColor();
        List<DocumentSchemaAttributeDtoDto> listB = pictureSchemaDtoDto.b();
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(g((DocumentSchemaAttributeDtoDto) it.next()));
        }
        String sourceContainerRef = pictureSchemaDtoDto.getSourceContainerRef();
        List<AdditionalLogoDtoDto> listA = pictureSchemaDtoDto.a();
        if (listA != null) {
            List<AdditionalLogoDtoDto> list = listA;
            listN = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                listN.add(b((AdditionalLogoDtoDto) it4.next()));
            }
        } else {
            listN = pq.v.n();
        }
        return new PictureSchema(pictureId, emblemTextHexColor, attributesValueTextHexColor, attributesTitleTextHexColor, arrayList, sourceContainerRef, listN);
    }

    public static final QrCodeSchema.a u(e1 e1Var) {
        int i15 = a.f137845k[e1Var.ordinal()];
        if (i15 == 1) {
            return QrCodeSchema.a.QR_CODE_V10;
        }
        if (i15 == 2) {
            return QrCodeSchema.a.UNKNOWN;
        }
        throw new p();
    }

    public static final QrCodeSchema v(QrCodeSchemaDtoDto qrCodeSchemaDtoDto) {
        return new QrCodeSchema(u(qrCodeSchemaDtoDto.getType()), qrCodeSchemaDtoDto.getFieldReference());
    }

    public static final MultiDocumentSchema w(MultiDocumentSchemaDtoDto multiDocumentSchemaDtoDto) {
        DocumentsGroupDtoDto leftTab = multiDocumentSchemaDtoDto.getLeftTab();
        DocumentsGroup documentsGroupF = leftTab != null ? g.f(leftTab) : null;
        DocumentsGroupDtoDto rightTab = multiDocumentSchemaDtoDto.getRightTab();
        DocumentsGroup documentsGroupF2 = rightTab != null ? g.f(rightTab) : null;
        VerificationSelectorDtoDto verificationSelector = multiDocumentSchemaDtoDto.getVerificationSelector();
        return new MultiDocumentSchema(documentsGroupF, documentsGroupF2, verificationSelector != null ? z(verificationSelector) : null);
    }

    public static final MultiDocumentView.a x(y0 y0Var) {
        int i15 = a.f137837c[y0Var.ordinal()];
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

    public static final MultiDocumentView y(MultiDocumentViewDtoDto multiDocumentViewDtoDto) {
        return new MultiDocumentView(f.a(multiDocumentViewDtoDto.getDynamicSections()), x(multiDocumentViewDtoDto.getMultiDocumentGroup()));
    }

    public static final VerificationSelector z(VerificationSelectorDtoDto verificationSelectorDtoDto) {
        return new VerificationSelector(f.a(verificationSelectorDtoDto.getDynamicSections()), g.g(verificationSelectorDtoDto.getLabel()));
    }
}
