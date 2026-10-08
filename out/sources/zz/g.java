package zz;

import fr.k;
import java.util.List;
import oq.p;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.EACTags;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lzz/g;", "Lzz/f;", "<init>", "()V", "Lzz/f$a;", "params", "", "", "c", "(Lzz/f$a;)Ljava/util/List;", "a", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f238547a = new a(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b3\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0006R\u0014\u0010$\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0006R\u0014\u0010&\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0006R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0006R\u0014\u0010(\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0006R\u0014\u0010)\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0006R\u0014\u0010*\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0006R\u0014\u0010+\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0006R\u0014\u0010,\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0006R\u0014\u0010-\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u0006R\u0014\u0010.\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0006R\u0014\u0010/\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u0006R\u0014\u00100\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u0006R\u0014\u00101\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\u0006R\u0014\u00102\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u0006R\u0014\u00103\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u0006R\u0014\u00104\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\u0006R\u0014\u00105\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\u0006R\u0014\u00106\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\u0006¨\u00067"}, d2 = {"Lzz/g$a;", "", "<init>", "()V", "", "VND_RAR_MIME_TYPE", "Ljava/lang/String;", "QUICK_TIME_MIME_TYPE", "RAR_MIME_TYPE", "PDF_MIME_TYPE", "ZIP_MIME_TYPE", "SEVEN_Z_MIME_TYPE", "TEXT_PLAIN_MIME_TYPE", "PPT_MIME_TYPE", "RTF_MIME_TYPE", "DOCX_MIME_TYPE", "PNG_MIME_TYPE", "XML_MIME_TYPE", "TEXT_XML_MIME_TYPE", "XLS_MIME_TYPE", "XLSX_MIME_TYPE", "SVG_MIME_TYPE", "PPTX_MIME_TYPE", "M4A_MIME_TYPE", "HTML_MIME_TYPE", "ODT_MIME_TYPE", "CSV_MIME_TYPE", "MP3_MIME_TYPE", "MP4_MIME_TYPE", "ODS_MIME_TYPE", "JPG_JPEG_MIME_TYPE", "AVI_MIME_TYPE", "TIFF_MIME_TYPE", "DOC_MIME_TYPE", "DOC_MIME_TYPE_VND", "TAR_MIME_TYPE", "CSS_MIME_TYPE", "DWF_MIME_TYPE", "MPEG_MIME_TYPE", "JP2_MIME_TYPE", "DXF_MIME_TYPE", "DWG_MIME_TYPE", "GZIP_MIME_TYPE", "OGG_AUDIO_MIME_TYPE", "OGG_VIDEO_MIME_TYPE", "ODP_MIME_TYPE", "WAV_MIME_TYPE", "GML_MIME_TYPE", "XPS_MIME_TYPE", "CADES_MIME_TYPE", "DGN_MIME_TYPE", "HEIC_MIME_TYPE", "HEIF_MIME_TYPE", "ASIC_MIME_TYPE", "ANY_MIME_TYPE", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f238548a;

        static {
            int[] iArr = new int[wx.f.values().length];
            try {
                iArr[wx.f.PDF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wx.f.PADES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[wx.f.GZIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[wx.f.GZ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[wx.f.SEVEN_Z.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[wx.f.ZIP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[wx.f.TXT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[wx.f.PPT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[wx.f.RTF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[wx.f.DOCX.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[wx.f.PNG.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[wx.f.XSD.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[wx.f.XMLENC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[wx.f.RNG.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[wx.f.XSL.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[wx.f.XSLT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[wx.f.XMLSIG.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[wx.f.XML.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[wx.f.XADES.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[wx.f.TSL.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[wx.f.JP2.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[wx.f.DXF.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[wx.f.DWG.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[wx.f.XLS.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[wx.f.XLSX.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[wx.f.SVG.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[wx.f.XPS.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[wx.f.PPTX.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[wx.f.WAV.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[wx.f.M4A.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[wx.f.HTML.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[wx.f.XHTML.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[wx.f.ODT.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[wx.f.CSV.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[wx.f.MP3.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[wx.f.MP4.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[wx.f.ODS.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[wx.f.JPG.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[wx.f.JPEG.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[wx.f.AVI.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[wx.f.OGG.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[wx.f.OGV.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[wx.f.GML.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[wx.f.ODP.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[wx.f.MPG.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[wx.f.MPEG.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[wx.f.MPEG4.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[wx.f.DOC.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[wx.f.TIF.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[wx.f.TIFF.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[wx.f.GEOTIFF.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[wx.f.TAR.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[wx.f.CSS.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[wx.f.DWF.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[wx.f.RAR.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[wx.f.HEIC.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[wx.f.HEIF.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[wx.f.ANY.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[wx.f.QUICK_TIME.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[wx.f.CADES.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[wx.f.DGN.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[wx.f.ASIC.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            f238548a = iArr;
        }
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public List<String> b(f.Params params) {
        switch (b.f238548a[params.getFileType().ordinal()]) {
            case 1:
            case 2:
                return v.e("application/pdf");
            case 3:
            case 4:
                return v.e("application/gzip");
            case 5:
                return v.e("application/x-7z-compressed");
            case 6:
                return v.e("application/zip");
            case 7:
                return v.e("text/plain");
            case 8:
                return v.e("application/vnd.ms-powerpoint");
            case 9:
                return v.e("application/rtf");
            case 10:
                return v.e("application/vnd.openxmlformats-officedocument.wordprocessingml.document");
            case 11:
                return v.e("image/png");
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return v.q("application/xml", "text/xml");
            case 21:
                return v.e("image/jp2");
            case 22:
                return v.e("image/vnd.dxf");
            case 23:
                return v.e("image/vnd.dwg");
            case 24:
                return v.e("application/vnd.ms-excel");
            case 25:
                return v.e("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
            case 26:
                return v.e("image/svg+xml");
            case 27:
                return v.q("application/vnd.ms-xpsdocument", "application/zip");
            case 28:
                return v.e("application/vnd.openxmlformats-officedocument.presentationml.presentation");
            case 29:
                return v.e("audio/x-wav");
            case 30:
                return v.e("audio/mp4");
            case BERTags.DATE /* 31 */:
            case 32:
                return v.e("text/html");
            case 33:
                return v.e("application/vnd.oasis.opendocument.text");
            case 34:
                return v.e("text/csv");
            case 35:
                return v.e("audio/mpeg");
            case 36:
                return v.e("video/mp4");
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                return v.e("application/vnd.oasis.opendocument.spreadsheet");
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                return v.e("image/jpeg");
            case 40:
                return v.e("video/x-msvideo");
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                return v.e("audio/ogg");
            case EACTags.CURRENCY_CODE /* 42 */:
                return v.e("video/ogg");
            case EACTags.DATE_OF_BIRTH /* 43 */:
                return v.q("application/gml+xml", "application/xml");
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                return v.e("application/vnd.oasis.opendocument.presentation");
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
            case 46:
            case 47:
                return v.e("video/mpeg");
            case 48:
                return v.q("application/msword", "application/vnd.ms-word");
            case 49:
            case 50:
            case EACTags.TRANSACTION_DATE /* 51 */:
                return v.e("image/tiff");
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                return v.e("application/x-tar");
            case 53:
                return v.e("text/css");
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                return v.e("model/vnd.dwf");
            case 55:
                return v.q("application/rar", "application/vnd.rar");
            case 56:
                return v.e("image/heic");
            case 57:
                return v.e("image/heif");
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                return v.e("*/*");
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                return v.e("video/quicktime");
            case 60:
                return v.e("text/x-ttcn-asn");
            case 61:
                return v.e("application/vnd.dgn");
            case 62:
                return v.e("application/vnd.etsi.asic-e+zip");
            default:
                throw new p();
        }
    }
}
