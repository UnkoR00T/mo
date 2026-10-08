package pl.gov.coi.common.network;

import androidx.annotation.Keep;
import java.util.List;
import java.util.Map;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u0013\u0014Jp\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lpl/gov/coi/common/network/HttpRequestExecutor;", "", "", "url", "Lpl/gov/coi/common/network/HttpRequestExecutor$Method;", "method", "", "body", CMSAttributeTableGenerator.CONTENT_TYPE, "userAgent", "", "headers", "Lpl/gov/coi/common/network/t;", "profile", "Ldx/i;", "Ldx/b$e;", "Lpl/gov/coi/common/network/HttpRequestExecutor$a;", "b", "(Ljava/lang/String;Lpl/gov/coi/common/network/HttpRequestExecutor$Method;[BLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Lpl/gov/coi/common/network/t;Ltq/e;)Ljava/lang/Object;", "a", "Method", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface HttpRequestExecutor {

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lpl/gov/coi/common/network/HttpRequestExecutor$Method;", "", "<init>", "(Ljava/lang/String;I)V", "GET", "POST", "PUT", "DELETE", "PATCH", "HEAD", "OPTIONS", "TRACE", "CONNECT", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum Method {
        GET,
        POST,
        PUT,
        DELETE,
        PATCH,
        HEAD,
        OPTIONS,
        TRACE,
        CONNECT;

        private static final /* synthetic */ wq.a $ENTRIES = wq.b.a(values());

        public static wq.a<Method> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0013\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\t0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R)\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\t0\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u000f\u0010\u001d¨\u0006\u001e"}, d2 = {"Lpl/gov/coi/common/network/HttpRequestExecutor$a;", "", "", "isSuccessful", "", "code", "", "message", "", "Loq/r;", "headers", "", "body", "<init>", "(ZILjava/lang/String;Ljava/util/List;[B)V", "a", "Z", "e", "()Z", "b", "I", "()I", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Ljava/util/List;", "()Ljava/util/List;", "[B", "()[B", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean isSuccessful;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int code;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String message;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<oq.r<String, String>> headers;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final byte[] body;

        public a(boolean z15, int i15, String str, List<oq.r<String, String>> list, byte[] bArr) {
            this.isSuccessful = z15;
            this.code = i15;
            this.message = str;
            this.headers = list;
            this.body = bArr;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final byte[] getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        public final List<oq.r<String, String>> c() {
            return this.headers;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsSuccessful() {
            return this.isSuccessful;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object a(HttpRequestExecutor httpRequestExecutor, String str, Method method, byte[] bArr, String str2, String str3, Map map, t tVar, tq.e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
        }
        if ((i15 & 2) != 0) {
            method = Method.GET;
        }
        return httpRequestExecutor.b(str, method, (i15 & 4) != 0 ? null : bArr, (i15 & 8) != 0 ? null : str2, (i15 & 16) != 0 ? null : str3, (i15 & 32) != 0 ? pq.v0.i() : map, tVar, eVar);
    }

    Object b(String str, Method method, byte[] bArr, String str2, String str3, Map<String, String> map, t tVar, tq.e<? super dx.i<dx.b.Generic, a>> eVar);
}
