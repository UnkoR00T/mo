package gv;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import fr.t;
import fu.o;
import fu.r;
import fv.c0;
import fv.d0;
import fv.e0;
import fv.u;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import lr.m;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;
import pq.n;
import pq.s0;
import pq.v;
import pq.v0;
import vv.e;
import vv.f;
import vv.g;
import vv.h;
import vv.k0;
import vv.z;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0092\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a%\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e*\b\u0012\u0004\u0012\u00020\u00070\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a7\u0010\u0014\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0018\u001a\u00020\u0007*\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019\u001a-\u0010\u001c\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u001a\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u001c\u0010\u001d\u001a%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a%\u0010\"\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010#\u001a%\u0010$\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b$\u0010#\u001a%\u0010%\u001a\u00020\u0007*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b%\u0010&\u001a-\u0010(\u001a\u00020\u001b*\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b(\u0010)\u001a-\u0010,\u001a\u00020\u001b*\u00020\u00072\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b,\u0010-\u001a\u0011\u0010.\u001a\u00020\u001b*\u00020\u0007¢\u0006\u0004\b.\u0010/\u001a\u0011\u00100\u001a\u00020\t*\u00020\u0007¢\u0006\u0004\b0\u00101\u001a\u0015\u00102\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b2\u00101\u001a)\u00106\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00072\u0012\u00105\u001a\n\u0012\u0006\b\u0001\u0012\u0002040\u000e\"\u000204¢\u0006\u0004\b6\u00107\u001a\u0019\u0010;\u001a\u000209*\u0002082\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<\u001a'\u0010@\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00002\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b@\u0010A\u001a\u0011\u0010B\u001a\u00020\u001b*\u00020*¢\u0006\u0004\bB\u0010C\u001a\u0017\u0010G\u001a\u00020F*\b\u0012\u0004\u0012\u00020E0D¢\u0006\u0004\bG\u0010H\u001a\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020E0D*\u00020F¢\u0006\u0004\bI\u0010J\u001a\u0019\u0010K\u001a\u00020\t*\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0016¢\u0006\u0004\bK\u0010L\u001a\u0011\u0010O\u001a\u00020N*\u00020M¢\u0006\u0004\bO\u0010P\u001a\u001c\u0010S\u001a\u00020\u001b*\u00020Q2\u0006\u0010R\u001a\u00020\u001bH\u0086\u0004¢\u0006\u0004\bS\u0010T\u001a\u001c\u0010V\u001a\u00020\u001b*\u00020U2\u0006\u0010R\u001a\u00020\u001bH\u0086\u0004¢\u0006\u0004\bV\u0010W\u001a\u001c\u0010X\u001a\u00020\u0000*\u00020\u001b2\u0006\u0010R\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\bX\u0010Y\u001a\u0019\u0010\\\u001a\u00020\u0004*\u00020Z2\u0006\u0010[\u001a\u00020\u001b¢\u0006\u0004\b\\\u0010]\u001a\u0011\u0010^\u001a\u00020\u001b*\u000208¢\u0006\u0004\b^\u0010_\u001a!\u0010b\u001a\u00020\t*\u00020`2\u0006\u0010=\u001a\u00020\u001b2\u0006\u0010a\u001a\u00020>¢\u0006\u0004\bb\u0010c\u001a!\u0010e\u001a\u00020\t*\u00020`2\u0006\u0010d\u001a\u00020\u001b2\u0006\u0010a\u001a\u00020>¢\u0006\u0004\be\u0010c\u001a\u0019\u0010h\u001a\u00020\t*\u00020f2\u0006\u0010g\u001a\u000208¢\u0006\u0004\bh\u0010i\u001a\u0019\u0010l\u001a\u00020\u001b*\u00020j2\u0006\u0010k\u001a\u00020Q¢\u0006\u0004\bl\u0010m\u001a\u001b\u0010n\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b¢\u0006\u0004\bn\u0010o\u001a\u0011\u0010q\u001a\u00020\u0000*\u00020p¢\u0006\u0004\bq\u0010r\u001a\u0019\u0010t\u001a\u00020\u0000*\u00020\u00072\u0006\u0010s\u001a\u00020\u0000¢\u0006\u0004\bt\u0010u\u001a\u001b\u0010v\u001a\u00020\u001b*\u0004\u0018\u00010\u00072\u0006\u0010s\u001a\u00020\u001b¢\u0006\u0004\bv\u0010o\u001a#\u0010x\u001a\b\u0012\u0004\u0012\u00028\u00000D\"\u0004\b\u0000\u0010w*\b\u0012\u0004\u0012\u00028\u00000D¢\u0006\u0004\bx\u0010y\u001a/\u0010{\u001a\b\u0012\u0004\u0012\u00028\u00000D\"\u0004\b\u0000\u0010w2\u0012\u0010z\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000e\"\u00028\u0000H\u0007¢\u0006\u0004\b{\u0010|\u001a5\u0010w\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010}\"\u0004\b\u0000\u0010l\"\u0004\b\u0001\u0010v*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010}¢\u0006\u0004\bw\u0010~\u001a\u0014\u0010\u0080\u0001\u001a\u00020\u0004*\u00020\u007f¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0014\u0010\u0082\u0001\u001a\u00020\u0004*\u00020f¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a,\u0010\u0086\u0001\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0012*\t\u0012\u0004\u0012\u00028\u00000\u0084\u00012\u0007\u0010\u0085\u0001\u001a\u00028\u0000H\u0000¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a0\u0010\u008c\u0001\u001a\u00030\u008b\u0001*\b0\u0088\u0001j\u0003`\u0089\u00012\u0013\u0010\u008a\u0001\u001a\u000e\u0012\n\u0012\b0\u0088\u0001j\u0003`\u0089\u00010D¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0016\u0010\u0093\u0001\u001a\u00020F8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\bk\u0010\u0092\u0001\"\u0018\u0010\u0096\u0001\u001a\u00030\u0094\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0095\u0001\"\u0017\u0010\u0099\u0001\u001a\u00030\u0097\u00018\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\bS\u0010\u0098\u0001\"\u0017\u0010\u009c\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bV\u0010\u009b\u0001\"\u0017\u0010\u009f\u0001\u001a\u00030\u009d\u00018\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\bX\u0010\u009e\u0001\"\u0017\u0010¢\u0001\u001a\u00030 \u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bO\u0010¡\u0001\"\u0016\u0010¤\u0001\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u0007\n\u0005\b£\u0001\u0010\\\"\u0016\u0010¦\u0001\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0007\n\u0005\b0\u0010¥\u0001¨\u0006§\u0001"}, d2 = {"", "arrayLength", "offset", "count", "Loq/i0;", "l", "(JJJ)V", "", "name", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "M", "(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;", "", "other", "Ljava/util/Comparator;", "comparator", "E", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "u", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "Lfv/v;", "includeDefaultPort", "Q", "(Lfv/v;Z)Ljava/lang/String;", "value", "", "x", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "o", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "z", "(Ljava/lang/String;II)I", "B", "W", "(Ljava/lang/String;II)Ljava/lang/String;", "delimiters", "q", "(Ljava/lang/String;Ljava/lang/String;II)I", "", "delimiter", "p", "(Ljava/lang/String;CII)I", "y", "(Ljava/lang/String;)I", "i", "(Ljava/lang/String;)Z", "G", "format", "", "args", "t", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lvv/g;", "Ljava/nio/charset/Charset;", "default", "I", "(Lvv/g;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "k", "(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I", i.f37087n, "(C)I", "", "Lnv/c;", "Lfv/u;", i.f37086m, "(Ljava/util/List;)Lfv/u;", "O", "(Lfv/u;)Ljava/util/List;", "j", "(Lfv/v;Lfv/v;)Z", "Lfv/r;", "Lfv/r$c;", "g", "(Lfv/r;)Lfv/r$c;", "", "mask", "d", "(BI)I", "", "e", "(SI)I", "f", "(IJ)J", "Lvv/f;", "medium", "Z", "(Lvv/f;I)V", "J", "(Lvv/g;)I", "Lvv/k0;", "timeUnit", i.f37094u, "(Lvv/k0;ILjava/util/concurrent/TimeUnit;)Z", "timeout", "s", "Ljava/net/Socket;", "source", "F", "(Ljava/net/Socket;Lvv/g;)Z", "Lvv/e;", "b", "K", "(Lvv/e;B)I", ip.a.f96138c, "(Ljava/lang/String;I)I", "Lfv/d0;", "v", "(Lfv/d0;)J", "defaultValue", "U", "(Ljava/lang/String;J)J", "V", "T", ip.a.f96137b, "(Ljava/util/List;)Ljava/util/List;", "elements", "w", "([Ljava/lang/Object;)Ljava/util/List;", "", "(Ljava/util/Map;)Ljava/util/Map;", "Ljava/io/Closeable;", "m", "(Ljava/io/Closeable;)V", "n", "(Ljava/net/Socket;)V", "", "element", "c", "(Ljava/util/List;Ljava/lang/Object;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "", "Y", "(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;", "", "a", "[B", "EMPTY_BYTE_ARRAY", "Lfv/u;", "EMPTY_HEADERS", "Lfv/e0;", "Lfv/e0;", "EMPTY_RESPONSE", "Lfv/c0;", "Lfv/c0;", "EMPTY_REQUEST", "Lvv/z;", "Lvv/z;", "UNICODE_BOMS", "Ljava/util/TimeZone;", "Ljava/util/TimeZone;", "UTC", "Lfu/o;", "Lfu/o;", "VERIFY_AS_IP_ADDRESS", "h", "assertionsEnabled", "Ljava/lang/String;", "okHttpName", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f77103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f77104b = u.INSTANCE.g(new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f77105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c0 f77106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final z f77107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final TimeZone f77108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final o f77109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f77110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f77111i;

    static {
        byte[] bArr = new byte[0];
        f77103a = bArr;
        f77105c = e0.Companion.d(e0.INSTANCE, bArr, null, 1, null);
        f77106d = c0.Companion.k(c0.INSTANCE, bArr, null, 0, 0, 7, null);
        z.Companion aVar = z.INSTANCE;
        h.Companion companion = h.INSTANCE;
        f77107e = aVar.d(companion.b("efbbbf"), companion.b("feff"), companion.b("fffe"), companion.b("0000ffff"), companion.b("ffff0000"));
        f77108f = TimeZone.getTimeZone("GMT");
        f77109g = new o("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f77110h = false;
        f77111i = r.O0(r.M0(fv.z.class.getName(), "okhttp3."), "Client");
    }

    public static /* synthetic */ int A(String str, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i15 = 0;
        }
        if ((i17 & 2) != 0) {
            i16 = str.length();
        }
        return z(str, i15, i16);
    }

    public static final int B(String str, int i15, int i16) {
        int i17 = i16 - 1;
        if (i15 <= i17) {
            while (true) {
                char cCharAt = str.charAt(i17);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i17 + 1;
                }
                if (i17 != i15) {
                    i17--;
                }
            }
        }
        return i15;
    }

    public static /* synthetic */ int C(String str, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i15 = 0;
        }
        if ((i17 & 2) != 0) {
            i16 = str.length();
        }
        return B(str, i15, i16);
    }

    public static final int D(String str, int i15) {
        int length = str.length();
        while (i15 < length) {
            char cCharAt = str.charAt(i15);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i15;
            }
            i15++;
        }
        return str.length();
    }

    public static final String[] E(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean F(Socket socket, g gVar) {
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !gVar.K2();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean G(String str) {
        return r.G(str, "Authorization", true) || r.G(str, "Cookie", true) || r.G(str, "Proxy-Authorization", true) || r.G(str, "Set-Cookie", true);
    }

    public static final int H(char c15) {
        if ('0' <= c15 && c15 < ':') {
            return c15 - '0';
        }
        if ('a' <= c15 && c15 < 'g') {
            return c15 - 'W';
        }
        if ('A' > c15 || c15 >= 'G') {
            return -1;
        }
        return c15 - '7';
    }

    public static final Charset I(g gVar, Charset charset) {
        int iC1 = gVar.c1(f77107e);
        if (iC1 == -1) {
            return charset;
        }
        if (iC1 == 0) {
            return StandardCharsets.UTF_8;
        }
        if (iC1 == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (iC1 == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (iC1 == 3) {
            return fu.d.f67020a.a();
        }
        if (iC1 == 4) {
            return fu.d.f67020a.b();
        }
        throw new AssertionError();
    }

    public static final int J(g gVar) {
        return d(gVar.readByte(), GF2Field.MASK) | (d(gVar.readByte(), GF2Field.MASK) << 16) | (d(gVar.readByte(), GF2Field.MASK) << 8);
    }

    public static final int K(e eVar, byte b15) {
        int i15 = 0;
        while (!eVar.K2() && eVar.I(0L) == b15) {
            i15++;
            eVar.readByte();
        }
        return i15;
    }

    public static final boolean L(k0 k0Var, int i15, TimeUnit timeUnit) {
        long jNanoTime = System.nanoTime();
        long jC = k0Var.getTimeout().getHasDeadline() ? k0Var.getTimeout().c() - jNanoTime : Long.MAX_VALUE;
        k0Var.getTimeout().d(Math.min(jC, timeUnit.toNanos(i15)) + jNanoTime);
        try {
            e eVar = new e();
            while (k0Var.k3(eVar, 8192L) != -1) {
                eVar.b();
            }
            if (jC == Long.MAX_VALUE) {
                k0Var.getTimeout().a();
                return true;
            }
            k0Var.getTimeout().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                k0Var.getTimeout().a();
                return false;
            }
            k0Var.getTimeout().d(jNanoTime + jC);
            return false;
        } catch (Throwable th4) {
            if (jC == Long.MAX_VALUE) {
                k0Var.getTimeout().a();
            } else {
                k0Var.getTimeout().d(jNanoTime + jC);
            }
            throw th4;
        }
    }

    public static final ThreadFactory M(final String str, final boolean z15) {
        return new ThreadFactory() { // from class: gv.c
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return d.N(str, z15, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread N(String str, boolean z15, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z15);
        return thread;
    }

    public static final List<nv.c> O(u uVar) {
        lr.i iVarW = m.w(0, uVar.size());
        ArrayList arrayList = new ArrayList(v.y(iVarW, 10));
        Iterator<Integer> it = iVarW.iterator();
        while (it.hasNext()) {
            int iNextInt = ((s0) it).nextInt();
            arrayList.add(new nv.c(uVar.f(iNextInt), uVar.k(iNextInt)));
        }
        return arrayList;
    }

    public static final u P(List<nv.c> list) {
        u.a aVar = new u.a();
        for (nv.c cVar : list) {
            aVar.d(cVar.getName().Y(), cVar.getValue().Y());
        }
        return aVar.f();
    }

    public static final String Q(fv.v vVar, boolean z15) {
        String strI;
        if (r.d0(vVar.getHost(), ":", false, 2, null)) {
            strI = '[' + vVar.getHost() + ']';
        } else {
            strI = vVar.getHost();
        }
        if (!z15 && vVar.getPort() == fv.v.INSTANCE.c(vVar.getScheme())) {
            return strI;
        }
        return strI + ':' + vVar.getPort();
    }

    public static /* synthetic */ String R(fv.v vVar, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        return Q(vVar, z15);
    }

    public static final <T> List<T> S(List<? extends T> list) {
        return Collections.unmodifiableList(v.i1(list));
    }

    public static final <K, V> Map<K, V> T(Map<K, ? extends V> map) {
        return map.isEmpty() ? v0.i() : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static final long U(String str, long j15) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j15;
        }
    }

    public static final int V(String str, int i15) {
        if (str != null) {
            try {
                long j15 = Long.parseLong(str);
                if (j15 > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j15 < 0) {
                    return 0;
                }
                return (int) j15;
            } catch (NumberFormatException unused) {
            }
        }
        return i15;
    }

    public static final String W(String str, int i15, int i16) {
        int iZ = z(str, i15, i16);
        return str.substring(iZ, B(str, iZ, i16));
    }

    public static /* synthetic */ String X(String str, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i15 = 0;
        }
        if ((i17 & 2) != 0) {
            i16 = str.length();
        }
        return W(str, i15, i16);
    }

    public static final Throwable Y(Exception exc, List<? extends Exception> list) {
        Iterator<? extends Exception> it = list.iterator();
        while (it.hasNext()) {
            oq.c.a(exc, it.next());
        }
        return exc;
    }

    public static final void Z(f fVar, int i15) {
        fVar.writeByte((i15 >>> 16) & GF2Field.MASK);
        fVar.writeByte((i15 >>> 8) & GF2Field.MASK);
        fVar.writeByte(i15 & GF2Field.MASK);
    }

    public static final <E> void c(List<E> list, E e15) {
        if (list.contains(e15)) {
            return;
        }
        list.add(e15);
    }

    public static final int d(byte b15, int i15) {
        return b15 & i15;
    }

    public static final int e(short s15, int i15) {
        return s15 & i15;
    }

    public static final long f(int i15, long j15) {
        return ((long) i15) & j15;
    }

    public static final fv.r.c g(final fv.r rVar) {
        return new fv.r.c() { // from class: gv.b
            @Override // fv.r.c
            public final fv.r a(fv.e eVar) {
                return d.h(rVar, eVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fv.r h(fv.r rVar, fv.e eVar) {
        return rVar;
    }

    public static final boolean i(String str) {
        return f77109g.f(str);
    }

    public static final boolean j(fv.v vVar, fv.v vVar2) {
        return t.c(vVar.getHost(), vVar2.getHost()) && vVar.getPort() == vVar2.getPort() && t.c(vVar.getScheme(), vVar2.getScheme());
    }

    public static final int k(String str, long j15, TimeUnit timeUnit) {
        if (j15 < 0) {
            throw new IllegalStateException((str + " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j15);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException((str + " too large.").toString());
        }
        if (millis != 0 || j15 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((str + " too small.").toString());
    }

    public static final void l(long j15, long j16, long j17) {
        if ((j16 | j17) < 0 || j16 > j15 || j15 - j16 < j17) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void m(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e15) {
            throw e15;
        } catch (Exception unused) {
        }
    }

    public static final void n(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e15) {
            throw e15;
        } catch (RuntimeException e16) {
            if (!t.c(e16.getMessage(), "bio == null")) {
                throw e16;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] o(String[] strArr, String str) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
        strArr2[n.v0(strArr2)] = str;
        return strArr2;
    }

    public static final int p(String str, char c15, int i15, int i16) {
        while (i15 < i16) {
            if (str.charAt(i15) == c15) {
                return i15;
            }
            i15++;
        }
        return i16;
    }

    public static final int q(String str, String str2, int i15, int i16) {
        while (i15 < i16) {
            if (r.c0(str2, str.charAt(i15), false, 2, null)) {
                return i15;
            }
            i15++;
        }
        return i16;
    }

    public static /* synthetic */ int r(String str, char c15, int i15, int i16, int i17, Object obj) {
        if ((i17 & 2) != 0) {
            i15 = 0;
        }
        if ((i17 & 4) != 0) {
            i16 = str.length();
        }
        return p(str, c15, i15, i16);
    }

    public static final boolean s(k0 k0Var, int i15, TimeUnit timeUnit) {
        try {
            return L(k0Var, i15, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String t(String str, Object... objArr) {
        fr.v0 v0Var = fr.v0.f66418a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean u(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator itA = fr.c.a(strArr2);
                while (itA.hasNext()) {
                    if (comparator.compare(str, (String) itA.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long v(d0 d0Var) {
        String strE = d0Var.getHeaders().e("Content-Length");
        if (strE != null) {
            return U(strE, -1L);
        }
        return -1L;
    }

    @SafeVarargs
    public static final <T> List<T> w(T... tArr) {
        Object[] objArr = (Object[]) tArr.clone();
        return Collections.unmodifiableList(v.q(Arrays.copyOf(objArr, objArr.length)));
    }

    public static final int x(String[] strArr, String str, Comparator<String> comparator) {
        int length = strArr.length;
        for (int i15 = 0; i15 < length; i15++) {
            if (comparator.compare(strArr[i15], str) == 0) {
                return i15;
            }
        }
        return -1;
    }

    public static final int y(String str) {
        int length = str.length();
        for (int i15 = 0; i15 < length; i15++) {
            char cCharAt = str.charAt(i15);
            if (t.d(cCharAt, 31) <= 0 || t.d(cCharAt, CertificateBody.profileType) >= 0) {
                return i15;
            }
        }
        return -1;
    }

    public static final int z(String str, int i15, int i16) {
        while (i15 < i16) {
            char cCharAt = str.charAt(i15);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i15;
            }
            i15++;
        }
        return i16;
    }
}
