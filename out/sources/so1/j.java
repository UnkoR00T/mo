package so1;

import a50.RadioButtonData;
import b50.RadioButtonItemData;
import b50.RadioButtonRow;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;
import ju.p0;
import mx.Label;
import p071kotlin.Metadata;
import ry.DomainKeyInfo;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0017\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lso1/j;", "Lxw/f;", "Lso1/j$b;", "Lso1/d$a;", "Liy/s;", "keyInspector", "<init>", "(Liy/s;)V", "Lf93/d$a;", "result", "Lmx/a;", "q", "(Lf93/d$a;)Lmx/a;", "Ljava/security/Key;", "key", "", "m", "(Ljava/security/Key;)Ljava/lang/String;", "params", "r", "(Lso1/j$b;)Lso1/d$a;", "a", "Liy/s;", "b", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements xw.f<Params, so1.d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.s keyInspector;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0003\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lso1/j$a;", "", "", "isPrivate", "", "format", "algorithm", "encoded", "Lry/d;", "domainKeyInfo", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lry/d;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/lang/String;", "getFormat", "c", "getAlgorithm", "d", "getEncoded", "e", "Lry/d;", "getDomainKeyInfo", "()Lry/d;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f183093f = DomainKeyInfo.f176785q;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean isPrivate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String format;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String algorithm;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String encoded;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final DomainKeyInfo domainKeyInfo;

        public a(boolean z15, String str, String str2, String str3, DomainKeyInfo domainKeyInfo) {
            this.isPrivate = z15;
            this.format = str;
            this.algorithm = str2;
            this.encoded = str3;
            this.domainKeyInfo = domainKeyInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.isPrivate == aVar.isPrivate && fr.t.c(this.format, aVar.format) && fr.t.c(this.algorithm, aVar.algorithm) && fr.t.c(this.encoded, aVar.encoded) && fr.t.c(this.domainKeyInfo, aVar.domainKeyInfo);
        }

        public int hashCode() {
            int iHashCode = ((((Boolean.hashCode(this.isPrivate) * 31) + this.format.hashCode()) * 31) + this.algorithm.hashCode()) * 31;
            String str = this.encoded;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            DomainKeyInfo domainKeyInfo = this.domainKeyInfo;
            return iHashCode2 + (domainKeyInfo != null ? domainKeyInfo.hashCode() : 0);
        }

        public String toString() {
            return "priv: " + this.isPrivate + "\nformat: " + this.format + "\nalg: " + this.algorithm + "\nencoded: " + this.encoded + "\ninfo: " + this.domainKeyInfo + '\n';
        }
    }

    /* JADX INFO: renamed from: so1.j$b, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010#R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b$\u0010#R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b'\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b!\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b)\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b*\u0010#R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r8\u0006¢\u0006\f\n\u0004\b%\u0010+\u001a\u0004\b(\u0010,R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\r8\u0006¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b&\u0010,¨\u0006-"}, d2 = {"Lso1/j$b;", "", "Lso1/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "backAction", "verifyButtonClick", "generateButtonClick", "importButtonClick", "exportButtonClick", "wrapButtonClick", "unwrapButtonClick", "Lkotlin/Function1;", "", "keyAliasChanged", "Lso1/b;", "generateKeyTypeChanged", "<init>", "(Lso1/c;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lso1/c;", "g", "()Lso1/c;", "b", "Ler/a;", "()Ler/a;", "c", "i", "d", "e", "f", "j", "h", "Ler/l;", "()Ler/l;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> backAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> verifyButtonClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> generateButtonClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> importButtonClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> exportButtonClick;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> wrapButtonClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> unwrapButtonClick;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, oq.i0> keyAliasChanged;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<b, oq.i0> generateKeyTypeChanged;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<oq.i0> aVar, er.a<oq.i0> aVar2, er.a<oq.i0> aVar3, er.a<oq.i0> aVar4, er.a<oq.i0> aVar5, er.a<oq.i0> aVar6, er.a<oq.i0> aVar7, er.l<? super String, oq.i0> lVar, er.l<? super b, oq.i0> lVar2) {
            this.state = state;
            this.backAction = aVar;
            this.verifyButtonClick = aVar2;
            this.generateButtonClick = aVar3;
            this.importButtonClick = aVar4;
            this.exportButtonClick = aVar5;
            this.wrapButtonClick = aVar6;
            this.unwrapButtonClick = aVar7;
            this.keyAliasChanged = lVar;
            this.generateKeyTypeChanged = lVar2;
        }

        public final er.a<oq.i0> a() {
            return this.backAction;
        }

        public final er.a<oq.i0> b() {
            return this.exportButtonClick;
        }

        public final er.a<oq.i0> c() {
            return this.generateButtonClick;
        }

        public final er.l<b, oq.i0> d() {
            return this.generateKeyTypeChanged;
        }

        public final er.a<oq.i0> e() {
            return this.importButtonClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.state, params.state) && fr.t.c(this.backAction, params.backAction) && fr.t.c(this.verifyButtonClick, params.verifyButtonClick) && fr.t.c(this.generateButtonClick, params.generateButtonClick) && fr.t.c(this.importButtonClick, params.importButtonClick) && fr.t.c(this.exportButtonClick, params.exportButtonClick) && fr.t.c(this.wrapButtonClick, params.wrapButtonClick) && fr.t.c(this.unwrapButtonClick, params.unwrapButtonClick) && fr.t.c(this.keyAliasChanged, params.keyAliasChanged) && fr.t.c(this.generateKeyTypeChanged, params.generateKeyTypeChanged);
        }

        public final er.l<String, oq.i0> f() {
            return this.keyAliasChanged;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public final er.a<oq.i0> h() {
            return this.unwrapButtonClick;
        }

        public int hashCode() {
            return (((((((((((((((((this.state.hashCode() * 31) + this.backAction.hashCode()) * 31) + this.verifyButtonClick.hashCode()) * 31) + this.generateButtonClick.hashCode()) * 31) + this.importButtonClick.hashCode()) * 31) + this.exportButtonClick.hashCode()) * 31) + this.wrapButtonClick.hashCode()) * 31) + this.unwrapButtonClick.hashCode()) * 31) + this.keyAliasChanged.hashCode()) * 31) + this.generateKeyTypeChanged.hashCode();
        }

        public final er.a<oq.i0> i() {
            return this.verifyButtonClick;
        }

        public final er.a<oq.i0> j() {
            return this.wrapButtonClick;
        }

        public String toString() {
            return "Params(state=" + this.state + ", backAction=" + this.backAction + ", verifyButtonClick=" + this.verifyButtonClick + ", generateButtonClick=" + this.generateButtonClick + ", importButtonClick=" + this.importButtonClick + ", exportButtonClick=" + this.exportButtonClick + ", wrapButtonClick=" + this.wrapButtonClick + ", unwrapButtonClick=" + this.unwrapButtonClick + ", keyAliasChanged=" + this.keyAliasChanged + ", generateKeyTypeChanged=" + this.generateKeyTypeChanged + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lry/d;", "<anonymous>", "(Lju/p0;)Lry/d;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<p0, tq.e<? super DomainKeyInfo>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f183109e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Key f183111g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Key key, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f183111g = key;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f183109e;
            if (i15 == 0) {
                oq.u.b(obj);
                iy.s sVar = j.this.keyInspector;
                PrivateKey privateKey = (PrivateKey) this.f183111g;
                this.f183109e = 1;
                obj = iy.s.c(sVar, privateKey, false, this, 2, null);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return ((dx.i) obj).a();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super DomainKeyInfo> eVar) {
            return ((c) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return j.this.new c(this.f183111g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lry/d;", "<anonymous>", "(Lju/p0;)Lry/d;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<p0, tq.e<? super DomainKeyInfo>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f183112e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Key f183114g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Key key, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f183114g = key;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f183112e;
            if (i15 == 0) {
                oq.u.b(obj);
                iy.s sVar = j.this.keyInspector;
                SecretKey secretKey = (SecretKey) this.f183114g;
                this.f183112e = 1;
                obj = iy.s.a(sVar, secretKey, false, this, 2, null);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return ((dx.i) obj).a();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super DomainKeyInfo> eVar) {
            return ((d) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return j.this.new d(this.f183114g, eVar);
        }
    }

    public j(iy.s sVar) {
        this.keyInspector = sVar;
    }

    private final String m(Key key) {
        if (key instanceof PrivateKey) {
            PrivateKey privateKey = (PrivateKey) key;
            String format = privateKey.getFormat();
            String str = format == null ? "" : format;
            String algorithm = privateKey.getAlgorithm();
            byte[] encoded = privateKey.getEncoded();
            return new a(true, str, algorithm, encoded != null ? encoded.toString() : null, (DomainKeyInfo) ju.j.b(null, new c(key, null), 1, null)).toString();
        }
        if (key instanceof PublicKey) {
            PublicKey publicKey = (PublicKey) key;
            String format2 = publicKey.getFormat();
            String str2 = format2 == null ? "" : format2;
            String algorithm2 = publicKey.getAlgorithm();
            byte[] encoded2 = publicKey.getEncoded();
            return new a(false, str2, algorithm2, encoded2 != null ? encoded2.toString() : null, null).toString();
        }
        boolean z15 = key instanceof SecretKey;
        if (z15) {
            SecretKey secretKey = (SecretKey) key;
            String format3 = secretKey.getFormat();
            String str3 = format3 == null ? "" : format3;
            String algorithm3 = secretKey.getAlgorithm();
            byte[] encoded3 = secretKey.getEncoded();
            return new a(false, str3, algorithm3, encoded3 != null ? encoded3.toString() : null, (DomainKeyInfo) ju.j.b(null, new d(key, null), 1, null)).toString();
        }
        if (z15) {
            return key.toString();
        }
        throw new IllegalArgumentException("Shouldn't happen. Wrong key: " + key);
    }

    private final Label q(f93.d.Result result) {
        return mx.b.b("different keys: " + result.getDifferentKeys() + "\n---\nKeyPair1:\n" + m(result.getKeyPair1().getPrivate()) + '\n' + m(result.getKeyPair1().getPublic()) + "\n---\nCert chain KeyPair1:\n" + result.c(), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(Params params) {
        params.d().b(b.ANDROID_KEYSTORE_RSA);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(Params params) {
        params.d().b(b.BC_RSA);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(Params params) {
        params.d().b(b.ANDROID_KEYSTORE_AES);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(Params params) {
        params.d().b(b.BC_AES);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(Params params) {
        params.d().b(b.BC_AES_PASSWORD);
        return oq.i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public so1.d.Data b(final Params params) {
        Label labelB;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), mx.b.b("Developer Crypto", ""), null, null, null, 28, null), null, null, null, null, 61, null);
        k30.a.Large large = new k30.a.Large(false, 1, null);
        k30.d.a aVar = k30.d.a.f107773a;
        ButtonData buttonData = new ButtonData(null, null, large, new k30.c.WithText(mx.b.b("Verify KeyStore KeyPair", ""), null, 2, null), aVar, null, params.i(), 35, null);
        RadioButtonData radioButtonData = new RadioButtonData(pq.v.q(new RadioButtonRow(new RadioButtonItemData(false, params.getState().getGenerateKeyType() == b.ANDROID_KEYSTORE_RSA, false, 5, null), new er.a() { // from class: so1.e
            @Override // er.a
            public final Object a() {
                return j.s(params);
            }
        }, mx.b.b("Android KeyStore RSA", ""), null, null, 24, null), new RadioButtonRow(new RadioButtonItemData(false, params.getState().getGenerateKeyType() == b.BC_RSA, false, 5, null), new er.a() { // from class: so1.f
            @Override // er.a
            public final Object a() {
                return j.u(params);
            }
        }, mx.b.b("BC RSA", ""), null, null, 24, null), new RadioButtonRow(new RadioButtonItemData(false, params.getState().getGenerateKeyType() == b.ANDROID_KEYSTORE_AES, false, 5, null), new er.a() { // from class: so1.g
            @Override // er.a
            public final Object a() {
                return j.v(params);
            }
        }, mx.b.b("Android KeyStore AES", ""), null, null, 24, null), new RadioButtonRow(new RadioButtonItemData(false, params.getState().getGenerateKeyType() == b.BC_AES, false, 5, null), new er.a() { // from class: so1.h
            @Override // er.a
            public final Object a() {
                return j.x(params);
            }
        }, mx.b.b("BC AES", ""), null, null, 24, null), new RadioButtonRow(new RadioButtonItemData(false, params.getState().getGenerateKeyType() == b.BC_AES_PASSWORD, false, 5, null), new er.a() { // from class: so1.i
            @Override // er.a
            public final Object a() {
                return j.z(params);
            }
        }, mx.b.b("BC AES (password)", ""), null, null, 24, null)), b50.e.a.f16684a, null, null, null, null, null, 124, null);
        ButtonData buttonData2 = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(mx.b.b("Generate key", ""), null, 2, null), aVar, null, params.c(), 35, null);
        ButtonData buttonData3 = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(mx.b.b("Import into KeyStore", ""), null, 2, null), aVar, null, params.e(), 35, null);
        ButtonData buttonData4 = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(mx.b.b("Export from KeyStore", ""), null, 2, null), aVar, null, params.b(), 35, null);
        k30.a.Large large2 = new k30.a.Large(false, 1, null);
        k30.c.WithText withText = new k30.c.WithText(mx.b.b("Wrap into KeyStore", ""), null, 2, null);
        k30.b.C2562b c2562b = k30.b.C2562b.f107767a;
        ButtonData buttonData5 = new ButtonData(null, null, large2, withText, aVar, c2562b, params.j(), 3, null);
        ButtonData buttonData6 = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(mx.b.b("Unwrap from KeyStore", ""), null, 2, null), aVar, c2562b, params.h(), 3, null);
        if (params.getState().getVerificationResult() != null) {
            labelB = q(params.getState().getVerificationResult());
        } else if (params.getState().getSecretKey() != null) {
            labelB = mx.b.b(m(params.getState().getSecretKey()), "");
        } else {
            labelB = params.getState().getKeyPair() != null ? mx.b.b(m(params.getState().getKeyPair().getPrivate()), "") : Label.INSTANCE.c();
        }
        return new so1.d.Data(baseScaffoldData, buttonData, new v50.c.Text(null, null, null, mx.b.b(params.getState().getKeyAlias(), ""), null, null, null, params.f(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048439, null), radioButtonData, buttonData2, buttonData3, buttonData4, buttonData5, buttonData6, labelB);
    }
}
