package y;

import android.location.Location;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import o.e1;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f222447c = "f";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f222448d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f222449e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f222450f = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List<String> f222451g = n();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final List<String> f222452h = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c7.a f222453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f222454b = false;

    class a extends ThreadLocal<SimpleDateFormat> {
        a() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    class b extends ThreadLocal<SimpleDateFormat> {
        b() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    class c extends ThreadLocal<SimpleDateFormat> {
        c() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    private static final class d {

        static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final double f222455a;

            a(double d15) {
                this.f222455a = d15;
            }

            double a() {
                return this.f222455a / 2.23694d;
            }
        }

        static a a(double d15) {
            return new a(d15 * 0.621371d);
        }

        static a b(double d15) {
            return new a(d15 * 1.15078d);
        }

        static a c(double d15) {
            return new a(d15);
        }
    }

    private f(c7.a aVar) {
        this.f222453a = aVar;
    }

    private void a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strF = f(jCurrentTimeMillis);
        this.f222453a.h0("DateTime", strF);
        try {
            this.f222453a.h0("SubSecTime", Long.toString(jCurrentTimeMillis - d(strF).getTime()));
        } catch (ParseException unused) {
        }
    }

    private static Date c(String str) {
        return f222448d.get().parse(str);
    }

    private static Date d(String str) {
        return f222450f.get().parse(str);
    }

    private static Date e(String str) {
        return f222449e.get().parse(str);
    }

    private static String f(long j15) {
        return f222450f.get().format(new Date(j15));
    }

    public static f h(File file) {
        return i(file.toString());
    }

    public static f i(String str) {
        return new f(new c7.a(str));
    }

    public static f j(androidx.camera.core.o oVar) {
        ByteBuffer byteBufferV = oVar.o2()[0].v();
        byteBufferV.rewind();
        byte[] bArr = new byte[byteBufferV.capacity()];
        byteBufferV.get(bArr);
        return k(new ByteArrayInputStream(bArr));
    }

    public static f k(InputStream inputStream) {
        return new f(new c7.a(inputStream));
    }

    public static List<String> n() {
        return Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    }

    private long x(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return d(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    private long y(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return c(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        }
        if (str == null) {
            try {
                return e(str2).getTime();
            } catch (ParseException unused2) {
                return -1L;
            }
        }
        return x(str + " " + str2);
    }

    public void A() throws Throwable {
        if (!this.f222454b) {
            a();
        }
        this.f222453a.c0();
    }

    public void b(Location location) {
        this.f222453a.i0(location);
    }

    public void g(f fVar) {
        ArrayList<String> arrayList = new ArrayList(f222451g);
        arrayList.removeAll(f222452h);
        for (String str : arrayList) {
            String strK = this.f222453a.k(str);
            String strK2 = fVar.f222453a.k(str);
            if (strK != null && !strK.equals(strK2)) {
                fVar.f222453a.h0(str, strK);
            }
        }
    }

    public void l() {
        int i15;
        switch (r()) {
            case 2:
                i15 = 1;
                break;
            case 3:
                i15 = 4;
                break;
            case 4:
                i15 = 3;
                break;
            case 5:
                i15 = 6;
                break;
            case 6:
                i15 = 5;
                break;
            case 7:
                i15 = 8;
                break;
            case 8:
                i15 = 7;
                break;
            default:
                i15 = 2;
                break;
        }
        this.f222453a.h0("Orientation", String.valueOf(i15));
    }

    public void m() {
        int i15;
        switch (r()) {
            case 2:
                i15 = 3;
                break;
            case 3:
                i15 = 2;
                break;
            case 4:
                i15 = 1;
                break;
            case 5:
                i15 = 8;
                break;
            case 6:
                i15 = 7;
                break;
            case 7:
                i15 = 6;
                break;
            case 8:
                i15 = 5;
                break;
            default:
                i15 = 4;
                break;
        }
        this.f222453a.h0("Orientation", String.valueOf(i15));
    }

    public String o() {
        return this.f222453a.k("ImageDescription");
    }

    public int p() {
        return this.f222453a.m("ImageLength", 0);
    }

    public Location q() {
        double dA;
        String strK = this.f222453a.k("GPSProcessingMethod");
        double[] dArrQ = this.f222453a.q();
        double dJ = this.f222453a.j(0.0d);
        double dL = this.f222453a.l("GPSSpeed", 0.0d);
        String strK2 = this.f222453a.k("GPSSpeedRef");
        if (strK2 == null) {
            strK2 = "K";
        }
        long jY = y(this.f222453a.k("GPSDateStamp"), this.f222453a.k("GPSTimeStamp"));
        if (dArrQ == null) {
            return null;
        }
        if (strK == null) {
            strK = f222447c;
        }
        Location location = new Location(strK);
        location.setLatitude(dArrQ[0]);
        location.setLongitude(dArrQ[1]);
        if (dJ != 0.0d) {
            location.setAltitude(dJ);
        }
        if (dL != 0.0d) {
            int iHashCode = strK2.hashCode();
            if (iHashCode != 75) {
                if (iHashCode != 77) {
                    if (iHashCode == 78 && strK2.equals("N")) {
                        dA = d.b(dL).a();
                    }
                } else if (strK2.equals("M")) {
                    dA = d.c(dL).a();
                }
                location.setSpeed((float) dA);
            } else {
                strK2.equals("K");
            }
            dA = d.a(dL).a();
            location.setSpeed((float) dA);
        }
        if (jY != -1) {
            location.setTime(jY);
        }
        return location;
    }

    public int r() {
        return this.f222453a.m("Orientation", 0);
    }

    public int s() {
        switch (r()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public long t() {
        long jX = x(this.f222453a.k("DateTimeOriginal"));
        if (jX == -1) {
            return -1L;
        }
        String strK = this.f222453a.k("SubSecTimeOriginal");
        if (strK == null) {
            return jX;
        }
        try {
            long j15 = Long.parseLong(strK);
            while (j15 > 1000) {
                j15 /= 10;
            }
            return jX + j15;
        } catch (NumberFormatException unused) {
            return jX;
        }
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(u()), Integer.valueOf(p()), Integer.valueOf(s()), Boolean.valueOf(w()), Boolean.valueOf(v()), q(), Long.valueOf(t()), o());
    }

    public int u() {
        return this.f222453a.m("ImageWidth", 0);
    }

    public boolean v() {
        return r() == 2;
    }

    public boolean w() {
        int iR = r();
        return iR == 4 || iR == 5 || iR == 7;
    }

    public void z(int i15) {
        if (i15 % 90 != 0) {
            e1.o(f222447c, String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", Integer.valueOf(i15)));
            this.f222453a.h0("Orientation", String.valueOf(0));
            return;
        }
        int i16 = i15 % 360;
        int iR = r();
        while (i16 < 0) {
            i16 += 90;
            switch (iR) {
                case 2:
                    iR = 5;
                    break;
                case 3:
                case 8:
                    iR = 6;
                    break;
                case 4:
                    iR = 7;
                    break;
                case 5:
                    iR = 4;
                    break;
                case 6:
                    iR = 1;
                    break;
                case 7:
                    iR = 2;
                    break;
                default:
                    iR = 8;
                    break;
            }
        }
        while (i16 > 0) {
            i16 -= 90;
            switch (iR) {
                case 2:
                    iR = 7;
                    break;
                case 3:
                    iR = 8;
                    break;
                case 4:
                    iR = 5;
                    break;
                case 5:
                    iR = 2;
                    break;
                case 6:
                    iR = 3;
                    break;
                case 7:
                    iR = 4;
                    break;
                case 8:
                    iR = 1;
                    break;
                default:
                    iR = 6;
                    break;
            }
        }
        this.f222453a.h0("Orientation", String.valueOf(iR));
    }
}
