package nv;

import fr.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;
import vv.k0;
import vv.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\n\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u000e\u0010\b¨\u0006\u0015"}, d2 = {"Lnv/d;", "", "<init>", "()V", "", "Lvv/h;", "", "d", "()Ljava/util/Map;", "name", "a", "(Lvv/h;)Lvv/h;", "", "Lnv/c;", "b", "[Lnv/c;", "c", "()[Lnv/c;", "STATIC_HEADER_TABLE", "Ljava/util/Map;", "NAME_TO_FIRST_INDEX", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f138922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final c[] STATIC_HEADER_TABLE;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Map<vv.h, Integer> NAME_TO_FIRST_INDEX;

    static {
        d dVar = new d();
        f138922a = dVar;
        c cVar = new c(c.f138918j, "");
        vv.h hVar = c.f138915g;
        c cVar2 = new c(hVar, "GET");
        c cVar3 = new c(hVar, "POST");
        vv.h hVar2 = c.f138916h;
        c cVar4 = new c(hVar2, "/");
        c cVar5 = new c(hVar2, "/index.html");
        vv.h hVar3 = c.f138917i;
        c cVar6 = new c(hVar3, "http");
        c cVar7 = new c(hVar3, "https");
        vv.h hVar4 = c.f138914f;
        STATIC_HEADER_TABLE = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(hVar4, "200"), new c(hVar4, "204"), new c(hVar4, "206"), new c(hVar4, "304"), new c(hVar4, "400"), new c(hVar4, "404"), new c(hVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        NAME_TO_FIRST_INDEX = dVar.d();
    }

    private d() {
    }

    private final Map<vv.h, Integer> d() {
        c[] cVarArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int length = cVarArr.length;
        for (int i15 = 0; i15 < length; i15++) {
            c[] cVarArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(cVarArr2[i15].name)) {
                linkedHashMap.put(cVarArr2[i15].name, Integer.valueOf(i15));
            }
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public final vv.h a(vv.h name) throws IOException {
        int iQ = name.Q();
        for (int i15 = 0; i15 < iQ; i15++) {
            byte bN = name.n(i15);
            if (65 <= bN && bN < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.Y());
            }
        }
        return name;
    }

    public final Map<vv.h, Integer> b() {
        return NAME_TO_FIRST_INDEX;
    }

    public final c[] c() {
        return STATIC_HEADER_TABLE;
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0%¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\t¢\u0006\u0004\b(\u0010\u000bJ\u001d\u0010+\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0004¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0019¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010/R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u001f008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00101R\u0014\u0010\u0003\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00104R\u001e\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b&\u00106R\u0016\u00108\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010/R\u0016\u00109\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b!\u0010/R\u0016\u0010:\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010/¨\u0006;"}, d2 = {"Lnv/d$a;", "", "Lvv/k0;", "source", "", "headerTableSizeSetting", "maxDynamicTableByteCount", "<init>", "(Lvv/k0;II)V", "Loq/i0;", "a", "()V", "b", "bytesToRecover", "d", "(I)I", "index", "l", "(I)V", "c", "p", "q", "nameIndex", "n", "o", "Lvv/h;", "f", "(I)Lvv/h;", "", "h", "(I)Z", "Lnv/c;", "entry", "g", "(ILnv/c;)V", "i", "()I", "", "e", "()Ljava/util/List;", "k", "firstByte", "prefixMask", "m", "(II)I", "j", "()Lvv/h;", "I", "", "Ljava/util/List;", "headerList", "Lvv/g;", "Lvv/g;", "", "[Lnv/c;", "dynamicTable", "nextHeaderIndex", "headerCount", "dynamicTableByteCount", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int headerTableSizeSetting;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int maxDynamicTableByteCount;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<c> headerList;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final vv.g source;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public c[] dynamicTable;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private int nextHeaderIndex;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public int headerCount;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public int dynamicTableByteCount;

        public a(k0 k0Var, int i15, int i16) {
            this.headerTableSizeSetting = i15;
            this.maxDynamicTableByteCount = i16;
            this.headerList = new ArrayList();
            this.source = v.c(k0Var);
            c[] cVarArr = new c[8];
            this.dynamicTable = cVarArr;
            this.nextHeaderIndex = cVarArr.length - 1;
        }

        private final void a() {
            int i15 = this.maxDynamicTableByteCount;
            int i16 = this.dynamicTableByteCount;
            if (i15 < i16) {
                if (i15 == 0) {
                    b();
                } else {
                    d(i16 - i15);
                }
            }
        }

        private final void b() {
            pq.n.E(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int c(int index) {
            return this.nextHeaderIndex + 1 + index;
        }

        private final int d(int bytesToRecover) {
            int i15;
            int i16 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i15 = this.nextHeaderIndex;
                    if (length < i15 || bytesToRecover <= 0) {
                        break;
                    }
                    int i17 = this.dynamicTable[length].hpackSize;
                    bytesToRecover -= i17;
                    this.dynamicTableByteCount -= i17;
                    this.headerCount--;
                    i16++;
                }
                c[] cVarArr = this.dynamicTable;
                System.arraycopy(cVarArr, i15 + 1, cVarArr, i15 + 1 + i16, this.headerCount);
                this.nextHeaderIndex += i16;
            }
            return i16;
        }

        private final vv.h f(int index) throws IOException {
            if (h(index)) {
                return d.f138922a.c()[index].name;
            }
            int iC = c(index - d.f138922a.c().length);
            if (iC >= 0) {
                c[] cVarArr = this.dynamicTable;
                if (iC < cVarArr.length) {
                    return cVarArr[iC].name;
                }
            }
            throw new IOException("Header index too large " + (index + 1));
        }

        private final void g(int index, c entry) {
            this.headerList.add(entry);
            int i15 = entry.hpackSize;
            if (index != -1) {
                i15 -= this.dynamicTable[c(index)].hpackSize;
            }
            int i16 = this.maxDynamicTableByteCount;
            if (i15 > i16) {
                b();
                return;
            }
            int iD = d((this.dynamicTableByteCount + i15) - i16);
            if (index == -1) {
                int i17 = this.headerCount + 1;
                c[] cVarArr = this.dynamicTable;
                if (i17 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = cVarArr2;
                }
                int i18 = this.nextHeaderIndex;
                this.nextHeaderIndex = i18 - 1;
                this.dynamicTable[i18] = entry;
                this.headerCount++;
            } else {
                this.dynamicTable[index + c(index) + iD] = entry;
            }
            this.dynamicTableByteCount += i15;
        }

        private final boolean h(int index) {
            return index >= 0 && index <= d.f138922a.c().length - 1;
        }

        private final int i() {
            return gv.d.d(this.source.readByte(), GF2Field.MASK);
        }

        private final void l(int index) throws IOException {
            if (h(index)) {
                this.headerList.add(d.f138922a.c()[index]);
                return;
            }
            int iC = c(index - d.f138922a.c().length);
            if (iC >= 0) {
                c[] cVarArr = this.dynamicTable;
                if (iC < cVarArr.length) {
                    this.headerList.add(cVarArr[iC]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (index + 1));
        }

        private final void n(int nameIndex) {
            g(-1, new c(f(nameIndex), j()));
        }

        private final void o() {
            g(-1, new c(d.f138922a.a(j()), j()));
        }

        private final void p(int index) throws IOException {
            this.headerList.add(new c(f(index), j()));
        }

        private final void q() throws IOException {
            this.headerList.add(new c(d.f138922a.a(j()), j()));
        }

        public final List<c> e() {
            List<c> listF1 = pq.v.f1(this.headerList);
            this.headerList.clear();
            return listF1;
        }

        public final vv.h j() {
            int i15 = i();
            boolean z15 = (i15 & 128) == 128;
            long jM = m(i15, CertificateBody.profileType);
            if (!z15) {
                return this.source.r2(jM);
            }
            vv.e eVar = new vv.e();
            k.f139075a.b(this.source, jM, eVar);
            return eVar.d0();
        }

        public final void k() throws IOException {
            while (!this.source.K2()) {
                int iD = gv.d.d(this.source.readByte(), GF2Field.MASK);
                if (iD == 128) {
                    throw new IOException("index == 0");
                }
                if ((iD & 128) == 128) {
                    l(m(iD, CertificateBody.profileType) - 1);
                } else if (iD == 64) {
                    o();
                } else if ((iD & 64) == 64) {
                    n(m(iD, 63) - 1);
                } else if ((iD & 32) == 32) {
                    int iM = m(iD, 31);
                    this.maxDynamicTableByteCount = iM;
                    if (iM < 0 || iM > this.headerTableSizeSetting) {
                        throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                    }
                    a();
                } else if (iD == 16 || iD == 0) {
                    q();
                } else {
                    p(m(iD, 15) - 1);
                }
            }
        }

        public final int m(int firstByte, int prefixMask) {
            int i15 = firstByte & prefixMask;
            if (i15 < prefixMask) {
                return i15;
            }
            int i16 = 0;
            while (true) {
                int i17 = i();
                if ((i17 & 128) == 0) {
                    return prefixMask + (i17 << i16);
                }
                prefixMask += (i17 & CertificateBody.profileType) << i16;
                i16 += 7;
            }
        }

        public /* synthetic */ a(k0 k0Var, int i15, int i16, int i17, fr.k kVar) {
            this(k0Var, i15, (i17 & 4) != 0 ? i15 : i16);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u001b\u0010\u0017\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010%R\u0016\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010$R\u001e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100*8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010+R\u0016\u0010-\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010$R\u0016\u0010/\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b.\u0010$R\u0016\u00101\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b0\u0010$¨\u00062"}, d2 = {"Lnv/d$b;", "", "", "headerTableSizeSetting", "", "useCompression", "Lvv/e;", "out", "<init>", "(IZLvv/e;)V", "Loq/i0;", "b", "()V", "bytesToRecover", "c", "(I)I", "Lnv/c;", "entry", "d", "(Lnv/c;)V", "a", "", "headerBlock", "g", "(Ljava/util/List;)V", "value", "prefixMask", "bits", "h", "(III)V", "Lvv/h;", "data", "f", "(Lvv/h;)V", "e", "(I)V", "I", "Z", "Lvv/e;", "smallestHeaderTableSizeSetting", "emitDynamicTableSizeUpdate", "maxDynamicTableByteCount", "", "[Lnv/c;", "dynamicTable", "nextHeaderIndex", "i", "headerCount", "j", "dynamicTableByteCount", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public int headerTableSizeSetting;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean useCompression;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final vv.e out;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int smallestHeaderTableSizeSetting;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean emitDynamicTableSizeUpdate;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public int maxDynamicTableByteCount;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public c[] dynamicTable;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private int nextHeaderIndex;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public int headerCount;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public int dynamicTableByteCount;

        public b(int i15, boolean z15, vv.e eVar) {
            this.headerTableSizeSetting = i15;
            this.useCompression = z15;
            this.out = eVar;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i15;
            c[] cVarArr = new c[8];
            this.dynamicTable = cVarArr;
            this.nextHeaderIndex = cVarArr.length - 1;
        }

        private final void a() {
            int i15 = this.maxDynamicTableByteCount;
            int i16 = this.dynamicTableByteCount;
            if (i15 < i16) {
                if (i15 == 0) {
                    b();
                } else {
                    c(i16 - i15);
                }
            }
        }

        private final void b() {
            pq.n.E(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int c(int bytesToRecover) {
            int i15;
            int i16 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i15 = this.nextHeaderIndex;
                    if (length < i15 || bytesToRecover <= 0) {
                        break;
                    }
                    int i17 = this.dynamicTable[length].hpackSize;
                    bytesToRecover -= i17;
                    this.dynamicTableByteCount -= i17;
                    this.headerCount--;
                    i16++;
                }
                c[] cVarArr = this.dynamicTable;
                System.arraycopy(cVarArr, i15 + 1, cVarArr, i15 + 1 + i16, this.headerCount);
                c[] cVarArr2 = this.dynamicTable;
                int i18 = this.nextHeaderIndex;
                Arrays.fill(cVarArr2, i18 + 1, i18 + 1 + i16, (Object) null);
                this.nextHeaderIndex += i16;
            }
            return i16;
        }

        private final void d(c entry) {
            int i15 = entry.hpackSize;
            int i16 = this.maxDynamicTableByteCount;
            if (i15 > i16) {
                b();
                return;
            }
            c((this.dynamicTableByteCount + i15) - i16);
            int i17 = this.headerCount + 1;
            c[] cVarArr = this.dynamicTable;
            if (i17 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = cVarArr2;
            }
            int i18 = this.nextHeaderIndex;
            this.nextHeaderIndex = i18 - 1;
            this.dynamicTable[i18] = entry;
            this.headerCount++;
            this.dynamicTableByteCount += i15;
        }

        public final void e(int headerTableSizeSetting) {
            this.headerTableSizeSetting = headerTableSizeSetting;
            int iMin = Math.min(headerTableSizeSetting, 16384);
            int i15 = this.maxDynamicTableByteCount;
            if (i15 == iMin) {
                return;
            }
            if (iMin < i15) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, iMin);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = iMin;
            a();
        }

        public final void f(vv.h data) {
            if (this.useCompression) {
                k kVar = k.f139075a;
                if (kVar.d(data) < data.Q()) {
                    vv.e eVar = new vv.e();
                    kVar.c(data, eVar);
                    vv.h hVarD0 = eVar.d0();
                    h(hVarD0.Q(), CertificateBody.profileType, 128);
                    this.out.M0(hVarD0);
                    return;
                }
            }
            h(data.Q(), CertificateBody.profileType, 0);
            this.out.M0(data);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0072  */
        public final void g(List<c> headerBlock) {
            int length;
            int length2;
            if (this.emitDynamicTableSizeUpdate) {
                int i15 = this.smallestHeaderTableSizeSetting;
                if (i15 < this.maxDynamicTableByteCount) {
                    h(i15, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                h(this.maxDynamicTableByteCount, 31, 32);
            }
            int size = headerBlock.size();
            for (int i16 = 0; i16 < size; i16++) {
                c cVar = headerBlock.get(i16);
                vv.h hVarW = cVar.name.W();
                vv.h hVar = cVar.value;
                d dVar = d.f138922a;
                Integer num = dVar.b().get(hVarW);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 > length2 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else if (t.c(dVar.c()[iIntValue].value, hVar)) {
                        length = length2;
                    } else if (t.c(dVar.c()[length2].value, hVar)) {
                        length = length2;
                        length2 = iIntValue + 2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int length3 = this.dynamicTable.length;
                    for (int i17 = this.nextHeaderIndex + 1; i17 < length3; i17++) {
                        if (t.c(this.dynamicTable[i17].name, hVarW)) {
                            if (t.c(this.dynamicTable[i17].value, hVar)) {
                                length2 = d.f138922a.c().length + (i17 - this.nextHeaderIndex);
                                break;
                            } else if (length == -1) {
                                length = (i17 - this.nextHeaderIndex) + d.f138922a.c().length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    h(length2, CertificateBody.profileType, 128);
                } else if (length == -1) {
                    this.out.writeByte(64);
                    f(hVarW);
                    f(hVar);
                    d(cVar);
                } else if (!hVarW.R(c.f138913e) || t.c(c.f138918j, hVarW)) {
                    h(length, 63, 64);
                    f(hVar);
                    d(cVar);
                } else {
                    h(length, 15, 0);
                    f(hVar);
                }
            }
        }

        public final void h(int value, int prefixMask, int bits) {
            if (value < prefixMask) {
                this.out.writeByte(value | bits);
                return;
            }
            this.out.writeByte(bits | prefixMask);
            int i15 = value - prefixMask;
            while (i15 >= 128) {
                this.out.writeByte(128 | (i15 & CertificateBody.profileType));
                i15 >>>= 7;
            }
            this.out.writeByte(i15);
        }

        public /* synthetic */ b(int i15, boolean z15, vv.e eVar, int i16, fr.k kVar) {
            this((i16 & 1) != 0 ? PKIFailureInfo.certConfirmed : i15, (i16 & 2) != 0 ? true : z15, eVar);
        }
    }
}
