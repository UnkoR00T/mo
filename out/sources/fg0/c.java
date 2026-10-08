package fg0;

import ag0.DynamicDocument;
import ag0.DynamicParentDocument;
import bg0.FamilyCardDocument;
import cg0.SchoolCardDocument;
import dg0.UutCardDocument;
import dg0.UutCardParentDocument;
import dg0.UutCardScope;
import fr.q0;
import hg0.DocumentEntity;
import hg0.SchemaEntity;
import hg0.ScopeEntity;
import ig0.DocumentWithScopes;
import ig0.DocumentWithScopesAndSchemas;
import iy.b0;
import iy.c0;
import iy.e0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import ju.g1;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.cms.CMSSignedData;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.deserializer.StrictNonNullAdapterFactory;
import pl.gov.coi.mjunior.technical.containers.data.database.ContainersDatabase;
import pl.gov.coi.mjunior.technical.containers.data.database.entities.DocumentEntityStatus;
import pl.gov.coi.mjunior.technical.containers.data.database.entities.DocumentEntityType;
import pq.v;
import qt3.DisabledPersonDataContainer;
import qt3.DisabledPersonScope;
import qt3.DocumentSchemaDto;
import qt3.DrivingLicenceScope;
import qt3.FamilyCardScope;
import qt3.FamilyDataContainer;
import qt3.JuniorSchoolCardScope;
import qt3.MultiDocumentSchemaDto;
import qt3.UutDataContainer;
import qt3.UutScope;
import vf0.Document;
import vf0.DocumentScope;
import xf0.DrivingLicenceDocument;
import zf0.MultiDocumentSchema;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00150\f*\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JB\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001e0\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u00132\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001c0\u001bH\u0096@¢\u0006\u0004\b\u001f\u0010 JJ\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001e0\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00132\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001c0\u001bH\u0096@¢\u0006\u0004\b\"\u0010#JJ\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001e0\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00132\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001c0\u001bH\u0096@¢\u0006\u0004\b$\u0010#JJ\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001e0\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00132\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001c0\u001bH\u0096@¢\u0006\u0004\b%\u0010#J$\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020&0\f2\u0006\u0010!\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b'\u0010(J$\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020)0\f2\u0006\u0010!\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b*\u0010(J$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020+0\f2\u0006\u0010\u001a\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b,\u0010(J\u001c\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020+0\fH\u0096@¢\u0006\u0004\b-\u0010.J$\u00100\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020/0\f2\u0006\u0010!\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b0\u0010(JR\u00102\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001e0\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00132\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u00101\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b2\u00103J$\u00105\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002040\f2\u0006\u0010!\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b5\u0010(J$\u00107\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002060\f2\u0006\u0010\u001a\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b7\u0010(J$\u00108\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001e0\f2\u0006\u0010\u001a\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b8\u0010(J$\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001e0\f2\u0006\u00109\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b:\u0010(J,\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001e0\f2\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010<\u001a\u00020;H\u0096@¢\u0006\u0004\b=\u0010>J\u001b\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\u00110?H\u0016¢\u0006\u0004\bA\u0010BJ\"\u0010C\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\u00110\fH\u0096@¢\u0006\u0004\bC\u0010.J\u001c\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001e0\fH\u0096@¢\u0006\u0004\bD\u0010.J,\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020F0\f2\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010E\u001a\u00020\u0013H\u0096@¢\u0006\u0004\bG\u0010HJ,\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001e0\f2\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010I\u001a\u00020\u0013H\u0096@¢\u0006\u0004\bJ\u0010HJ&\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00130\f2\u0006\u0010\u001a\u001a\u00020\u0013H\u0096@¢\u0006\u0004\bK\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010LR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010MR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010NR\u0014\u0010Q\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010P¨\u0006R"}, d2 = {"Lfg0/c;", "Lmg0/b;", "Lp10/f;", "dbProvider", "Liy/e0;", "signedDataDecoder", "Lez/c;", "dateConverter", "Lay/h;", "jsonFactory", "<init>", "(Lp10/f;Liy/e0;Lez/c;Lay/h;)V", "Ldx/i;", "Ldx/b;", "Lpl/gov/coi/mjunior/technical/containers/data/database/ContainersDatabase;", "v", "()Ldx/i;", "", "Lhg0/g;", "", "scopeName", "Liy/b0;", "w", "(Ljava/util/List;Ljava/lang/String;)Ldx/i;", "", "certificateId", "documentId", "", "Lorg/bouncycastle/cms/CMSSignedData;", "scopeData", "Loq/i0;", "u", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ltq/e;)Ljava/lang/Object;", "parentId", "k", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ltq/e;)Ljava/lang/Object;", "r", "l", "Ldg0/b;", "o", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lbg0/b;", "f", "Lcg0/d;", "q", "i", "(Ltq/e;)Ljava/lang/Object;", "Lxf0/d;", "t", "schemaData", "s", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lag0/b;", "d", "", "g", "b", "parentOrChildId", "n", "Lvf0/c;", "newStatus", "p", "(Ljava/lang/String;Lvf0/c;Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "Lvf0/a;", "h", "()Lmu/g;", "a", "e", "name", "Lvf0/b;", "j", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "schema", "c", "m", "Lp10/f;", "Liy/e0;", "Lez/c;", "Lay/j;", "Lay/j;", "strictNonNullSerializer", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements mg0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p10.f dbProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e0 signedDataDecoder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ay.j strictNonNullSerializer;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f62452d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f62453e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f62454f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f62455g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f62456h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f62457j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f62458k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f62459l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f62460m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f62462p;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62460m = obj;
            this.f62462p |= PKIFailureInfo.systemUnavail;
            return c.this.e(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f62463d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f62464e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f62465f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f62466g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f62467h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f62468j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f62469k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f62470l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f62471m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f62472n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f62474q;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62472n = obj;
            this.f62474q |= PKIFailureInfo.systemUnavail;
            return c.this.b(null, this);
        }
    }

    /* JADX INFO: renamed from: fg0.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1413c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f62475d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f62476e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f62477f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f62478g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f62479h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f62480j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f62481k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f62482l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f62483m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f62484n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f62486q;

        C1413c(tq.e<? super C1413c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62484n = obj;
            this.f62486q |= PKIFailureInfo.systemUnavail;
            return c.this.n(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f62487d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f62488e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f62489f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f62490g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f62491h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f62492j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f62493k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f62494l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f62495m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f62497p;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62495m = obj;
            this.f62497p |= PKIFailureInfo.systemUnavail;
            return c.this.a(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f62498d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f62499e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f62500f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f62501g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f62502h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f62503j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f62504k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f62505l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f62506m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f62507n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f62509q;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62507n = obj;
            this.f62509q |= PKIFailureInfo.systemUnavail;
            return c.this.m(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f62510d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f62511e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f62512f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f62513g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f62514h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f62515j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f62516k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f62517l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f62518m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f62519n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f62520p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f62522r;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62520p = obj;
            this.f62522r |= PKIFailureInfo.systemUnavail;
            return c.this.j(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f62523d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f62524e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f62525f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f62526g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f62527h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f62528j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f62529k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f62530l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f62531m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f62532n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f62534q;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62532n = obj;
            this.f62534q |= PKIFailureInfo.systemUnavail;
            return c.this.t(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f62535d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f62536e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f62537f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f62538g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f62539h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f62540j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f62541k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f62542l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f62543m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f62544n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f62545p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f62547r;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62545p = obj;
            this.f62547r |= PKIFailureInfo.systemUnavail;
            return c.this.d(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f62548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f62549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f62550f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f62551g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f62552h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f62553j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f62554k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f62555l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f62556m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f62557n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f62559q;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62557n = obj;
            this.f62559q |= PKIFailureInfo.systemUnavail;
            return c.this.f(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class j extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f62560d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f62561e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f62562f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f62563g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f62564h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f62565j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f62566k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f62567l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f62568m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f62570p;

        j(tq.e<? super j> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62568m = obj;
            this.f62570p |= PKIFailureInfo.systemUnavail;
            return c.this.i(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f62571d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f62572e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f62573f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f62574g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f62575h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f62576j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f62577k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f62578l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f62579m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f62580n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f62582q;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62580n = obj;
            this.f62582q |= PKIFailureInfo.systemUnavail;
            return c.this.q(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class l extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f62583d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f62584e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f62585f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f62586g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f62587h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f62588j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f62589k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f62590l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f62591m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f62592n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f62594q;

        l(tq.e<? super l> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62592n = obj;
            this.f62594q |= PKIFailureInfo.systemUnavail;
            return c.this.o(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class m extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f62595d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f62596e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f62597f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f62598g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f62599h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f62600j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f62601k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f62602l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f62603m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f62604n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f62606q;

        m(tq.e<? super m> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62604n = obj;
            this.f62606q |= PKIFailureInfo.systemUnavail;
            return c.this.g(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class n implements mu.g<List<? extends Document>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f62607a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f62608a;

            /* JADX INFO: renamed from: fg0.c$n$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1414a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f62609d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f62610e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f62611f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f62613h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f62614j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f62615k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f62616l;

                public C1414a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f62609d = obj;
                    this.f62610e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar) {
                this.f62608a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1414a c1414a;
                if (eVar instanceof C1414a) {
                    c1414a = (C1414a) eVar;
                    int i15 = c1414a.f62610e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1414a.f62610e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1414a = new C1414a(eVar);
                    }
                } else {
                    c1414a = new C1414a(eVar);
                }
                Object obj2 = c1414a.f62609d;
                Object objE = uq.b.e();
                int i16 = c1414a.f62610e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f62608a;
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(v.y(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(fg0.d.a((DocumentEntity) it.next()));
                    }
                    c1414a.f62611f = vq.j.a(obj);
                    c1414a.f62613h = vq.j.a(c1414a);
                    c1414a.f62614j = vq.j.a(obj);
                    c1414a.f62615k = vq.j.a(hVar);
                    c1414a.f62616l = 0;
                    c1414a.f62610e = 1;
                    if (hVar.F(arrayList, c1414a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public n(mu.g gVar) {
            this.f62607a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super List<? extends Document>> hVar, tq.e eVar) {
            Object objA = this.f62607a.a(new a(hVar), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class o extends vq.d {
        int A;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f62617d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f62618e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f62619f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f62620g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f62621h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f62622j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f62623k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f62624l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f62625m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f62626n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f62627p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f62628q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f62629r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f62630s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f62631t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f62632v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f62633w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f62634x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        /* synthetic */ Object f62635y;

        o(tq.e<? super o> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62635y = obj;
            this.A |= PKIFailureInfo.systemUnavail;
            return c.this.s(null, null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class p extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f62637d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f62638e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f62639f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f62640g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f62641h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f62642j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f62643k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f62644l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f62645m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f62646n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f62647p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f62648q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f62649r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f62650s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f62651t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f62652v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f62653w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f62654x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f62656z;

        p(tq.e<? super p> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62654x = obj;
            this.f62656z |= PKIFailureInfo.systemUnavail;
            return c.this.k(null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class q extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f62657d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f62658e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f62659f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f62660g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f62661h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f62662j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f62663k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f62664l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f62665m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f62666n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f62667p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f62668q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f62669r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f62670s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f62671t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f62672v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f62673w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f62675y;

        q(tq.e<? super q> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62673w = obj;
            this.f62675y |= PKIFailureInfo.systemUnavail;
            return c.this.r(null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class r extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f62676d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f62677e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f62678f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f62679g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f62680h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f62681j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f62682k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f62683l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f62684m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f62685n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f62686p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f62687q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f62689s;

        r(tq.e<? super r> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62687q = obj;
            this.f62689s |= PKIFailureInfo.systemUnavail;
            return c.this.c(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class s extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f62690d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f62691e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f62692f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f62693g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f62694h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f62695j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f62696k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f62697l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f62698m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f62699n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f62700p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f62701q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f62702r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f62703s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f62704t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f62705v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f62707x;

        s(tq.e<? super s> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62705v = obj;
            this.f62707x |= PKIFailureInfo.systemUnavail;
            return c.this.u(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class t extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f62708d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f62709e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f62710f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f62711g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f62712h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f62713j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f62714k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f62715l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f62716m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f62717n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f62718p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f62719q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f62720r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f62721s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f62722t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f62723v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f62724w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f62726y;

        t(tq.e<? super t> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62724w = obj;
            this.f62726y |= PKIFailureInfo.systemUnavail;
            return c.this.l(null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class u extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f62727d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f62728e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f62729f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f62730g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f62731h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f62732j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f62733k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f62734l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f62735m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f62736n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f62737p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f62739r;

        u(tq.e<? super u> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f62737p = obj;
            this.f62739r |= PKIFailureInfo.systemUnavail;
            return c.this.p(null, null, this);
        }
    }

    public c(p10.f fVar, e0 e0Var, ez.c cVar, ay.h hVar) {
        this.dbProvider = fVar;
        this.signedDataDecoder = e0Var;
        this.dateConverter = cVar;
        this.strictNonNullSerializer = hVar.a(new StrictNonNullAdapterFactory());
    }

    private final dx.i<dx.b, ContainersDatabase> v() {
        p10.f fVar = this.dbProvider;
        List<? extends Object> listN = v.n();
        ContainersDatabase.Companion cVar = ContainersDatabase.INSTANCE;
        return fVar.b(ContainersDatabase.class, listN, v.q(cVar.b(), cVar.c()), cVar.a());
    }

    private final dx.i<dx.b, b0> w(List<ScopeEntity> list, String str) {
        Object next;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!fr.t.c(((ScopeEntity) next).getName(), str));
        ScopeEntity scopeEntity = (ScopeEntity) next;
        if (scopeEntity != null) {
            return new dx.i.Right(c0.g(this.signedDataDecoder.decode(scopeEntity.getScope())));
        }
        return new dx.i.Left(new dx.b.Generic(new NoSuchElementException("No scope named " + str + " in the ScopeEntity list.")));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [fg0.c$d, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [gg0.l] */
    @Override // mg0.b
    public Object a(tq.e<? super dx.i<? extends dx.b, ? extends List<Document>>> eVar) throws Throwable {
        ?? dVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof d) {
            d dVar2 = (d) eVar;
            int i15 = dVar2.f62497p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar2.f62497p = i15 - PKIFailureInfo.systemUnavail;
                dVar = dVar2;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f62495m;
        Object objE = uq.b.e();
        int i16 = dVar.f62497p;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ?? D0 = ((ContainersDatabase) aVar.a(v())).d0();
                        dVar.f62492j = jVarA;
                        dVar.f62493k = vq.j.a(aVar);
                        dVar.f62494l = vq.j.a(aVar);
                        dVar.f62487d = 0;
                        dVar.f62488e = 0;
                        dVar.f62489f = 0;
                        dVar.f62490g = 0;
                        dVar.f62491h = 0;
                        dVar.f62497p = 1;
                        Object objA = D0.a(dVar);
                        if (objA == objE) {
                            return objE;
                        }
                        obj = objA;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        dVar = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(dVar));
                        dx.i iVarA = dVar.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v.y(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(fg0.d.a((DocumentEntity) it.next()));
                }
                return new dx.i.Right(arrayList);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
    @Override // mg0.b
    public Object b(String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        b bVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f62474q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f62474q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f62472n;
        Object objE = uq.b.e();
        int i16 = bVar.f62474q;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        gg0.l lVarD0 = ((ContainersDatabase) aVar.a(v())).d0();
                        bVar.f62463d = vq.j.a(str);
                        bVar.f62464e = jVarA;
                        bVar.f62465f = vq.j.a(aVar);
                        bVar.f62466g = vq.j.a(aVar);
                        bVar.f62467h = 0;
                        bVar.f62468j = 0;
                        bVar.f62469k = 0;
                        bVar.f62470l = 0;
                        bVar.f62471m = 0;
                        bVar.f62474q = 1;
                        if (lVarD0.g(str, bVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        str = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(str));
                        dx.i iVarA = str.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right(i0.f148189a);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v9 */
    @Override // mg0.b
    public Object c(String str, String str2, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        r rVar;
        Exception exc;
        ?? r15;
        Object objB;
        ex.c cVar;
        if (eVar instanceof r) {
            rVar = (r) eVar;
            int i15 = rVar.f62689s;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                rVar.f62689s = i15 - PKIFailureInfo.systemUnavail;
            } else {
                rVar = new r(eVar);
            }
        } else {
            rVar = new r(eVar);
        }
        Object obj = rVar.f62687q;
        Object objE = uq.b.e();
        int i16 = rVar.f62689s;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        SchemaEntity schemaEntity = new SchemaEntity(0, str, str2.getBytes(fu.d.UTF_8), 1, null);
                        gg0.l lVarD0 = ((ContainersDatabase) aVar.a(v())).d0();
                        rVar.f62676d = vq.j.a(str);
                        rVar.f62677e = vq.j.a(str2);
                        rVar.f62678f = jVarA;
                        rVar.f62679g = vq.j.a(aVar);
                        rVar.f62680h = vq.j.a(aVar);
                        rVar.f62681j = vq.j.a(schemaEntity);
                        rVar.f62682k = 0;
                        rVar.f62683l = 0;
                        rVar.f62684m = 0;
                        rVar.f62685n = 0;
                        rVar.f62686p = 0;
                        rVar.f62689s = 1;
                        if (lVarD0.j(schemaEntity, rVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e15) {
                        cVar = e15;
                        return new dx.i.Left((dx.b) ex.d.a(cVar));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        exc = e17;
                        r15 = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = exc.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, exc, px.c.a(r15));
                        dx.i iVarA = r15.a(exc);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e18) {
                        cVar = e18;
                        return new dx.i.Left((dx.b) ex.d.a(cVar));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new dx.i.Right(i0.f148189a);
            } catch (Exception e25) {
                exc = e25;
                r15 = str;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x018e A[Catch: Exception -> 0x004d, c -> 0x0050, CancellationException -> 0x0053, TryCatch #2 {Exception -> 0x004d, blocks: (B:13:0x0044, B:41:0x0106, B:44:0x0117, B:71:0x019d, B:72:0x01c4, B:74:0x01ca, B:76:0x01dd, B:78:0x01e3, B:80:0x0203, B:108:0x028f, B:94:0x023f, B:97:0x0248, B:99:0x0259, B:103:0x0271, B:100:0x0267, B:102:0x026b, B:104:0x0277, B:105:0x027c, B:106:0x027d, B:107:0x027e, B:109:0x02b7, B:110:0x02cb, B:111:0x02cc, B:57:0x0151, B:60:0x015a, B:62:0x0169, B:66:0x0181, B:63:0x0177, B:65:0x017b, B:67:0x0187, B:68:0x018c, B:69:0x018d, B:70:0x018e, B:113:0x02db, B:116:0x02ea, B:37:0x00d3, B:33:0x0099), top: B:132:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01ca A[Catch: Exception -> 0x004d, c -> 0x0050, CancellationException -> 0x0053, TryCatch #2 {Exception -> 0x004d, blocks: (B:13:0x0044, B:41:0x0106, B:44:0x0117, B:71:0x019d, B:72:0x01c4, B:74:0x01ca, B:76:0x01dd, B:78:0x01e3, B:80:0x0203, B:108:0x028f, B:94:0x023f, B:97:0x0248, B:99:0x0259, B:103:0x0271, B:100:0x0267, B:102:0x026b, B:104:0x0277, B:105:0x027c, B:106:0x027d, B:107:0x027e, B:109:0x02b7, B:110:0x02cb, B:111:0x02cc, B:57:0x0151, B:60:0x015a, B:62:0x0169, B:66:0x0181, B:63:0x0177, B:65:0x017b, B:67:0x0187, B:68:0x018c, B:69:0x018d, B:70:0x018e, B:113:0x02db, B:116:0x02ea, B:37:0x00d3, B:33:0x0099), top: B:132:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // mg0.b
    public Object d(String str, tq.e<? super dx.i<? extends dx.b, DynamicParentDocument>> eVar) throws Throwable {
        h hVar;
        Object objB;
        int i15;
        int i16;
        ex.b bVar;
        String str2;
        int i17;
        dx.j<dx.b> jVarA;
        ex.b bVar2;
        int i18;
        int i19;
        ex.b bVar3;
        DocumentWithScopesAndSchemas documentWithScopesAndSchemas;
        Object objO;
        String str3;
        SchemaEntity schemaEntity;
        dx.i left;
        Object objB2;
        Iterator it;
        ScopeEntity scopeEntity;
        String name;
        dx.i left2;
        Object objB3;
        if (eVar instanceof h) {
            hVar = (h) eVar;
            int i25 = hVar.f62547r;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                hVar.f62547r = i25 - PKIFailureInfo.systemUnavail;
            } else {
                hVar = new h(eVar);
            }
        } else {
            hVar = new h(eVar);
        }
        Object objB4 = hVar.f62545p;
        Object objE = uq.b.e();
        ?? r15 = hVar.f62547r;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(objB4);
                    jVarA = xw.c.f221622a.a();
                    ex.a aVar = new ex.a();
                    gg0.l lVarD0 = ((ContainersDatabase) aVar.a(v())).d0();
                    hVar.f62535d = str;
                    hVar.f62536e = jVarA;
                    hVar.f62537f = vq.j.a(aVar);
                    hVar.f62538g = aVar;
                    i17 = 0;
                    hVar.f62540j = 0;
                    hVar.f62541k = 0;
                    hVar.f62542l = 0;
                    hVar.f62543m = 0;
                    hVar.f62544n = 0;
                    hVar.f62547r = 1;
                    objB4 = lVarD0.b(str, hVar);
                    if (objB4 != objE) {
                        str2 = str;
                        i15 = 0;
                        i16 = 0;
                        i19 = 0;
                        bVar = aVar;
                        bVar2 = bVar;
                        i18 = 0;
                    }
                    return objE;
                }
                try {
                    if (r15 == 1) {
                        i15 = hVar.f62544n;
                        int i26 = hVar.f62543m;
                        i16 = hVar.f62542l;
                        int i27 = hVar.f62541k;
                        int i28 = hVar.f62540j;
                        bVar = (ex.b) hVar.f62538g;
                        ex.b bVar4 = (ex.b) hVar.f62537f;
                        dx.j<dx.b> jVar = (dx.j) hVar.f62536e;
                        str2 = (String) hVar.f62535d;
                        try {
                            oq.u.b(objB4);
                            i17 = i26;
                            jVarA = jVar;
                            bVar2 = bVar4;
                            i18 = i28;
                            i19 = i27;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVar;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            fVar.d(message != null ? message : "", e, px.c.a(r15));
                            dx.i iVarA = r15.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (r15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        DocumentWithScopesAndSchemas documentWithScopesAndSchemas2 = (DocumentWithScopesAndSchemas) hVar.f62539h;
                        bVar3 = (ex.b) hVar.f62538g;
                        String str4 = (String) hVar.f62535d;
                        oq.u.b(objB4);
                        documentWithScopesAndSchemas = documentWithScopesAndSchemas2;
                        objO = objB4;
                        str3 = str4;
                    }
                    List list = (List) objO;
                    schemaEntity = (SchemaEntity) v.n0(documentWithScopesAndSchemas.b());
                    if (schemaEntity != null) {
                        try {
                            dx.j<dx.b> jVarA2 = xw.c.f221622a.a();
                            try {
                                try {
                                    new ex.a();
                                    left = new dx.i.Right(this.strictNonNullSerializer.a(fu.r.A(schemaEntity.getData()), q0.n(MultiDocumentSchemaDto.class)));
                                } catch (Exception e18) {
                                    px.f fVar2 = px.f.f163100a;
                                    String message2 = e18.getMessage();
                                    if (message2 == null) {
                                        message2 = "";
                                    }
                                    fVar2.d(message2, e18, px.c.a(jVarA2));
                                    Object objA = jVarA2.a(e18);
                                    if (objA instanceof dx.i.Left) {
                                        objB2 = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                                    } else {
                                        if (!(objA instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        objB2 = ((dx.i.Right) objA).b();
                                    }
                                    left = new dx.i.Left(objB2);
                                }
                            } catch (ex.c e19) {
                                left = new dx.i.Left((dx.b) ex.d.a(e19));
                            } catch (CancellationException e25) {
                                throw e25;
                            }
                        } catch (CancellationException e26) {
                            throw e26;
                        }
                    } else {
                        left = new dx.i.Left(new dx.b.Generic(new NoSuchElementException("No schema in the SchemaEntity list.")));
                    }
                    MultiDocumentSchema multiDocumentSchemaY = fg0.b.y((MultiDocumentSchemaDto) bVar3.a(left));
                    vf0.d dVarE = fg0.d.e(documentWithScopesAndSchemas.getDocument().getType());
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(v.y(list2, 10));
                    for (it = list2.iterator(); it.hasNext(); it = it) {
                        DocumentWithScopesAndSchemas documentWithScopesAndSchemas3 = (DocumentWithScopesAndSchemas) it.next();
                        scopeEntity = (ScopeEntity) v.n0(documentWithScopesAndSchemas3.c());
                        if (scopeEntity != null || (name = scopeEntity.getName()) == null) {
                            bVar3.b(new dx.b.Generic(new NoSuchElementException("Disabled person ID card child document without scope.")));
                            throw new oq.g();
                        }
                        String documentId = documentWithScopesAndSchemas3.getDocument().getDocumentId();
                        vf0.c cVarC = fg0.d.c(documentWithScopesAndSchemas3.getDocument().h());
                        SchemaEntity schemaEntity2 = (SchemaEntity) v.n0(documentWithScopesAndSchemas3.b());
                        if (schemaEntity2 != null) {
                            dx.j<dx.b> jVarA3 = xw.c.f221622a.a();
                            try {
                                try {
                                    new ex.a();
                                    left2 = new dx.i.Right(this.strictNonNullSerializer.a(fu.r.A(schemaEntity2.getData()), q0.n(DocumentSchemaDto.class)));
                                } catch (Exception e27) {
                                    px.f fVar3 = px.f.f163100a;
                                    String message3 = e27.getMessage();
                                    if (message3 == null) {
                                        message3 = "";
                                    }
                                    fVar3.d(message3, e27, px.c.a(jVarA3));
                                    Object objA2 = jVarA3.a(e27);
                                    if (objA2 instanceof dx.i.Left) {
                                        objB3 = new dx.b.Generic((Exception) ((dx.i.Left) objA2).b());
                                    } else {
                                        if (!(objA2 instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        objB3 = ((dx.i.Right) objA2).b();
                                    }
                                    left2 = new dx.i.Left(objB3);
                                }
                            } catch (ex.c e28) {
                                try {
                                    left2 = new dx.i.Left((dx.b) ex.d.a(e28));
                                } catch (CancellationException e29) {
                                    throw e29;
                                }
                            } catch (CancellationException e35) {
                                throw e35;
                            }
                        } else {
                            left2 = new dx.i.Left(new dx.b.Generic(new NoSuchElementException("No schema in the SchemaEntity list.")));
                        }
                        arrayList.add(new DynamicDocument(documentId, cVarC, name, (b0) bVar3.a(w(documentWithScopesAndSchemas3.c(), name)), fg0.b.e((DocumentSchemaDto) bVar3.a(left2))));
                    }
                    return new dx.i.Right(new DynamicParentDocument(str3, dVarE, null, arrayList, multiDocumentSchemaY, 4, null));
                } catch (CancellationException e36) {
                    throw e36;
                }
                documentWithScopesAndSchemas = (DocumentWithScopesAndSchemas) objB4;
                gg0.l lVarD1 = ((ContainersDatabase) bVar.a(v())).d0();
                hVar.f62535d = str2;
                hVar.f62536e = jVarA;
                hVar.f62537f = vq.j.a(bVar2);
                hVar.f62538g = bVar;
                hVar.f62539h = documentWithScopesAndSchemas;
                hVar.f62540j = i18;
                hVar.f62541k = i19;
                hVar.f62542l = i16;
                hVar.f62543m = i17;
                hVar.f62544n = i15;
                hVar.f62547r = 2;
                objO = lVarD1.o(str2, hVar);
                if (objO != objE) {
                    bVar3 = bVar;
                    str3 = str2;
                    List list3 = (List) objO;
                    schemaEntity = (SchemaEntity) v.n0(documentWithScopesAndSchemas.b());
                    if (schemaEntity != null) {
                        dx.j<dx.b> jVarA4 = xw.c.f221622a.a();
                        new ex.a();
                        left = new dx.i.Right(this.strictNonNullSerializer.a(fu.r.A(schemaEntity.getData()), q0.n(MultiDocumentSchemaDto.class)));
                    } else {
                        left = new dx.i.Left(new dx.b.Generic(new NoSuchElementException("No schema in the SchemaEntity list.")));
                    }
                    MultiDocumentSchema multiDocumentSchemaY2 = fg0.b.y((MultiDocumentSchemaDto) bVar3.a(left));
                    vf0.d dVarE2 = fg0.d.e(documentWithScopesAndSchemas.getDocument().getType());
                    List list4 = list3;
                    ArrayList arrayList2 = new ArrayList(v.y(list4, 10));
                    while (it.hasNext()) {
                        DocumentWithScopesAndSchemas documentWithScopesAndSchemas4 = (DocumentWithScopesAndSchemas) it.next();
                        scopeEntity = (ScopeEntity) v.n0(documentWithScopesAndSchemas4.c());
                        if (scopeEntity != null) {
                        }
                        bVar3.b(new dx.b.Generic(new NoSuchElementException("Disabled person ID card child document without scope.")));
                        throw new oq.g();
                    }
                    return new dx.i.Right(new DynamicParentDocument(str3, dVarE2, null, arrayList2, multiDocumentSchemaY2, 4, null));
                }
                return objE;
            } catch (Exception e37) {
                e = e37;
            }
        } catch (ex.c e38) {
            e = e38;
        } catch (CancellationException e39) {
            throw e39;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [fg0.c$a, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [gg0.l] */
    @Override // mg0.b
    public Object e(tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        ?? aVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof a) {
            a aVar2 = (a) eVar;
            int i15 = aVar2.f62462p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar2.f62462p = i15 - PKIFailureInfo.systemUnavail;
                aVar = aVar2;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f62460m;
        Object objE = uq.b.e();
        int i16 = aVar.f62462p;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar3 = new ex.a();
                        ?? D0 = ((ContainersDatabase) aVar3.a(v())).d0();
                        aVar.f62457j = jVarA;
                        aVar.f62458k = vq.j.a(aVar3);
                        aVar.f62459l = vq.j.a(aVar3);
                        aVar.f62452d = 0;
                        aVar.f62453e = 0;
                        aVar.f62454f = 0;
                        aVar.f62455g = 0;
                        aVar.f62456h = 0;
                        aVar.f62462p = 1;
                        if (D0.e(aVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        aVar = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(aVar));
                        dx.i iVarA = aVar.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right(i0.f148189a);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009f A[Catch: Exception -> 0x003d, c -> 0x0040, CancellationException -> 0x0043, TryCatch #1 {Exception -> 0x003d, blocks: (B:12:0x0037, B:27:0x008c, B:28:0x0099, B:30:0x009f, B:32:0x00b1, B:34:0x00b7, B:35:0x00c1, B:37:0x00c8, B:41:0x00db, B:43:0x00df, B:70:0x017e, B:72:0x0190, B:74:0x01ab, B:56:0x011c, B:59:0x0125, B:61:0x0134, B:65:0x014c, B:62:0x0142, B:64:0x0146, B:66:0x0152, B:67:0x0157, B:68:0x0158, B:69:0x0159, B:75:0x01b0, B:76:0x01c4, B:77:0x01c5, B:85:0x01d9, B:88:0x01e8), top: B:104:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // mg0.b
    public Object f(String str, tq.e<? super dx.i<? extends dx.b, bg0.b>> eVar) throws Throwable {
        i iVar;
        Object objB;
        ex.b aVar;
        ScopeEntity scopeEntity;
        String name;
        Object next;
        dx.i left;
        Object objB2;
        if (eVar instanceof i) {
            iVar = (i) eVar;
            int i15 = iVar.f62559q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f62559q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(eVar);
            }
        } else {
            iVar = new i(eVar);
        }
        Object obj = iVar.f62557n;
        ?? E = uq.b.e();
        int i16 = iVar.f62559q;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        aVar = new ex.a();
                        gg0.l lVarD0 = ((ContainersDatabase) aVar.a(v())).d0();
                        iVar.f62548d = str;
                        iVar.f62549e = jVarA;
                        iVar.f62550f = vq.j.a(aVar);
                        iVar.f62551g = aVar;
                        iVar.f62552h = 0;
                        iVar.f62553j = 0;
                        iVar.f62554k = 0;
                        iVar.f62555l = 0;
                        iVar.f62556m = 0;
                        iVar.f62559q = 1;
                        Object objT = lVarD0.t(str, iVar);
                        if (objT == E) {
                            return E;
                        }
                        obj = objT;
                        ArrayList arrayList = new ArrayList();
                        for (DocumentWithScopes documentWithScopes : (List) obj) {
                            scopeEntity = (ScopeEntity) v.n0(documentWithScopes.b());
                            if (scopeEntity != null) {
                            }
                            aVar.b(new dx.b.Generic(new NoSuchElementException("Family card child document without scope.")));
                            throw new oq.g();
                        }
                        return new dx.i.Right(new bg0.b(str, arrayList));
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        fVar.d(message != null ? message : "", e, px.c.a(E));
                        dx.i iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ex.b bVar = (ex.b) iVar.f62551g;
                String str2 = (String) iVar.f62548d;
                try {
                    oq.u.b(obj);
                    aVar = bVar;
                    str = str2;
                    ArrayList arrayList2 = new ArrayList();
                    while (r14.hasNext()) {
                        scopeEntity = (ScopeEntity) v.n0(documentWithScopes.b());
                        if (scopeEntity != null || (name = scopeEntity.getName()) == null) {
                            aVar.b(new dx.b.Generic(new NoSuchElementException("Family card child document without scope.")));
                            throw new oq.g();
                        }
                        Iterator it = documentWithScopes.b().iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!fr.t.c(((ScopeEntity) next).getName(), name));
                        ScopeEntity scopeEntity2 = (ScopeEntity) next;
                        if (scopeEntity2 != null) {
                            dx.j<dx.b> jVarA2 = xw.c.f221622a.a();
                            try {
                                try {
                                    new ex.a();
                                    left = new dx.i.Right(this.strictNonNullSerializer.a(this.signedDataDecoder.decode(scopeEntity2.getScope()), q0.n(FamilyCardScope.class)));
                                } catch (Exception e18) {
                                    px.f fVar2 = px.f.f163100a;
                                    String message2 = e18.getMessage();
                                    if (message2 == null) {
                                        message2 = "";
                                    }
                                    fVar2.d(message2, e18, px.c.a(jVarA2));
                                    Object objA = jVarA2.a(e18);
                                    if (objA instanceof dx.i.Left) {
                                        objB2 = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                                    } else {
                                        if (!(objA instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        objB2 = ((dx.i.Right) objA).b();
                                    }
                                    left = new dx.i.Left(objB2);
                                }
                            } catch (ex.c e19) {
                                try {
                                    left = new dx.i.Left((dx.b) ex.d.a(e19));
                                } catch (CancellationException e25) {
                                    throw e25;
                                }
                            } catch (CancellationException e26) {
                                throw e26;
                            }
                        } else {
                            left = new dx.i.Left(new dx.b.Generic(new NoSuchElementException("No scope named " + name + " in the ScopeEntity list.")));
                        }
                        bg0.FamilyCardScope familyCardScopeA = fg0.d.n((FamilyCardScope) aVar.a(left)).a();
                        FamilyCardDocument familyCardDocument = familyCardScopeA != null ? new FamilyCardDocument(documentWithScopes.getDocument().getDocumentId(), fg0.d.c(documentWithScopes.getDocument().h()), name, familyCardScopeA) : null;
                        if (familyCardDocument != null) {
                            arrayList2.add(familyCardDocument);
                        }
                    }
                    return new dx.i.Right(new bg0.b(str, arrayList2));
                } catch (ex.c e27) {
                    e = e27;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e28) {
                    throw e28;
                }
            } catch (Exception e29) {
                e = e29;
            }
        } catch (CancellationException e35) {
            throw e35;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [dx.j, java.lang.Object] */
    @Override // mg0.b
    public Object g(String str, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) throws Throwable {
        m mVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof m) {
            mVar = (m) eVar;
            int i15 = mVar.f62606q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                mVar.f62606q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                mVar = new m(eVar);
            }
        } else {
            mVar = new m(eVar);
        }
        Object obj = mVar.f62604n;
        Object objE = uq.b.e();
        int i16 = mVar.f62606q;
        boolean z15 = true;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        gg0.l lVarD0 = ((ContainersDatabase) aVar.a(v())).d0();
                        mVar.f62595d = vq.j.a(str);
                        mVar.f62596e = jVarA;
                        mVar.f62597f = vq.j.a(aVar);
                        mVar.f62598g = vq.j.a(aVar);
                        mVar.f62599h = 0;
                        mVar.f62600j = 0;
                        mVar.f62601k = 0;
                        mVar.f62602l = 0;
                        mVar.f62603m = 0;
                        mVar.f62606q = 1;
                        Object objD = lVarD0.d(str, mVar);
                        if (objD == objE) {
                            return objE;
                        }
                        obj = objD;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        str = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(str));
                        dx.i iVarA = str.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                if (((Number) obj).intValue() <= 0) {
                    z15 = false;
                }
                return new dx.i.Right(vq.b.a(z15));
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    @Override // mg0.b
    public mu.g<List<Document>> h() {
        dx.i<dx.b, ContainersDatabase> iVarV = v();
        if (iVarV instanceof dx.i.Left) {
            return mu.i.v();
        }
        if (iVarV instanceof dx.i.Right) {
            return mu.i.M(new n(mu.i.p(((ContainersDatabase) ((dx.i.Right) iVarV).b()).d0().h())), g1.b());
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ae A[Catch: Exception -> 0x0037, c -> 0x003a, CancellationException -> 0x003d, TRY_ENTER, TryCatch #6 {Exception -> 0x0037, blocks: (B:12:0x0033, B:27:0x0086, B:28:0x00a6, B:31:0x00ae, B:35:0x00c1, B:37:0x00c5, B:64:0x0164, B:50:0x0102, B:53:0x010b, B:55:0x011a, B:59:0x0132, B:56:0x0128, B:58:0x012c, B:60:0x0138, B:61:0x013d, B:62:0x013e, B:63:0x013f, B:72:0x0188, B:75:0x0197), top: B:93:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x013f A[Catch: Exception -> 0x0037, c -> 0x003a, CancellationException -> 0x003d, TryCatch #6 {Exception -> 0x0037, blocks: (B:12:0x0033, B:27:0x0086, B:28:0x00a6, B:31:0x00ae, B:35:0x00c1, B:37:0x00c5, B:64:0x0164, B:50:0x0102, B:53:0x010b, B:55:0x011a, B:59:0x0132, B:56:0x0128, B:58:0x012c, B:60:0x0138, B:61:0x013d, B:62:0x013e, B:63:0x013f, B:72:0x0188, B:75:0x0197), top: B:93:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:91:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x013f, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [fg0.c$j, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [gg0.l] */
    @Override // mg0.b
    public Object i(tq.e<? super dx.i<? extends dx.b, SchoolCardDocument>> eVar) throws Throwable {
        ?? jVar;
        Object objB;
        ex.c e15;
        ex.b bVar;
        Iterator it;
        Object next;
        ScopeEntity scopeEntity;
        dx.i left;
        Object objB2;
        if (eVar instanceof j) {
            j jVar2 = (j) eVar;
            int i15 = jVar2.f62570p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                jVar2.f62570p = i15 - PKIFailureInfo.systemUnavail;
                jVar = jVar2;
            } else {
                jVar = new j(eVar);
            }
        } else {
            jVar = new j(eVar);
        }
        Object obj = jVar.f62568m;
        Object objE = uq.b.e();
        int i16 = jVar.f62570p;
        try {
            try {
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) jVar.f62567l;
                    try {
                        oq.u.b(obj);
                        DocumentWithScopes documentWithScopes = (DocumentWithScopes) obj;
                        vf0.c cVarC = fg0.d.c(documentWithScopes.getDocument().getStatus());
                        String documentId = documentWithScopes.getDocument().getDocumentId();
                        it = documentWithScopes.b().iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!fr.t.c(((ScopeEntity) next).getName(), "schoolCard"));
                        scopeEntity = (ScopeEntity) next;
                        if (scopeEntity != null) {
                            try {
                                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                                try {
                                    try {
                                        new ex.a();
                                        left = new dx.i.Right(this.strictNonNullSerializer.a(this.signedDataDecoder.decode(scopeEntity.getScope()), q0.n(JuniorSchoolCardScope.class)));
                                    } catch (Exception e16) {
                                        px.f fVar = px.f.f163100a;
                                        String message = e16.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        fVar.d(message, e16, px.c.a(jVarA));
                                        Object objA = jVarA.a(e16);
                                        if (objA instanceof dx.i.Left) {
                                            objB2 = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                                        } else {
                                            if (!(objA instanceof dx.i.Right)) {
                                                throw new oq.p();
                                            }
                                            objB2 = ((dx.i.Right) objA).b();
                                        }
                                        left = new dx.i.Left(objB2);
                                    }
                                } catch (ex.c e17) {
                                    left = new dx.i.Left((dx.b) ex.d.a(e17));
                                } catch (CancellationException e18) {
                                    throw e18;
                                }
                            } catch (CancellationException e19) {
                                throw e19;
                            }
                        } else {
                            left = new dx.i.Left(new dx.b.Generic(new NoSuchElementException("No scope named schoolCard in the ScopeEntity list.")));
                        }
                        return new dx.i.Right(new SchoolCardDocument(documentId, cVarC, "schoolCard", fg0.d.i((JuniorSchoolCardScope) bVar.a(left))));
                    } catch (ex.c e25) {
                        e15 = e25;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e26) {
                        throw e26;
                    }
                }
                oq.u.b(obj);
                dx.j<dx.b> jVarA2 = xw.c.f221622a.a();
                try {
                    ex.a aVar = new ex.a();
                    ?? D0 = ((ContainersDatabase) aVar.a(v())).d0();
                    jVar.f62565j = jVarA2;
                    jVar.f62566k = vq.j.a(aVar);
                    jVar.f62567l = aVar;
                    jVar.f62560d = 0;
                    jVar.f62561e = 0;
                    jVar.f62562f = 0;
                    jVar.f62563g = 0;
                    jVar.f62564h = 0;
                    jVar.f62570p = 1;
                    Object objI = D0.i(jVar);
                    if (objI == objE) {
                        return objE;
                    }
                    obj = objI;
                    bVar = aVar;
                    DocumentWithScopes documentWithScopes2 = (DocumentWithScopes) obj;
                    vf0.c cVarC2 = fg0.d.c(documentWithScopes2.getDocument().getStatus());
                    String documentId2 = documentWithScopes2.getDocument().getDocumentId();
                    it = documentWithScopes2.b().iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!fr.t.c(((ScopeEntity) next).getName(), "schoolCard"));
                    scopeEntity = (ScopeEntity) next;
                    if (scopeEntity != null) {
                        dx.j<dx.b> jVarA3 = xw.c.f221622a.a();
                        new ex.a();
                        left = new dx.i.Right(this.strictNonNullSerializer.a(this.signedDataDecoder.decode(scopeEntity.getScope()), q0.n(JuniorSchoolCardScope.class)));
                    } else {
                        left = new dx.i.Left(new dx.b.Generic(new NoSuchElementException("No scope named schoolCard in the ScopeEntity list.")));
                    }
                    return new dx.i.Right(new SchoolCardDocument(documentId2, cVarC2, "schoolCard", fg0.d.i((JuniorSchoolCardScope) bVar.a(left))));
                } catch (ex.c e27) {
                    e15 = e27;
                    return new dx.i.Left((dx.b) ex.d.a(e15));
                } catch (CancellationException e28) {
                    throw e28;
                } catch (Exception e29) {
                    jVar = jVarA2;
                    e = e29;
                    px.f fVar2 = px.f.f163100a;
                    String message2 = e.getMessage();
                    fVar2.d(message2 != null ? message2 : "", e, px.c.a(jVar));
                    dx.i iVarA = jVar.a(e);
                    if (iVarA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                    } else {
                        if (!(iVarA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) iVarA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (Exception e35) {
                e = e35;
            }
        } catch (CancellationException e36) {
            throw e36;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // mg0.b
    public Object j(String str, String str2, tq.e<? super dx.i<? extends dx.b, DocumentScope>> eVar) throws Throwable {
        f fVar;
        Object objB;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f62522r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f62522r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object obj = fVar.f62520p;
        Object objE = uq.b.e();
        int i16 = fVar.f62522r;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        gg0.l lVarD0 = ((ContainersDatabase) aVar.a(v())).d0();
                        fVar.f62510d = vq.j.a(str);
                        fVar.f62511e = vq.j.a(str2);
                        fVar.f62512f = jVarA;
                        fVar.f62513g = vq.j.a(aVar);
                        fVar.f62514h = vq.j.a(aVar);
                        fVar.f62515j = 0;
                        fVar.f62516k = 0;
                        fVar.f62517l = 0;
                        fVar.f62518m = 0;
                        fVar.f62519n = 0;
                        fVar.f62522r = 1;
                        Object objP = lVarD0.p(str, str2, fVar);
                        if (objP == objE) {
                            return objE;
                        }
                        obj = objP;
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        str = jVarA;
                        px.f fVar2 = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar2.d(message, e, px.c.a(str));
                        dx.i iVarA = str.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                ScopeEntity scopeEntity = (ScopeEntity) obj;
                return new dx.i.Right(new DocumentScope(scopeEntity.getDocumentOwnerId(), scopeEntity.getName(), scopeEntity.getScope()));
            } catch (Exception e25) {
                e = e25;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0333  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v4, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // mg0.b
    public Object k(Integer num, String str, String str2, Map<String, ? extends CMSSignedData> map, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        p pVar;
        Object objB;
        String str3;
        int i15;
        String str4;
        dx.j<dx.b> jVar;
        ex.b bVar;
        ex.b bVar2;
        DrivingLicenceScope drivingLicenceScope;
        Integer num2;
        int i16;
        int i17;
        int i18;
        int i19;
        List list;
        Map.Entry entry;
        Map<String, ? extends CMSSignedData> map2;
        String str5;
        String str6;
        int i25;
        String str7;
        int i26;
        ex.b bVar3;
        ex.b bVar4;
        Map.Entry entry2;
        Map<String, ? extends CMSSignedData> map3;
        DocumentEntity documentEntity;
        List<ScopeEntity> listE;
        gg0.l lVarD0;
        if (eVar instanceof p) {
            pVar = (p) eVar;
            int i27 = pVar.f62656z;
            if ((i27 & PKIFailureInfo.systemUnavail) != 0) {
                pVar.f62656z = i27 - PKIFailureInfo.systemUnavail;
            } else {
                pVar = new p(eVar);
            }
        } else {
            pVar = new p(eVar);
        }
        Object obj = pVar.f62654x;
        ?? E = uq.b.e();
        int i28 = pVar.f62656z;
        try {
            try {
                try {
                    if (i28 == 0) {
                        oq.u.b(obj);
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            List listQ = v.q("INVALIDATED_TEMPORARY_DRIVING_LICENCE", "ACTIVE_TEMPORARY_DRIVING_LICENCE", "DRIVING_LICENCE");
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry<String, ? extends CMSSignedData> entry3 : map.entrySet()) {
                                if (listQ.contains(entry3.getKey())) {
                                    linkedHashMap.put(entry3.getKey(), entry3.getValue());
                                }
                            }
                            Map.Entry entry4 = (Map.Entry) v.m0(linkedHashMap.entrySet());
                            if (entry4 == null) {
                                aVar.b(new dx.b.Generic(new NoSuchElementException("No scope named listed in " + listQ + " in the scopeData.")));
                                throw new oq.g();
                            }
                            DrivingLicenceScope drivingLicenceScope2 = (DrivingLicenceScope) this.strictNonNullSerializer.a(this.signedDataDecoder.decode(((CMSSignedData) entry4.getValue()).getEncoded()), q0.n(DrivingLicenceScope.class));
                            gg0.l lVarD1 = ((ContainersDatabase) aVar.a(v())).d0();
                            pVar.f62637d = num;
                            str3 = str;
                            pVar.f62638e = str3;
                            pVar.f62639f = str2;
                            pVar.f62640g = vq.j.a(map);
                            pVar.f62641h = jVarA;
                            pVar.f62642j = vq.j.a(aVar);
                            pVar.f62643k = aVar;
                            pVar.f62644l = entry4;
                            pVar.f62645m = vq.j.a(listQ);
                            pVar.f62646n = drivingLicenceScope2;
                            i15 = 0;
                            pVar.f62649r = 0;
                            pVar.f62650s = 0;
                            pVar.f62651t = 0;
                            pVar.f62652v = 0;
                            pVar.f62653w = 0;
                            pVar.f62656z = 1;
                            Object objD = lVarD1.d(str2, pVar);
                            if (objD != E) {
                                str4 = str2;
                                jVar = jVarA;
                                bVar = aVar;
                                bVar2 = bVar;
                                obj = objD;
                                drivingLicenceScope = drivingLicenceScope2;
                                num2 = num;
                                i16 = 0;
                                i17 = 0;
                                i18 = 0;
                                i19 = 0;
                                list = listQ;
                                entry = entry4;
                                map2 = map;
                            }
                            return E;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            E = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(E));
                            dx.i iVarA = E.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (i28 != 1) {
                        if (i28 != 2) {
                            if (i28 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            try {
                                oq.u.b(obj);
                                return new dx.i.Right(i0.f148189a);
                            } catch (ex.c e18) {
                                e = e18;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e19) {
                                throw e19;
                            }
                        }
                        int i29 = pVar.f62653w;
                        i17 = pVar.f62652v;
                        i26 = pVar.f62651t;
                        i18 = pVar.f62650s;
                        i19 = pVar.f62649r;
                        drivingLicenceScope = (DrivingLicenceScope) pVar.f62647p;
                        list = (List) pVar.f62645m;
                        entry2 = (Map.Entry) pVar.f62644l;
                        bVar3 = (ex.b) pVar.f62643k;
                        bVar4 = (ex.b) pVar.f62642j;
                        jVar = (dx.j) pVar.f62641h;
                        map3 = (Map) pVar.f62640g;
                        String str8 = (String) pVar.f62639f;
                        String str9 = (String) pVar.f62638e;
                        Integer num3 = (Integer) pVar.f62637d;
                        oq.u.b(obj);
                        i25 = i29;
                        str5 = str8;
                        num2 = num3;
                        str7 = str9;
                        str6 = str7;
                        i16 = i25;
                        bVar2 = bVar4;
                        bVar = bVar3;
                        i15 = i26;
                        map2 = map3;
                        entry = entry2;
                        Integer num4 = num2;
                        String str10 = str5;
                        documentEntity = new DocumentEntity(0, str6, DocumentEntityType.DRIVER_LICENCE, DocumentEntityStatus.ACTIVE, drivingLicenceScope.getDc().getED(), num4, str10, 1, null);
                        listE = v.e(new ScopeEntity(0, str6, (String) entry.getKey(), ((CMSSignedData) entry.getValue()).getEncoded(), 1, null));
                        lVarD0 = ((ContainersDatabase) bVar.a(v())).d0();
                        pVar.f62637d = vq.j.a(num4);
                        pVar.f62638e = vq.j.a(str6);
                        pVar.f62639f = vq.j.a(str10);
                        pVar.f62640g = vq.j.a(map2);
                        pVar.f62641h = jVar;
                        pVar.f62642j = vq.j.a(bVar2);
                        pVar.f62643k = vq.j.a(bVar);
                        pVar.f62644l = vq.j.a(entry);
                        pVar.f62645m = vq.j.a(list);
                        pVar.f62646n = vq.j.a(documentEntity);
                        pVar.f62647p = vq.j.a(listE);
                        pVar.f62648q = vq.j.a(drivingLicenceScope);
                        pVar.f62649r = i19;
                        pVar.f62650s = i18;
                        pVar.f62651t = i15;
                        pVar.f62652v = i17;
                        pVar.f62653w = i16;
                        pVar.f62656z = 3;
                        if (lVarD0.u(documentEntity, listE, pVar) != E) {
                            return new dx.i.Right(i0.f148189a);
                        }
                        return E;
                    }
                    int i35 = pVar.f62653w;
                    i17 = pVar.f62652v;
                    int i36 = pVar.f62651t;
                    i18 = pVar.f62650s;
                    i19 = pVar.f62649r;
                    drivingLicenceScope = (DrivingLicenceScope) pVar.f62646n;
                    list = (List) pVar.f62645m;
                    Map.Entry entry5 = (Map.Entry) pVar.f62644l;
                    ex.b bVar5 = (ex.b) pVar.f62643k;
                    ex.b bVar6 = (ex.b) pVar.f62642j;
                    jVar = (dx.j) pVar.f62641h;
                    map2 = (Map) pVar.f62640g;
                    String str11 = (String) pVar.f62639f;
                    String str12 = (String) pVar.f62638e;
                    Integer num5 = (Integer) pVar.f62637d;
                    oq.u.b(obj);
                    str4 = str11;
                    num2 = num5;
                    bVar2 = bVar6;
                    i16 = i35;
                    bVar = bVar5;
                    i15 = i36;
                    entry = entry5;
                    str3 = str12;
                    if (((Number) obj).intValue() <= 0) {
                        DocumentEntity documentEntity2 = new DocumentEntity(0, str4, DocumentEntityType.DRIVER_LICENCE, DocumentEntityStatus.ACTIVE, null, num2, null, 65, null);
                        str5 = str4;
                        Integer num6 = num2;
                        Map<String, ? extends CMSSignedData> map4 = map2;
                        gg0.l lVarD2 = ((ContainersDatabase) bVar.a(v())).d0();
                        List list2 = list;
                        List<ScopeEntity> listN = v.n();
                        pVar.f62637d = num6;
                        pVar.f62638e = str3;
                        pVar.f62639f = str5;
                        num2 = num6;
                        pVar.f62640g = vq.j.a(map4);
                        pVar.f62641h = jVar;
                        pVar.f62642j = vq.j.a(bVar2);
                        pVar.f62643k = bVar;
                        pVar.f62644l = entry;
                        pVar.f62645m = vq.j.a(list2);
                        pVar.f62646n = vq.j.a(documentEntity2);
                        pVar.f62647p = drivingLicenceScope;
                        pVar.f62649r = i19;
                        pVar.f62650s = i18;
                        pVar.f62651t = i15;
                        pVar.f62652v = i17;
                        pVar.f62653w = i16;
                        pVar.f62656z = 2;
                        if (lVarD2.u(documentEntity2, listN, pVar) != E) {
                            list = list2;
                            i25 = i16;
                            str7 = str3;
                            i26 = i15;
                            bVar3 = bVar;
                            bVar4 = bVar2;
                            entry2 = entry;
                            map3 = map4;
                            str6 = str7;
                            i16 = i25;
                            bVar2 = bVar4;
                            bVar = bVar3;
                            i15 = i26;
                            map2 = map3;
                            entry = entry2;
                            Integer num7 = num2;
                            String str13 = str5;
                            documentEntity = new DocumentEntity(0, str6, DocumentEntityType.DRIVER_LICENCE, DocumentEntityStatus.ACTIVE, drivingLicenceScope.getDc().getED(), num7, str13, 1, null);
                            listE = v.e(new ScopeEntity(0, str6, (String) entry.getKey(), ((CMSSignedData) entry.getValue()).getEncoded(), 1, null));
                            lVarD0 = ((ContainersDatabase) bVar.a(v())).d0();
                            pVar.f62637d = vq.j.a(num7);
                            pVar.f62638e = vq.j.a(str6);
                            pVar.f62639f = vq.j.a(str13);
                            pVar.f62640g = vq.j.a(map2);
                            pVar.f62641h = jVar;
                            pVar.f62642j = vq.j.a(bVar2);
                            pVar.f62643k = vq.j.a(bVar);
                            pVar.f62644l = vq.j.a(entry);
                            pVar.f62645m = vq.j.a(list);
                            pVar.f62646n = vq.j.a(documentEntity);
                            pVar.f62647p = vq.j.a(listE);
                            pVar.f62648q = vq.j.a(drivingLicenceScope);
                            pVar.f62649r = i19;
                            pVar.f62650s = i18;
                            pVar.f62651t = i15;
                            pVar.f62652v = i17;
                            pVar.f62653w = i16;
                            pVar.f62656z = 3;
                            if (lVarD0.u(documentEntity, listE, pVar) != E) {
                                return new dx.i.Right(i0.f148189a);
                            }
                        }
                    } else {
                        str5 = str4;
                        str6 = str3;
                        Integer num8 = num2;
                        String str14 = str5;
                        documentEntity = new DocumentEntity(0, str6, DocumentEntityType.DRIVER_LICENCE, DocumentEntityStatus.ACTIVE, drivingLicenceScope.getDc().getED(), num8, str14, 1, null);
                        listE = v.e(new ScopeEntity(0, str6, (String) entry.getKey(), ((CMSSignedData) entry.getValue()).getEncoded(), 1, null));
                        lVarD0 = ((ContainersDatabase) bVar.a(v())).d0();
                        pVar.f62637d = vq.j.a(num8);
                        pVar.f62638e = vq.j.a(str6);
                        pVar.f62639f = vq.j.a(str14);
                        pVar.f62640g = vq.j.a(map2);
                        pVar.f62641h = jVar;
                        pVar.f62642j = vq.j.a(bVar2);
                        pVar.f62643k = vq.j.a(bVar);
                        pVar.f62644l = vq.j.a(entry);
                        pVar.f62645m = vq.j.a(list);
                        pVar.f62646n = vq.j.a(documentEntity);
                        pVar.f62647p = vq.j.a(listE);
                        pVar.f62648q = vq.j.a(drivingLicenceScope);
                        pVar.f62649r = i19;
                        pVar.f62650s = i18;
                        pVar.f62651t = i15;
                        pVar.f62652v = i17;
                        pVar.f62653w = i16;
                        pVar.f62656z = 3;
                        if (lVarD0.u(documentEntity, listE, pVar) != E) {
                            return new dx.i.Right(i0.f148189a);
                        }
                    }
                    return E;
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        } catch (ex.c e27) {
            e = e27;
        } catch (CancellationException e28) {
            throw e28;
        } catch (Exception e29) {
            e = e29;
            E = jVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:106:0x0378  */
    /* JADX WARN: Code duplicated, block: B:139:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:140:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:143:0x03de  */
    /* JADX WARN: Code duplicated, block: B:144:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:146:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:149:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:54:0x01cc A[Catch: Exception -> 0x0122, c -> 0x0128, CancellationException -> 0x012e, TRY_LEAVE, TryCatch #20 {c -> 0x0128, CancellationException -> 0x012e, Exception -> 0x0122, blocks: (B:34:0x0108, B:52:0x01c4, B:54:0x01cc), top: B:161:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0232  */
    /* JADX WARN: Code duplicated, block: B:59:0x0234  */
    /* JADX WARN: Code duplicated, block: B:68:0x0251  */
    /* JADX WARN: Code duplicated, block: B:71:0x0264 A[Catch: Exception -> 0x0248, c -> 0x024b, CancellationException -> 0x024e, TryCatch #14 {c -> 0x024b, CancellationException -> 0x024e, Exception -> 0x0248, blocks: (B:69:0x025a, B:71:0x0264, B:73:0x026a, B:97:0x02d4, B:103:0x02e8, B:87:0x029c, B:90:0x02a6, B:92:0x02b7, B:96:0x02cf, B:93:0x02c5, B:95:0x02c9, B:99:0x02dd, B:100:0x02e2, B:101:0x02e3, B:56:0x01e9, B:82:0x028b, B:86:0x029b, B:74:0x0270), top: B:166:0x01e9, inners: #3, #22, #16 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [dx.j] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // mg0.b
    public Object l(Integer num, String str, String str2, Map<String, ? extends CMSSignedData> map, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        t tVar;
        String message;
        String str3;
        dx.i iVarA;
        Object objB;
        String str4;
        Map<String, ? extends CMSSignedData> map2;
        String str5;
        dx.j<dx.b> jVar;
        ex.b bVar;
        Object obj;
        Integer num2;
        int i15;
        int i16;
        int i17;
        ex.b bVar2;
        Map.Entry entry;
        UutScope uutScope;
        int i18;
        int i19;
        Integer num3;
        String str6;
        DocumentEntity documentEntity;
        Map<String, ? extends CMSSignedData> map3;
        gg0.l lVarD0;
        List<ScopeEntity> listN;
        String str7;
        dx.j<dx.b> jVar2;
        ex.b bVar3;
        UutScope uutScope2;
        Map<String, ? extends CMSSignedData> map4;
        UutDataContainer dc5;
        LocalDate localDate;
        DocumentEntity documentEntity2;
        List<ScopeEntity> listE;
        gg0.l lVarD1;
        String ed5;
        dx.i left;
        Object objB2;
        if (eVar instanceof t) {
            tVar = (t) eVar;
            int i25 = tVar.f62726y;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                tVar.f62726y = i25 - PKIFailureInfo.systemUnavail;
            } else {
                tVar = new t(eVar);
            }
        } else {
            tVar = new t(eVar);
        }
        Object obj2 = tVar.f62724w;
        ?? E = uq.b.e();
        int i26 = tVar.f62726y;
        String str8 = "";
        try {
            try {
                if (i26 == 0) {
                    oq.u.b(obj2);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        Map.Entry entry2 = (Map.Entry) v.m0(map.entrySet());
                        if (entry2 != null) {
                            UutScope uutScope3 = (UutScope) this.strictNonNullSerializer.a(this.signedDataDecoder.decode(((CMSSignedData) entry2.getValue()).getEncoded()), q0.n(UutScope.class));
                            gg0.l lVarD2 = ((ContainersDatabase) aVar.a(v())).d0();
                            tVar.f62708d = num;
                            str4 = str;
                            tVar.f62709e = str4;
                            tVar.f62710f = str2;
                            tVar.f62711g = vq.j.a(map);
                            tVar.f62712h = jVarA;
                            tVar.f62713j = vq.j.a(aVar);
                            tVar.f62714k = aVar;
                            tVar.f62715l = uutScope3;
                            tVar.f62716m = entry2;
                            tVar.f62719q = 0;
                            tVar.f62720r = 0;
                            tVar.f62721s = 0;
                            tVar.f62722t = 0;
                            tVar.f62723v = 0;
                            tVar.f62726y = 1;
                            Object objD = lVarD2.d(str2, tVar);
                            if (objD != E) {
                                map2 = map;
                                str5 = str2;
                                jVar = jVarA;
                                bVar = aVar;
                                obj = objD;
                                num2 = num;
                                i15 = 0;
                                i16 = 0;
                                i17 = 0;
                                bVar2 = bVar;
                                entry = entry2;
                                uutScope = uutScope3;
                                i18 = 0;
                                i19 = 0;
                                if (((Number) obj).intValue() > 0) {
                                    documentEntity = new DocumentEntity(0, str5, DocumentEntityType.UUT_CARD, DocumentEntityStatus.ACTIVE, null, num2, null, 65, null);
                                    String str9 = str5;
                                    str8 = "";
                                    num3 = num2;
                                    map3 = map2;
                                    lVarD0 = ((ContainersDatabase) bVar2.a(v())).d0();
                                    listN = v.n();
                                    tVar.f62708d = num3;
                                    tVar.f62709e = str4;
                                    tVar.f62710f = str9;
                                    str5 = str9;
                                    tVar.f62711g = vq.j.a(map3);
                                    tVar.f62712h = jVar;
                                    tVar.f62713j = vq.j.a(bVar);
                                    tVar.f62714k = bVar2;
                                    tVar.f62715l = uutScope;
                                    tVar.f62716m = entry;
                                    tVar.f62717n = vq.j.a(documentEntity);
                                    tVar.f62719q = i17;
                                    tVar.f62720r = i16;
                                    tVar.f62721s = i19;
                                    tVar.f62722t = i18;
                                    tVar.f62723v = i15;
                                    tVar.f62726y = 2;
                                    if (lVarD0.u(documentEntity, listN, tVar) == E) {
                                        str7 = str4;
                                        jVar2 = jVar;
                                        bVar3 = bVar;
                                        uutScope2 = uutScope;
                                        map4 = map3;
                                        str6 = str7;
                                        bVar = bVar3;
                                        jVar = jVar2;
                                        map2 = map4;
                                        uutScope = uutScope2;
                                        int i27 = i15;
                                        Integer num4 = num3;
                                        String str10 = str5;
                                        DocumentEntityType documentEntityType = DocumentEntityType.UUT_CARD;
                                        DocumentEntityStatus documentEntityStatus = DocumentEntityStatus.ACTIVE;
                                        dc5 = uutScope.getDc();
                                        if (dc5 != null) {
                                            uutScope = uutScope;
                                            localDate = null;
                                        } else {
                                            uutScope = uutScope;
                                            localDate = null;
                                        }
                                        documentEntity2 = new DocumentEntity(0, str6, documentEntityType, documentEntityStatus, localDate, num4, str10, 1, null);
                                        listE = v.e(new ScopeEntity(0, str6, (String) entry.getKey(), ((CMSSignedData) entry.getValue()).getEncoded(), 1, null));
                                        lVarD1 = ((ContainersDatabase) bVar2.a(v())).d0();
                                        tVar.f62708d = vq.j.a(num4);
                                        tVar.f62709e = vq.j.a(str6);
                                        tVar.f62710f = vq.j.a(str10);
                                        tVar.f62711g = vq.j.a(map2);
                                        tVar.f62712h = jVar;
                                        tVar.f62713j = vq.j.a(bVar);
                                        tVar.f62714k = vq.j.a(bVar2);
                                        tVar.f62715l = vq.j.a(uutScope);
                                        tVar.f62716m = vq.j.a(entry);
                                        tVar.f62717n = vq.j.a(documentEntity2);
                                        tVar.f62718p = vq.j.a(listE);
                                        tVar.f62719q = i17;
                                        tVar.f62720r = i16;
                                        tVar.f62721s = i19;
                                        tVar.f62722t = i18;
                                        tVar.f62723v = i27;
                                        tVar.f62726y = 3;
                                        if (lVarD1.u(documentEntity2, listE, tVar) != E) {
                                            return new dx.i.Right(i0.f148189a);
                                        }
                                    }
                                } else {
                                    str8 = "";
                                    num3 = num2;
                                    str6 = str4;
                                    int i28 = i15;
                                    Integer num5 = num3;
                                    String str11 = str5;
                                    DocumentEntityType documentEntityType2 = DocumentEntityType.UUT_CARD;
                                    DocumentEntityStatus documentEntityStatus2 = DocumentEntityStatus.ACTIVE;
                                    dc5 = uutScope.getDc();
                                    if (dc5 != null) {
                                        uutScope = uutScope;
                                        localDate = null;
                                    } else {
                                        uutScope = uutScope;
                                        localDate = null;
                                    }
                                    documentEntity2 = new DocumentEntity(0, str6, documentEntityType2, documentEntityStatus2, localDate, num5, str11, 1, null);
                                    listE = v.e(new ScopeEntity(0, str6, (String) entry.getKey(), ((CMSSignedData) entry.getValue()).getEncoded(), 1, null));
                                    lVarD1 = ((ContainersDatabase) bVar2.a(v())).d0();
                                    tVar.f62708d = vq.j.a(num5);
                                    tVar.f62709e = vq.j.a(str6);
                                    tVar.f62710f = vq.j.a(str11);
                                    tVar.f62711g = vq.j.a(map2);
                                    tVar.f62712h = jVar;
                                    tVar.f62713j = vq.j.a(bVar);
                                    tVar.f62714k = vq.j.a(bVar2);
                                    tVar.f62715l = vq.j.a(uutScope);
                                    tVar.f62716m = vq.j.a(entry);
                                    tVar.f62717n = vq.j.a(documentEntity2);
                                    tVar.f62718p = vq.j.a(listE);
                                    tVar.f62719q = i17;
                                    tVar.f62720r = i16;
                                    tVar.f62721s = i19;
                                    tVar.f62722t = i18;
                                    tVar.f62723v = i28;
                                    tVar.f62726y = 3;
                                    if (lVarD1.u(documentEntity2, listE, tVar) != E) {
                                        return new dx.i.Right(i0.f148189a);
                                    }
                                }
                            }
                            return E;
                        }
                        try {
                            aVar.b(new dx.b.Generic(new NoSuchElementException("No scopes in the scopeData.")));
                            throw new oq.g();
                        } catch (ex.c e15) {
                            e = e15;
                        } catch (CancellationException e16) {
                            e = e16;
                            throw e;
                        } catch (Exception e17) {
                            e = e17;
                            E = jVarA;
                            px.f fVar = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                str3 = str8;
                            } else {
                                str3 = message;
                            }
                            fVar.d(str3, e, px.c.a(E));
                            iVarA = E.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } catch (ex.c e18) {
                        e = e18;
                    } catch (CancellationException e19) {
                        e = e19;
                    } catch (Exception e25) {
                        e = e25;
                    }
                } else if (i26 == 1) {
                    i15 = tVar.f62723v;
                    int i29 = tVar.f62722t;
                    int i35 = tVar.f62721s;
                    int i36 = tVar.f62720r;
                    int i37 = tVar.f62719q;
                    Map.Entry entry3 = (Map.Entry) tVar.f62716m;
                    UutScope uutScope4 = (UutScope) tVar.f62715l;
                    ex.b bVar4 = (ex.b) tVar.f62714k;
                    ex.b bVar5 = (ex.b) tVar.f62713j;
                    jVar = (dx.j) tVar.f62712h;
                    map2 = (Map) tVar.f62711g;
                    String str12 = (String) tVar.f62710f;
                    String str13 = (String) tVar.f62709e;
                    Integer num6 = (Integer) tVar.f62708d;
                    try {
                        oq.u.b(obj2);
                        i16 = i36;
                        uutScope = uutScope4;
                        entry = entry3;
                        i17 = i37;
                        num2 = num6;
                        str5 = str12;
                        obj = obj2;
                        i19 = i35;
                        bVar = bVar5;
                        i18 = i29;
                        bVar2 = bVar4;
                        str4 = str13;
                        if (((Number) obj).intValue() > 0) {
                            str8 = "";
                            num3 = num2;
                            str6 = str4;
                            int i210 = i15;
                            Integer num7 = num3;
                            String str14 = str5;
                            DocumentEntityType documentEntityType3 = DocumentEntityType.UUT_CARD;
                            DocumentEntityStatus documentEntityStatus3 = DocumentEntityStatus.ACTIVE;
                            dc5 = uutScope.getDc();
                            if (dc5 != null) {
                                uutScope = uutScope;
                                localDate = null;
                            } else {
                                uutScope = uutScope;
                                localDate = null;
                            }
                            documentEntity2 = new DocumentEntity(0, str6, documentEntityType3, documentEntityStatus3, localDate, num7, str14, 1, null);
                            listE = v.e(new ScopeEntity(0, str6, (String) entry.getKey(), ((CMSSignedData) entry.getValue()).getEncoded(), 1, null));
                            lVarD1 = ((ContainersDatabase) bVar2.a(v())).d0();
                            tVar.f62708d = vq.j.a(num7);
                            tVar.f62709e = vq.j.a(str6);
                            tVar.f62710f = vq.j.a(str14);
                            tVar.f62711g = vq.j.a(map2);
                            tVar.f62712h = jVar;
                            tVar.f62713j = vq.j.a(bVar);
                            tVar.f62714k = vq.j.a(bVar2);
                            tVar.f62715l = vq.j.a(uutScope);
                            tVar.f62716m = vq.j.a(entry);
                            tVar.f62717n = vq.j.a(documentEntity2);
                            tVar.f62718p = vq.j.a(listE);
                            tVar.f62719q = i17;
                            tVar.f62720r = i16;
                            tVar.f62721s = i19;
                            tVar.f62722t = i18;
                            tVar.f62723v = i210;
                            tVar.f62726y = 3;
                            if (lVarD1.u(documentEntity2, listE, tVar) != E) {
                                return new dx.i.Right(i0.f148189a);
                            }
                            return E;
                        }
                        documentEntity = new DocumentEntity(0, str5, DocumentEntityType.UUT_CARD, DocumentEntityStatus.ACTIVE, null, num2, null, 65, null);
                        String str15 = str5;
                        str8 = "";
                        num3 = num2;
                        map3 = map2;
                        try {
                            lVarD0 = ((ContainersDatabase) bVar2.a(v())).d0();
                            listN = v.n();
                            tVar.f62708d = num3;
                            tVar.f62709e = str4;
                            tVar.f62710f = str15;
                            str5 = str15;
                            tVar.f62711g = vq.j.a(map3);
                            tVar.f62712h = jVar;
                            tVar.f62713j = vq.j.a(bVar);
                            tVar.f62714k = bVar2;
                            tVar.f62715l = uutScope;
                            tVar.f62716m = entry;
                            tVar.f62717n = vq.j.a(documentEntity);
                            tVar.f62719q = i17;
                            tVar.f62720r = i16;
                            tVar.f62721s = i19;
                            tVar.f62722t = i18;
                            tVar.f62723v = i15;
                            tVar.f62726y = 2;
                            if (lVarD0.u(documentEntity, listN, tVar) == E) {
                                str7 = str4;
                                jVar2 = jVar;
                                bVar3 = bVar;
                                uutScope2 = uutScope;
                                map4 = map3;
                                str6 = str7;
                                bVar = bVar3;
                                jVar = jVar2;
                                map2 = map4;
                                uutScope = uutScope2;
                                int i211 = i15;
                                Integer num8 = num3;
                                String str16 = str5;
                                DocumentEntityType documentEntityType4 = DocumentEntityType.UUT_CARD;
                                DocumentEntityStatus documentEntityStatus4 = DocumentEntityStatus.ACTIVE;
                                dc5 = uutScope.getDc();
                                if (dc5 != null) {
                                    uutScope = uutScope;
                                    localDate = null;
                                } else {
                                    uutScope = uutScope;
                                    localDate = null;
                                }
                                documentEntity2 = new DocumentEntity(0, str6, documentEntityType4, documentEntityStatus4, localDate, num8, str16, 1, null);
                                listE = v.e(new ScopeEntity(0, str6, (String) entry.getKey(), ((CMSSignedData) entry.getValue()).getEncoded(), 1, null));
                                lVarD1 = ((ContainersDatabase) bVar2.a(v())).d0();
                                tVar.f62708d = vq.j.a(num8);
                                tVar.f62709e = vq.j.a(str6);
                                tVar.f62710f = vq.j.a(str16);
                                tVar.f62711g = vq.j.a(map2);
                                tVar.f62712h = jVar;
                                tVar.f62713j = vq.j.a(bVar);
                                tVar.f62714k = vq.j.a(bVar2);
                                tVar.f62715l = vq.j.a(uutScope);
                                tVar.f62716m = vq.j.a(entry);
                                tVar.f62717n = vq.j.a(documentEntity2);
                                tVar.f62718p = vq.j.a(listE);
                                tVar.f62719q = i17;
                                tVar.f62720r = i16;
                                tVar.f62721s = i19;
                                tVar.f62722t = i18;
                                tVar.f62723v = i211;
                                tVar.f62726y = 3;
                                if (lVarD1.u(documentEntity2, listE, tVar) != E) {
                                    return new dx.i.Right(i0.f148189a);
                                }
                            }
                            return E;
                        } catch (ex.c e26) {
                            e = e26;
                        } catch (CancellationException e27) {
                            e = e27;
                            throw e;
                        } catch (Exception e28) {
                            e = e28;
                            E = jVar;
                            px.f fVar2 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                str3 = str8;
                            } else {
                                str3 = message;
                            }
                            fVar2.d(str3, e, px.c.a(E));
                            iVarA = E.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } catch (ex.c e29) {
                        e = e29;
                    } catch (CancellationException e35) {
                        e = e35;
                        throw e;
                    } catch (Exception e36) {
                        e = e36;
                        str8 = "";
                        E = jVar;
                        px.f fVar3 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            str3 = str8;
                        } else {
                            str3 = message;
                        }
                        fVar3.d(str3, e, px.c.a(E));
                        iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else if (i26 == 2) {
                    i15 = tVar.f62723v;
                    i18 = tVar.f62722t;
                    i19 = tVar.f62721s;
                    i16 = tVar.f62720r;
                    i17 = tVar.f62719q;
                    entry = (Map.Entry) tVar.f62716m;
                    uutScope2 = (UutScope) tVar.f62715l;
                    bVar2 = (ex.b) tVar.f62714k;
                    bVar3 = (ex.b) tVar.f62713j;
                    jVar2 = (dx.j) tVar.f62712h;
                    map4 = (Map) tVar.f62711g;
                    String str17 = (String) tVar.f62710f;
                    String str18 = (String) tVar.f62709e;
                    Integer num9 = (Integer) tVar.f62708d;
                    try {
                        oq.u.b(obj2);
                        str5 = str17;
                        str8 = "";
                        num3 = num9;
                        str7 = str18;
                        str6 = str7;
                        bVar = bVar3;
                        jVar = jVar2;
                        map2 = map4;
                        uutScope = uutScope2;
                        int i212 = i15;
                        Integer num10 = num3;
                        String str19 = str5;
                        DocumentEntityType documentEntityType5 = DocumentEntityType.UUT_CARD;
                        DocumentEntityStatus documentEntityStatus5 = DocumentEntityStatus.ACTIVE;
                        dc5 = uutScope.getDc();
                        if (dc5 != null || (ed5 = dc5.getED()) == null) {
                            uutScope = uutScope;
                            localDate = null;
                        } else {
                            try {
                                dx.j<dx.b> jVarA2 = xw.c.f221622a.a();
                                try {
                                    try {
                                        new ex.a();
                                        left = new dx.i.Right(this.dateConverter.o(ed5, fz.c.BLANK_REVERSED));
                                    } catch (Exception e37) {
                                        px.f fVar4 = px.f.f163100a;
                                        String message2 = e37.getMessage();
                                        if (message2 == null) {
                                            message2 = str8;
                                        }
                                        fVar4.d(message2, e37, px.c.a(jVarA2));
                                        Object objA = jVarA2.a(e37);
                                        if (objA instanceof dx.i.Left) {
                                            objB2 = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                                        } else {
                                            if (!(objA instanceof dx.i.Right)) {
                                                throw new oq.p();
                                            }
                                            objB2 = ((dx.i.Right) objA).b();
                                        }
                                        left = new dx.i.Left(objB2);
                                    }
                                } catch (ex.c e38) {
                                    left = new dx.i.Left((dx.b) ex.d.a(e38));
                                } catch (CancellationException e39) {
                                    throw e39;
                                }
                                localDate = (LocalDate) left.a();
                            } catch (CancellationException e45) {
                                throw e45;
                            }
                        }
                        documentEntity2 = new DocumentEntity(0, str6, documentEntityType5, documentEntityStatus5, localDate, num10, str19, 1, null);
                        listE = v.e(new ScopeEntity(0, str6, (String) entry.getKey(), ((CMSSignedData) entry.getValue()).getEncoded(), 1, null));
                        lVarD1 = ((ContainersDatabase) bVar2.a(v())).d0();
                        tVar.f62708d = vq.j.a(num10);
                        tVar.f62709e = vq.j.a(str6);
                        tVar.f62710f = vq.j.a(str19);
                        tVar.f62711g = vq.j.a(map2);
                        tVar.f62712h = jVar;
                        tVar.f62713j = vq.j.a(bVar);
                        tVar.f62714k = vq.j.a(bVar2);
                        tVar.f62715l = vq.j.a(uutScope);
                        tVar.f62716m = vq.j.a(entry);
                        tVar.f62717n = vq.j.a(documentEntity2);
                        tVar.f62718p = vq.j.a(listE);
                        tVar.f62719q = i17;
                        tVar.f62720r = i16;
                        tVar.f62721s = i19;
                        tVar.f62722t = i18;
                        tVar.f62723v = i212;
                        tVar.f62726y = 3;
                        if (lVarD1.u(documentEntity2, listE, tVar) != E) {
                            return new dx.i.Right(i0.f148189a);
                        }
                        return E;
                    } catch (ex.c e46) {
                        e = e46;
                    } catch (CancellationException e47) {
                        throw e47;
                    } catch (Exception e48) {
                        e = e48;
                        str8 = "";
                        E = jVar2;
                        px.f fVar5 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            str3 = str8;
                        } else {
                            str3 = message;
                        }
                        fVar5.d(str3, e, px.c.a(E));
                        iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i26 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    E = (dx.j) tVar.f62712h;
                    try {
                        oq.u.b(obj2);
                        try {
                            return new dx.i.Right(i0.f148189a);
                        } catch (ex.c e49) {
                            e = e49;
                        } catch (CancellationException e55) {
                            throw e55;
                        }
                    } catch (ex.c e56) {
                        e = e56;
                    } catch (CancellationException e57) {
                        throw e57;
                    } catch (Exception e58) {
                        e = e58;
                        str8 = "";
                        px.f fVar6 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            str3 = str8;
                        } else {
                            str3 = message;
                        }
                        fVar6.d(str3, e, px.c.a(E));
                        iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                return new dx.i.Left((dx.b) ex.d.a(e));
            } catch (CancellationException e59) {
                throw e59;
            }
        } catch (Exception e65) {
            e = e65;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
    @Override // mg0.b
    public Object m(String str, tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
        e eVar2;
        Object objB;
        ex.c e15;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f62509q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f62509q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object obj = eVar2.f62507n;
        Object objE = uq.b.e();
        int i16 = eVar2.f62509q;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        gg0.l lVarD0 = ((ContainersDatabase) aVar.a(v())).d0();
                        eVar2.f62498d = vq.j.a(str);
                        eVar2.f62499e = jVarA;
                        eVar2.f62500f = vq.j.a(aVar);
                        eVar2.f62501g = vq.j.a(aVar);
                        eVar2.f62502h = 0;
                        eVar2.f62503j = 0;
                        eVar2.f62504k = 0;
                        eVar2.f62505l = 0;
                        eVar2.f62506m = 0;
                        eVar2.f62509q = 1;
                        Object objQ = lVarD0.q(str, eVar2);
                        if (objQ == objE) {
                            return objE;
                        }
                        obj = objQ;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        str = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(str));
                        dx.i iVarA = str.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right((String) obj);
            } catch (Exception e26) {
                e = e26;
            }
        } catch (CancellationException e27) {
            throw e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
    @Override // mg0.b
    public Object n(String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        C1413c c1413c;
        Object objB;
        ex.c e15;
        if (eVar instanceof C1413c) {
            c1413c = (C1413c) eVar;
            int i15 = c1413c.f62486q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c1413c.f62486q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c1413c = new C1413c(eVar);
            }
        } else {
            c1413c = new C1413c(eVar);
        }
        Object obj = c1413c.f62484n;
        Object objE = uq.b.e();
        int i16 = c1413c.f62486q;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        gg0.l lVarD0 = ((ContainersDatabase) aVar.a(v())).d0();
                        c1413c.f62475d = vq.j.a(str);
                        c1413c.f62476e = jVarA;
                        c1413c.f62477f = vq.j.a(aVar);
                        c1413c.f62478g = vq.j.a(aVar);
                        c1413c.f62479h = 0;
                        c1413c.f62480j = 0;
                        c1413c.f62481k = 0;
                        c1413c.f62482l = 0;
                        c1413c.f62483m = 0;
                        c1413c.f62486q = 1;
                        if (lVarD0.w(str, c1413c) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        str = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(str));
                        dx.i iVarA = str.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right(i0.f148189a);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009f A[Catch: Exception -> 0x003d, c -> 0x0040, CancellationException -> 0x0043, TryCatch #1 {Exception -> 0x003d, blocks: (B:12:0x0037, B:27:0x008c, B:28:0x0099, B:30:0x009f, B:32:0x00b1, B:34:0x00b7, B:35:0x00c1, B:37:0x00c8, B:41:0x00db, B:43:0x00df, B:70:0x017e, B:72:0x0190, B:74:0x01ab, B:56:0x011c, B:59:0x0125, B:61:0x0134, B:65:0x014c, B:62:0x0142, B:64:0x0146, B:66:0x0152, B:67:0x0157, B:68:0x0158, B:69:0x0159, B:75:0x01b0, B:76:0x01c4, B:77:0x01c5, B:85:0x01d9, B:88:0x01e8), top: B:104:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // mg0.b
    public Object o(String str, tq.e<? super dx.i<? extends dx.b, UutCardParentDocument>> eVar) throws Throwable {
        l lVar;
        Object objB;
        ex.b aVar;
        ScopeEntity scopeEntity;
        String name;
        Object next;
        dx.i left;
        Object objB2;
        if (eVar instanceof l) {
            lVar = (l) eVar;
            int i15 = lVar.f62594q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                lVar.f62594q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                lVar = new l(eVar);
            }
        } else {
            lVar = new l(eVar);
        }
        Object obj = lVar.f62592n;
        ?? E = uq.b.e();
        int i16 = lVar.f62594q;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        aVar = new ex.a();
                        gg0.l lVarD0 = ((ContainersDatabase) aVar.a(v())).d0();
                        lVar.f62583d = str;
                        lVar.f62584e = jVarA;
                        lVar.f62585f = vq.j.a(aVar);
                        lVar.f62586g = aVar;
                        lVar.f62587h = 0;
                        lVar.f62588j = 0;
                        lVar.f62589k = 0;
                        lVar.f62590l = 0;
                        lVar.f62591m = 0;
                        lVar.f62594q = 1;
                        Object objT = lVarD0.t(str, lVar);
                        if (objT == E) {
                            return E;
                        }
                        obj = objT;
                        ArrayList arrayList = new ArrayList();
                        for (DocumentWithScopes documentWithScopes : (List) obj) {
                            scopeEntity = (ScopeEntity) v.n0(documentWithScopes.b());
                            if (scopeEntity != null) {
                            }
                            aVar.b(new dx.b.Generic(new NoSuchElementException("Family card child document without scope.")));
                            throw new oq.g();
                        }
                        return new dx.i.Right(new UutCardParentDocument(str, arrayList));
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        fVar.d(message != null ? message : "", e, px.c.a(E));
                        dx.i iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ex.b bVar = (ex.b) lVar.f62586g;
                String str2 = (String) lVar.f62583d;
                try {
                    oq.u.b(obj);
                    aVar = bVar;
                    str = str2;
                    ArrayList arrayList2 = new ArrayList();
                    while (r14.hasNext()) {
                        scopeEntity = (ScopeEntity) v.n0(documentWithScopes.b());
                        if (scopeEntity != null || (name = scopeEntity.getName()) == null) {
                            aVar.b(new dx.b.Generic(new NoSuchElementException("Family card child document without scope.")));
                            throw new oq.g();
                        }
                        Iterator it = documentWithScopes.b().iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!fr.t.c(((ScopeEntity) next).getName(), name));
                        ScopeEntity scopeEntity2 = (ScopeEntity) next;
                        if (scopeEntity2 != null) {
                            dx.j<dx.b> jVarA2 = xw.c.f221622a.a();
                            try {
                                try {
                                    new ex.a();
                                    left = new dx.i.Right(this.strictNonNullSerializer.a(this.signedDataDecoder.decode(scopeEntity2.getScope()), q0.n(UutScope.class)));
                                } catch (Exception e18) {
                                    px.f fVar2 = px.f.f163100a;
                                    String message2 = e18.getMessage();
                                    if (message2 == null) {
                                        message2 = "";
                                    }
                                    fVar2.d(message2, e18, px.c.a(jVarA2));
                                    Object objA = jVarA2.a(e18);
                                    if (objA instanceof dx.i.Left) {
                                        objB2 = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                                    } else {
                                        if (!(objA instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        objB2 = ((dx.i.Right) objA).b();
                                    }
                                    left = new dx.i.Left(objB2);
                                }
                            } catch (ex.c e19) {
                                try {
                                    left = new dx.i.Left((dx.b) ex.d.a(e19));
                                } catch (CancellationException e25) {
                                    throw e25;
                                }
                            } catch (CancellationException e26) {
                                throw e26;
                            }
                        } else {
                            left = new dx.i.Left(new dx.b.Generic(new NoSuchElementException("No scope named " + name + " in the ScopeEntity list.")));
                        }
                        UutCardScope uutCardScopeA = fg0.d.p((UutScope) aVar.a(left)).a();
                        UutCardDocument uutCardDocument = uutCardScopeA != null ? new UutCardDocument(documentWithScopes.getDocument().getDocumentId(), fg0.d.c(documentWithScopes.getDocument().h()), name, uutCardScopeA) : null;
                        if (uutCardDocument != null) {
                            arrayList2.add(uutCardDocument);
                        }
                    }
                    return new dx.i.Right(new UutCardParentDocument(str, arrayList2));
                } catch (ex.c e27) {
                    e = e27;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e28) {
                    throw e28;
                }
            } catch (Exception e29) {
                e = e29;
            }
        } catch (CancellationException e35) {
            throw e35;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // mg0.b
    public Object p(String str, vf0.c cVar, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        u uVar;
        Object objB;
        if (eVar instanceof u) {
            uVar = (u) eVar;
            int i15 = uVar.f62739r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                uVar.f62739r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                uVar = new u(eVar);
            }
        } else {
            uVar = new u(eVar);
        }
        Object obj = uVar.f62737p;
        Object objE = uq.b.e();
        int i16 = uVar.f62739r;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        gg0.l lVarD0 = ((ContainersDatabase) aVar.a(v())).d0();
                        DocumentEntityStatus documentEntityStatusB = fg0.d.b(cVar);
                        uVar.f62727d = vq.j.a(str);
                        uVar.f62728e = vq.j.a(cVar);
                        uVar.f62729f = jVarA;
                        uVar.f62730g = vq.j.a(aVar);
                        uVar.f62731h = vq.j.a(aVar);
                        uVar.f62732j = 0;
                        uVar.f62733k = 0;
                        uVar.f62734l = 0;
                        uVar.f62735m = 0;
                        uVar.f62736n = 0;
                        uVar.f62739r = 1;
                        if (lVarD0.n(str, documentEntityStatusB, uVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        str = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(str));
                        dx.i iVarA = str.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new dx.i.Right(i0.f148189a);
            } catch (Exception e25) {
                e = e25;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b7 A[Catch: Exception -> 0x003b, c -> 0x003e, CancellationException -> 0x0041, TRY_ENTER, TryCatch #2 {Exception -> 0x003b, blocks: (B:12:0x0037, B:27:0x008f, B:28:0x00af, B:31:0x00b7, B:35:0x00ca, B:37:0x00ce, B:64:0x016d, B:50:0x010b, B:53:0x0114, B:55:0x0123, B:59:0x013b, B:56:0x0131, B:58:0x0135, B:60:0x0141, B:61:0x0146, B:62:0x0147, B:63:0x0148, B:72:0x018b, B:75:0x019a), top: B:91:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0148 A[Catch: Exception -> 0x003b, c -> 0x003e, CancellationException -> 0x0041, TryCatch #2 {Exception -> 0x003b, blocks: (B:12:0x0037, B:27:0x008f, B:28:0x00af, B:31:0x00b7, B:35:0x00ca, B:37:0x00ce, B:64:0x016d, B:50:0x010b, B:53:0x0114, B:55:0x0123, B:59:0x013b, B:56:0x0131, B:58:0x0135, B:60:0x0141, B:61:0x0146, B:62:0x0147, B:63:0x0148, B:72:0x018b, B:75:0x019a), top: B:91:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x0148, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // mg0.b
    public Object q(String str, tq.e<? super dx.i<? extends dx.b, SchoolCardDocument>> eVar) throws Throwable {
        k kVar;
        Object objB;
        ex.b bVar;
        Iterator it;
        Object next;
        ScopeEntity scopeEntity;
        dx.i left;
        Object objB2;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i15 = kVar.f62582q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f62582q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        Object obj = kVar.f62580n;
        ?? E = uq.b.e();
        int i16 = kVar.f62582q;
        try {
            try {
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) kVar.f62574g;
                    try {
                        oq.u.b(obj);
                        DocumentWithScopes documentWithScopes = (DocumentWithScopes) obj;
                        vf0.c cVarC = fg0.d.c(documentWithScopes.getDocument().h());
                        String documentId = documentWithScopes.getDocument().getDocumentId();
                        it = documentWithScopes.b().iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!fr.t.c(((ScopeEntity) next).getName(), "schoolCard"));
                        scopeEntity = (ScopeEntity) next;
                        if (scopeEntity != null) {
                            try {
                                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                                try {
                                    try {
                                        new ex.a();
                                        left = new dx.i.Right(this.strictNonNullSerializer.a(this.signedDataDecoder.decode(scopeEntity.getScope()), q0.n(JuniorSchoolCardScope.class)));
                                    } catch (Exception e15) {
                                        px.f fVar = px.f.f163100a;
                                        String message = e15.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        fVar.d(message, e15, px.c.a(jVarA));
                                        Object objA = jVarA.a(e15);
                                        if (objA instanceof dx.i.Left) {
                                            objB2 = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                                        } else {
                                            if (!(objA instanceof dx.i.Right)) {
                                                throw new oq.p();
                                            }
                                            objB2 = ((dx.i.Right) objA).b();
                                        }
                                        left = new dx.i.Left(objB2);
                                    }
                                } catch (ex.c e16) {
                                    left = new dx.i.Left((dx.b) ex.d.a(e16));
                                } catch (CancellationException e17) {
                                    throw e17;
                                }
                            } catch (CancellationException e18) {
                                throw e18;
                            }
                        } else {
                            left = new dx.i.Left(new dx.b.Generic(new NoSuchElementException("No scope named schoolCard in the ScopeEntity list.")));
                        }
                        return new dx.i.Right(new SchoolCardDocument(documentId, cVarC, "schoolCard", fg0.d.i((JuniorSchoolCardScope) bVar.a(left))));
                    } catch (ex.c e19) {
                        e = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                oq.u.b(obj);
                dx.j<dx.b> jVarA2 = xw.c.f221622a.a();
                try {
                    ex.a aVar = new ex.a();
                    gg0.l lVarD0 = ((ContainersDatabase) aVar.a(v())).d0();
                    kVar.f62571d = vq.j.a(str);
                    kVar.f62572e = jVarA2;
                    kVar.f62573f = vq.j.a(aVar);
                    kVar.f62574g = aVar;
                    kVar.f62575h = 0;
                    kVar.f62576j = 0;
                    kVar.f62577k = 0;
                    kVar.f62578l = 0;
                    kVar.f62579m = 0;
                    kVar.f62582q = 1;
                    Object objF = lVarD0.f(str, kVar);
                    if (objF == E) {
                        return E;
                    }
                    obj = objF;
                    bVar = aVar;
                    DocumentWithScopes documentWithScopes2 = (DocumentWithScopes) obj;
                    vf0.c cVarC2 = fg0.d.c(documentWithScopes2.getDocument().h());
                    String documentId2 = documentWithScopes2.getDocument().getDocumentId();
                    it = documentWithScopes2.b().iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!fr.t.c(((ScopeEntity) next).getName(), "schoolCard"));
                    scopeEntity = (ScopeEntity) next;
                    if (scopeEntity != null) {
                        dx.j<dx.b> jVarA3 = xw.c.f221622a.a();
                        new ex.a();
                        left = new dx.i.Right(this.strictNonNullSerializer.a(this.signedDataDecoder.decode(scopeEntity.getScope()), q0.n(JuniorSchoolCardScope.class)));
                    } else {
                        left = new dx.i.Left(new dx.b.Generic(new NoSuchElementException("No scope named schoolCard in the ScopeEntity list.")));
                    }
                    return new dx.i.Right(new SchoolCardDocument(documentId2, cVarC2, "schoolCard", fg0.d.i((JuniorSchoolCardScope) bVar.a(left))));
                } catch (ex.c e26) {
                    e = e26;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e27) {
                    throw e27;
                } catch (Exception e28) {
                    e = e28;
                    E = jVarA2;
                    px.f fVar2 = px.f.f163100a;
                    String message2 = e.getMessage();
                    fVar2.d(message2 != null ? message2 : "", e, px.c.a(E));
                    dx.i iVarA = E.a(e);
                    if (iVarA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                    } else {
                        if (!(iVarA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) iVarA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (Exception e29) {
                e = e29;
            }
        } catch (CancellationException e35) {
            throw e35;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0227 A[Catch: Exception -> 0x00b4, c -> 0x00b8, CancellationException -> 0x00bc, TryCatch #6 {c -> 0x00b8, CancellationException -> 0x00bc, Exception -> 0x00b4, blocks: (B:25:0x00aa, B:52:0x021b, B:54:0x0227, B:57:0x0230, B:34:0x00f2, B:43:0x018d, B:45:0x0195), top: B:89:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x022e  */
    /* JADX WARN: Code duplicated, block: B:60:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v4, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // mg0.b
    public Object r(Integer num, String str, String str2, Map<String, ? extends CMSSignedData> map, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        q qVar;
        Object objB;
        String str3;
        Map<String, ? extends CMSSignedData> map2;
        String str4;
        dx.j<dx.b> jVar;
        ex.b bVar;
        Integer num2;
        int i15;
        int i16;
        int i17;
        ex.b bVar2;
        Map.Entry entry;
        FamilyCardScope familyCardScope;
        int i18;
        int i19;
        Integer num3;
        Map<String, ? extends CMSSignedData> map3;
        String str5;
        String str6;
        Map<String, ? extends CMSSignedData> map4;
        int i25;
        String str7;
        FamilyCardScope familyCardScope2;
        String str8;
        DocumentEntity documentEntity;
        FamilyDataContainer dc5;
        LocalDate ed5;
        List<ScopeEntity> listE;
        gg0.l lVarD0;
        if (eVar instanceof q) {
            qVar = (q) eVar;
            int i26 = qVar.f62675y;
            if ((i26 & PKIFailureInfo.systemUnavail) != 0) {
                qVar.f62675y = i26 - PKIFailureInfo.systemUnavail;
            } else {
                qVar = new q(eVar);
            }
        } else {
            qVar = new q(eVar);
        }
        Object obj = qVar.f62673w;
        ?? E = uq.b.e();
        int i27 = qVar.f62675y;
        try {
            try {
                try {
                    if (i27 == 0) {
                        oq.u.b(obj);
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            Map.Entry entry2 = (Map.Entry) v.m0(map.entrySet());
                            if (entry2 == null) {
                                aVar.b(new dx.b.Generic(new NoSuchElementException("No scopes in the scopeData.")));
                                throw new oq.g();
                            }
                            FamilyCardScope familyCardScope3 = (FamilyCardScope) this.strictNonNullSerializer.a(this.signedDataDecoder.decode(((CMSSignedData) entry2.getValue()).getEncoded()), q0.n(FamilyCardScope.class));
                            gg0.l lVarD1 = ((ContainersDatabase) aVar.a(v())).d0();
                            qVar.f62657d = num;
                            str3 = str;
                            qVar.f62658e = str3;
                            qVar.f62659f = str2;
                            qVar.f62660g = vq.j.a(map);
                            qVar.f62661h = jVarA;
                            qVar.f62662j = vq.j.a(aVar);
                            qVar.f62663k = aVar;
                            qVar.f62664l = familyCardScope3;
                            qVar.f62665m = entry2;
                            qVar.f62668q = 0;
                            qVar.f62669r = 0;
                            qVar.f62670s = 0;
                            qVar.f62671t = 0;
                            qVar.f62672v = 0;
                            qVar.f62675y = 1;
                            Object objD = lVarD1.d(str2, qVar);
                            if (objD != E) {
                                map2 = map;
                                str4 = str2;
                                jVar = jVarA;
                                bVar = aVar;
                                obj = objD;
                                num2 = num;
                                i15 = 0;
                                i16 = 0;
                                i17 = 0;
                                bVar2 = bVar;
                                entry = entry2;
                                familyCardScope = familyCardScope3;
                                i18 = 0;
                                i19 = 0;
                            }
                            return E;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            E = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(E));
                            dx.i iVarA = E.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (i27 != 1) {
                        if (i27 != 2) {
                            if (i27 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            try {
                                oq.u.b(obj);
                                return new dx.i.Right(i0.f148189a);
                            } catch (ex.c e18) {
                                e = e18;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e19) {
                                throw e19;
                            }
                        }
                        int i28 = qVar.f62672v;
                        i18 = qVar.f62671t;
                        i19 = qVar.f62670s;
                        i16 = qVar.f62669r;
                        i17 = qVar.f62668q;
                        entry = (Map.Entry) qVar.f62665m;
                        familyCardScope2 = (FamilyCardScope) qVar.f62664l;
                        bVar2 = (ex.b) qVar.f62663k;
                        bVar = (ex.b) qVar.f62662j;
                        jVar = (dx.j) qVar.f62661h;
                        map4 = (Map) qVar.f62660g;
                        str8 = (String) qVar.f62659f;
                        String str9 = (String) qVar.f62658e;
                        Integer num4 = (Integer) qVar.f62657d;
                        oq.u.b(obj);
                        i25 = i28;
                        num3 = num4;
                        str7 = str9;
                        str5 = str7;
                        i15 = i25;
                        str6 = str8;
                        familyCardScope = familyCardScope2;
                        map3 = map4;
                        Integer num5 = num3;
                        DocumentEntityType documentEntityType = DocumentEntityType.FAMILY_CARD;
                        DocumentEntityStatus documentEntityStatus = DocumentEntityStatus.ACTIVE;
                        dc5 = familyCardScope.getDc();
                        if (dc5 != null) {
                            ed5 = dc5.getED();
                        } else {
                            ed5 = null;
                        }
                        documentEntity = new DocumentEntity(0, str5, documentEntityType, documentEntityStatus, ed5, num5, str6, 1, null);
                        listE = v.e(new ScopeEntity(0, str5, (String) entry.getKey(), ((CMSSignedData) entry.getValue()).getEncoded(), 1, null));
                        Map<String, ? extends CMSSignedData> map5 = map3;
                        lVarD0 = ((ContainersDatabase) bVar2.a(v())).d0();
                        qVar.f62657d = vq.j.a(num5);
                        qVar.f62658e = vq.j.a(str5);
                        qVar.f62659f = vq.j.a(str6);
                        qVar.f62660g = vq.j.a(map5);
                        qVar.f62661h = jVar;
                        qVar.f62662j = vq.j.a(bVar);
                        qVar.f62663k = vq.j.a(bVar2);
                        qVar.f62664l = vq.j.a(familyCardScope);
                        qVar.f62665m = vq.j.a(entry);
                        qVar.f62666n = vq.j.a(documentEntity);
                        qVar.f62667p = vq.j.a(listE);
                        qVar.f62668q = i17;
                        qVar.f62669r = i16;
                        qVar.f62670s = i19;
                        qVar.f62671t = i18;
                        qVar.f62672v = i15;
                        qVar.f62675y = 3;
                        if (lVarD0.u(documentEntity, listE, qVar) != E) {
                            return new dx.i.Right(i0.f148189a);
                        }
                        return E;
                    }
                    int i29 = qVar.f62672v;
                    i18 = qVar.f62671t;
                    int i35 = qVar.f62670s;
                    i16 = qVar.f62669r;
                    i17 = qVar.f62668q;
                    entry = (Map.Entry) qVar.f62665m;
                    FamilyCardScope familyCardScope4 = (FamilyCardScope) qVar.f62664l;
                    bVar2 = (ex.b) qVar.f62663k;
                    bVar = (ex.b) qVar.f62662j;
                    jVar = (dx.j) qVar.f62661h;
                    map2 = (Map) qVar.f62660g;
                    String str10 = (String) qVar.f62659f;
                    String str11 = (String) qVar.f62658e;
                    Integer num6 = (Integer) qVar.f62657d;
                    oq.u.b(obj);
                    num2 = num6;
                    str4 = str10;
                    i15 = i29;
                    i19 = i35;
                    familyCardScope = familyCardScope4;
                    str3 = str11;
                    if (((Number) obj).intValue() <= 0) {
                        DocumentEntity documentEntity2 = new DocumentEntity(0, str4, DocumentEntityType.FAMILY_CARD, DocumentEntityStatus.ACTIVE, null, num2, null, 65, null);
                        String str12 = str4;
                        num3 = num2;
                        ex.b bVar3 = bVar;
                        gg0.l lVarD2 = ((ContainersDatabase) bVar2.a(v())).d0();
                        Map<String, ? extends CMSSignedData> map6 = map2;
                        List<ScopeEntity> listN = v.n();
                        qVar.f62657d = num3;
                        qVar.f62658e = str3;
                        qVar.f62659f = str12;
                        qVar.f62660g = vq.j.a(map6);
                        qVar.f62661h = jVar;
                        qVar.f62662j = vq.j.a(bVar3);
                        qVar.f62663k = bVar2;
                        qVar.f62664l = familyCardScope;
                        qVar.f62665m = entry;
                        qVar.f62666n = vq.j.a(documentEntity2);
                        qVar.f62668q = i17;
                        qVar.f62669r = i16;
                        qVar.f62670s = i19;
                        qVar.f62671t = i18;
                        qVar.f62672v = i15;
                        qVar.f62675y = 2;
                        if (lVarD2.u(documentEntity2, listN, qVar) != E) {
                            bVar = bVar3;
                            map4 = map6;
                            i25 = i15;
                            str7 = str3;
                            familyCardScope2 = familyCardScope;
                            str8 = str12;
                            str5 = str7;
                            i15 = i25;
                            str6 = str8;
                            familyCardScope = familyCardScope2;
                            map3 = map4;
                            Integer num7 = num3;
                            DocumentEntityType documentEntityType2 = DocumentEntityType.FAMILY_CARD;
                            DocumentEntityStatus documentEntityStatus2 = DocumentEntityStatus.ACTIVE;
                            dc5 = familyCardScope.getDc();
                            if (dc5 != null) {
                                ed5 = dc5.getED();
                            } else {
                                ed5 = null;
                            }
                            documentEntity = new DocumentEntity(0, str5, documentEntityType2, documentEntityStatus2, ed5, num7, str6, 1, null);
                            listE = v.e(new ScopeEntity(0, str5, (String) entry.getKey(), ((CMSSignedData) entry.getValue()).getEncoded(), 1, null));
                            Map<String, ? extends CMSSignedData> map7 = map3;
                            lVarD0 = ((ContainersDatabase) bVar2.a(v())).d0();
                            qVar.f62657d = vq.j.a(num7);
                            qVar.f62658e = vq.j.a(str5);
                            qVar.f62659f = vq.j.a(str6);
                            qVar.f62660g = vq.j.a(map7);
                            qVar.f62661h = jVar;
                            qVar.f62662j = vq.j.a(bVar);
                            qVar.f62663k = vq.j.a(bVar2);
                            qVar.f62664l = vq.j.a(familyCardScope);
                            qVar.f62665m = vq.j.a(entry);
                            qVar.f62666n = vq.j.a(documentEntity);
                            qVar.f62667p = vq.j.a(listE);
                            qVar.f62668q = i17;
                            qVar.f62669r = i16;
                            qVar.f62670s = i19;
                            qVar.f62671t = i18;
                            qVar.f62672v = i15;
                            qVar.f62675y = 3;
                            if (lVarD0.u(documentEntity, listE, qVar) != E) {
                                return new dx.i.Right(i0.f148189a);
                            }
                        }
                    } else {
                        num3 = num2;
                        map3 = map2;
                        str5 = str3;
                        str6 = str4;
                        Integer num8 = num3;
                        DocumentEntityType documentEntityType3 = DocumentEntityType.FAMILY_CARD;
                        DocumentEntityStatus documentEntityStatus3 = DocumentEntityStatus.ACTIVE;
                        dc5 = familyCardScope.getDc();
                        if (dc5 != null) {
                            ed5 = dc5.getED();
                        } else {
                            ed5 = null;
                        }
                        documentEntity = new DocumentEntity(0, str5, documentEntityType3, documentEntityStatus3, ed5, num8, str6, 1, null);
                        listE = v.e(new ScopeEntity(0, str5, (String) entry.getKey(), ((CMSSignedData) entry.getValue()).getEncoded(), 1, null));
                        Map<String, ? extends CMSSignedData> map8 = map3;
                        lVarD0 = ((ContainersDatabase) bVar2.a(v())).d0();
                        qVar.f62657d = vq.j.a(num8);
                        qVar.f62658e = vq.j.a(str5);
                        qVar.f62659f = vq.j.a(str6);
                        qVar.f62660g = vq.j.a(map8);
                        qVar.f62661h = jVar;
                        qVar.f62662j = vq.j.a(bVar);
                        qVar.f62663k = vq.j.a(bVar2);
                        qVar.f62664l = vq.j.a(familyCardScope);
                        qVar.f62665m = vq.j.a(entry);
                        qVar.f62666n = vq.j.a(documentEntity);
                        qVar.f62667p = vq.j.a(listE);
                        qVar.f62668q = i17;
                        qVar.f62669r = i16;
                        qVar.f62670s = i19;
                        qVar.f62671t = i18;
                        qVar.f62672v = i15;
                        qVar.f62675y = 3;
                        if (lVarD0.u(documentEntity, listE, qVar) != E) {
                            return new dx.i.Right(i0.f148189a);
                        }
                    }
                    return E;
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        } catch (ex.c e27) {
            e = e27;
        } catch (CancellationException e28) {
            throw e28;
        } catch (Exception e29) {
            e = e29;
            E = jVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0240 A[Catch: Exception -> 0x00c5, c -> 0x00c9, CancellationException -> 0x00cd, TryCatch #7 {c -> 0x00c9, CancellationException -> 0x00cd, Exception -> 0x00c5, blocks: (B:25:0x00b8, B:52:0x0234, B:54:0x0240, B:57:0x0249, B:34:0x0109, B:43:0x01a1, B:45:0x01a9), top: B:89:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0247  */
    /* JADX WARN: Code duplicated, block: B:60:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v4, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // mg0.b
    public Object s(Integer num, String str, String str2, Map<String, ? extends CMSSignedData> map, String str3, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        o oVar;
        Object objB;
        Map<String, ? extends CMSSignedData> map2;
        String str4;
        String str5;
        String str6;
        ex.b bVar;
        ex.b bVar2;
        CMSSignedData cMSSignedData;
        Integer num2;
        int i15;
        int i16;
        int i17;
        dx.j<dx.b> jVar;
        DisabledPersonScope disabledPersonScope;
        int i18;
        int i19;
        String str7;
        String str8;
        ex.b bVar3;
        ?? r15;
        int i25;
        int i26;
        String str9;
        Map<String, ? extends CMSSignedData> map3;
        String str10;
        ex.b bVar4;
        ?? r16;
        ?? r17;
        DocumentEntity documentEntity;
        DisabledPersonDataContainer container;
        LocalDate expirationDate;
        ScopeEntity scopeEntity;
        SchemaEntity schemaEntity;
        gg0.l lVarD0;
        ?? r18;
        if (eVar instanceof o) {
            oVar = (o) eVar;
            int i27 = oVar.A;
            if ((i27 & PKIFailureInfo.systemUnavail) != 0) {
                oVar.A = i27 - PKIFailureInfo.systemUnavail;
            } else {
                oVar = new o(eVar);
            }
        } else {
            oVar = new o(eVar);
        }
        Object obj = oVar.f62635y;
        ?? E = uq.b.e();
        int i28 = oVar.A;
        try {
            try {
                try {
                    if (i28 == 0) {
                        oq.u.b(obj);
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            map2 = map;
                            CMSSignedData cMSSignedData2 = map2.get("DISABLED_PERSON_IDENTIFICATION_CARD");
                            if (cMSSignedData2 == null) {
                                aVar.b(new dx.b.Generic(new NoSuchElementException("No scope named DISABLED_PERSON_IDENTIFICATION_CARD in the scopeData.")));
                                throw new oq.g();
                            }
                            DisabledPersonScope disabledPersonScope2 = (DisabledPersonScope) this.strictNonNullSerializer.a(this.signedDataDecoder.decode(cMSSignedData2.getEncoded()), q0.n(DisabledPersonScope.class));
                            gg0.l lVarD1 = ((ContainersDatabase) aVar.a(v())).d0();
                            oVar.f62617d = num;
                            str4 = str;
                            oVar.f62618e = str4;
                            oVar.f62619f = str2;
                            oVar.f62620g = vq.j.a(map2);
                            str5 = str3;
                            oVar.f62621h = str5;
                            oVar.f62622j = jVarA;
                            oVar.f62623k = vq.j.a(aVar);
                            oVar.f62624l = aVar;
                            oVar.f62625m = disabledPersonScope2;
                            oVar.f62626n = cMSSignedData2;
                            oVar.f62630s = 0;
                            oVar.f62631t = 0;
                            oVar.f62632v = 0;
                            oVar.f62633w = 0;
                            oVar.f62634x = 0;
                            oVar.A = 1;
                            Object objD = lVarD1.d(str2, oVar);
                            if (objD != E) {
                                r16 = E;
                                str6 = str2;
                                bVar = aVar;
                                bVar2 = bVar;
                                cMSSignedData = cMSSignedData2;
                                num2 = num;
                                i15 = 0;
                                i16 = 0;
                                i17 = 0;
                                jVar = jVarA;
                                obj = objD;
                                disabledPersonScope = disabledPersonScope2;
                                i18 = 0;
                                i19 = 0;
                            }
                            r16 = E;
                            return r16;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            E = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(E));
                            dx.i iVarA = E.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (i28 != 1) {
                        if (i28 != 2) {
                            if (i28 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            try {
                                oq.u.b(obj);
                                return new dx.i.Right(i0.f148189a);
                            } catch (ex.c e18) {
                                e = e18;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e19) {
                                throw e19;
                            }
                        }
                        int i29 = oVar.f62634x;
                        i16 = oVar.f62633w;
                        i26 = oVar.f62632v;
                        i18 = oVar.f62631t;
                        i19 = oVar.f62630s;
                        cMSSignedData = (CMSSignedData) oVar.f62626n;
                        disabledPersonScope = (DisabledPersonScope) oVar.f62625m;
                        bVar3 = (ex.b) oVar.f62624l;
                        bVar4 = (ex.b) oVar.f62623k;
                        jVar = (dx.j) oVar.f62622j;
                        str10 = (String) oVar.f62621h;
                        map3 = (Map) oVar.f62620g;
                        String str11 = (String) oVar.f62619f;
                        String str12 = (String) oVar.f62618e;
                        Integer num3 = (Integer) oVar.f62617d;
                        oq.u.b(obj);
                        i25 = i29;
                        str7 = str11;
                        num2 = num3;
                        str9 = str12;
                        r18 = E;
                        int i35 = i26;
                        map2 = map3;
                        i17 = i35;
                        str8 = str9;
                        i15 = i25;
                        bVar2 = bVar4;
                        str5 = str10;
                        r17 = r18;
                        String str13 = str7;
                        Integer num4 = num2;
                        DocumentEntityType documentEntityType = DocumentEntityType.DISABLED_PERSON_IDENTIFICATION_CARD;
                        DocumentEntityStatus documentEntityStatus = DocumentEntityStatus.ACTIVE;
                        container = disabledPersonScope.getContainer();
                        if (container != null) {
                            expirationDate = container.getExpirationDate();
                        } else {
                            expirationDate = null;
                        }
                        documentEntity = new DocumentEntity(0, str8, documentEntityType, documentEntityStatus, expirationDate, num4, str13, 1, null);
                        scopeEntity = new ScopeEntity(0, str8, "DISABLED_PERSON_IDENTIFICATION_CARD", cMSSignedData.getEncoded(), 1, null);
                        Map<String, ? extends CMSSignedData> map4 = map2;
                        schemaEntity = new SchemaEntity(0, str8, str5.getBytes(fu.d.UTF_8), 1, null);
                        lVarD0 = ((ContainersDatabase) bVar3.a(v())).d0();
                        oVar.f62617d = vq.j.a(num4);
                        oVar.f62618e = vq.j.a(str8);
                        oVar.f62619f = vq.j.a(str13);
                        oVar.f62620g = vq.j.a(map4);
                        oVar.f62621h = vq.j.a(str5);
                        oVar.f62622j = jVar;
                        oVar.f62623k = vq.j.a(bVar2);
                        oVar.f62624l = vq.j.a(bVar3);
                        oVar.f62625m = vq.j.a(disabledPersonScope);
                        oVar.f62626n = vq.j.a(cMSSignedData);
                        oVar.f62627p = vq.j.a(documentEntity);
                        oVar.f62628q = vq.j.a(scopeEntity);
                        oVar.f62629r = vq.j.a(schemaEntity);
                        oVar.f62630s = i19;
                        oVar.f62631t = i18;
                        oVar.f62632v = i17;
                        oVar.f62633w = i16;
                        oVar.f62634x = i15;
                        oVar.A = 3;
                        r16 = r17;
                        if (lVarD0.r(documentEntity, scopeEntity, schemaEntity, oVar) != r17) {
                            return new dx.i.Right(i0.f148189a);
                        }
                        r16 = E;
                        return r16;
                    }
                    int i36 = oVar.f62634x;
                    i16 = oVar.f62633w;
                    i17 = oVar.f62632v;
                    i18 = oVar.f62631t;
                    i19 = oVar.f62630s;
                    cMSSignedData = (CMSSignedData) oVar.f62626n;
                    disabledPersonScope = (DisabledPersonScope) oVar.f62625m;
                    ex.b bVar5 = (ex.b) oVar.f62624l;
                    ex.b bVar6 = (ex.b) oVar.f62623k;
                    jVar = (dx.j) oVar.f62622j;
                    String str14 = (String) oVar.f62621h;
                    map2 = (Map) oVar.f62620g;
                    String str15 = (String) oVar.f62619f;
                    String str16 = (String) oVar.f62618e;
                    Integer num5 = (Integer) oVar.f62617d;
                    oq.u.b(obj);
                    str6 = str15;
                    num2 = num5;
                    bVar2 = bVar6;
                    str5 = str14;
                    i15 = i36;
                    bVar = bVar5;
                    str4 = str16;
                    if (((Number) obj).intValue() <= 0) {
                        DocumentEntity documentEntity2 = new DocumentEntity(0, str6, DocumentEntityType.DISABLED_PERSON_IDENTIFICATION_CARD, DocumentEntityStatus.ACTIVE, null, num2, null, 65, null);
                        str7 = str6;
                        Integer num6 = num2;
                        Map<String, ? extends CMSSignedData> map5 = map2;
                        gg0.l lVarD2 = ((ContainersDatabase) bVar.a(v())).d0();
                        List<ScopeEntity> listN = v.n();
                        oVar.f62617d = num6;
                        oVar.f62618e = str4;
                        oVar.f62619f = str7;
                        num2 = num6;
                        oVar.f62620g = vq.j.a(map5);
                        oVar.f62621h = str5;
                        oVar.f62622j = jVar;
                        oVar.f62623k = vq.j.a(bVar2);
                        oVar.f62624l = bVar;
                        oVar.f62625m = disabledPersonScope;
                        oVar.f62626n = cMSSignedData;
                        oVar.f62627p = vq.j.a(documentEntity2);
                        oVar.f62630s = i19;
                        oVar.f62631t = i18;
                        oVar.f62632v = i17;
                        oVar.f62633w = i16;
                        oVar.f62634x = i15;
                        oVar.A = 2;
                        if (lVarD2.u(documentEntity2, listN, oVar) == r15) {
                            r15 = E;
                            r16 = r15;
                        } else {
                            r15 = E;
                            i25 = i15;
                            i26 = i17;
                            str9 = str4;
                            bVar3 = bVar;
                            map3 = map5;
                            str10 = str5;
                            bVar4 = bVar2;
                            r18 = r15;
                            int i37 = i26;
                            map2 = map3;
                            i17 = i37;
                            str8 = str9;
                            i15 = i25;
                            bVar2 = bVar4;
                            str5 = str10;
                            r17 = r18;
                            String str17 = str7;
                            Integer num7 = num2;
                            DocumentEntityType documentEntityType2 = DocumentEntityType.DISABLED_PERSON_IDENTIFICATION_CARD;
                            DocumentEntityStatus documentEntityStatus2 = DocumentEntityStatus.ACTIVE;
                            container = disabledPersonScope.getContainer();
                            if (container != null) {
                                expirationDate = container.getExpirationDate();
                            } else {
                                expirationDate = null;
                            }
                            documentEntity = new DocumentEntity(0, str8, documentEntityType2, documentEntityStatus2, expirationDate, num7, str17, 1, null);
                            scopeEntity = new ScopeEntity(0, str8, "DISABLED_PERSON_IDENTIFICATION_CARD", cMSSignedData.getEncoded(), 1, null);
                            Map<String, ? extends CMSSignedData> map6 = map2;
                            schemaEntity = new SchemaEntity(0, str8, str5.getBytes(fu.d.UTF_8), 1, null);
                            lVarD0 = ((ContainersDatabase) bVar3.a(v())).d0();
                            oVar.f62617d = vq.j.a(num7);
                            oVar.f62618e = vq.j.a(str8);
                            oVar.f62619f = vq.j.a(str17);
                            oVar.f62620g = vq.j.a(map6);
                            oVar.f62621h = vq.j.a(str5);
                            oVar.f62622j = jVar;
                            oVar.f62623k = vq.j.a(bVar2);
                            oVar.f62624l = vq.j.a(bVar3);
                            oVar.f62625m = vq.j.a(disabledPersonScope);
                            oVar.f62626n = vq.j.a(cMSSignedData);
                            oVar.f62627p = vq.j.a(documentEntity);
                            oVar.f62628q = vq.j.a(scopeEntity);
                            oVar.f62629r = vq.j.a(schemaEntity);
                            oVar.f62630s = i19;
                            oVar.f62631t = i18;
                            oVar.f62632v = i17;
                            oVar.f62633w = i16;
                            oVar.f62634x = i15;
                            oVar.A = 3;
                            r16 = r17;
                            if (lVarD0.r(documentEntity, scopeEntity, schemaEntity, oVar) != r17) {
                                return new dx.i.Right(i0.f148189a);
                            }
                        }
                    } else {
                        str7 = str6;
                        str8 = str4;
                        bVar3 = bVar;
                        r17 = E;
                        String str18 = str7;
                        Integer num8 = num2;
                        DocumentEntityType documentEntityType3 = DocumentEntityType.DISABLED_PERSON_IDENTIFICATION_CARD;
                        DocumentEntityStatus documentEntityStatus3 = DocumentEntityStatus.ACTIVE;
                        container = disabledPersonScope.getContainer();
                        if (container != null) {
                            expirationDate = container.getExpirationDate();
                        } else {
                            expirationDate = null;
                        }
                        documentEntity = new DocumentEntity(0, str8, documentEntityType3, documentEntityStatus3, expirationDate, num8, str18, 1, null);
                        scopeEntity = new ScopeEntity(0, str8, "DISABLED_PERSON_IDENTIFICATION_CARD", cMSSignedData.getEncoded(), 1, null);
                        Map<String, ? extends CMSSignedData> map7 = map2;
                        schemaEntity = new SchemaEntity(0, str8, str5.getBytes(fu.d.UTF_8), 1, null);
                        lVarD0 = ((ContainersDatabase) bVar3.a(v())).d0();
                        oVar.f62617d = vq.j.a(num8);
                        oVar.f62618e = vq.j.a(str8);
                        oVar.f62619f = vq.j.a(str18);
                        oVar.f62620g = vq.j.a(map7);
                        oVar.f62621h = vq.j.a(str5);
                        oVar.f62622j = jVar;
                        oVar.f62623k = vq.j.a(bVar2);
                        oVar.f62624l = vq.j.a(bVar3);
                        oVar.f62625m = vq.j.a(disabledPersonScope);
                        oVar.f62626n = vq.j.a(cMSSignedData);
                        oVar.f62627p = vq.j.a(documentEntity);
                        oVar.f62628q = vq.j.a(scopeEntity);
                        oVar.f62629r = vq.j.a(schemaEntity);
                        oVar.f62630s = i19;
                        oVar.f62631t = i18;
                        oVar.f62632v = i17;
                        oVar.f62633w = i16;
                        oVar.f62634x = i15;
                        oVar.A = 3;
                        r16 = r17;
                        if (lVarD0.r(documentEntity, scopeEntity, schemaEntity, oVar) != r17) {
                            return new dx.i.Right(i0.f148189a);
                        }
                    }
                    r16 = E;
                    return r16;
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        } catch (ex.c e27) {
            e = e27;
        } catch (CancellationException e28) {
            throw e28;
        } catch (Exception e29) {
            e = e29;
            E = jVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a5 A[Catch: Exception -> 0x003d, c -> 0x0040, CancellationException -> 0x0043, TryCatch #2 {Exception -> 0x003d, blocks: (B:12:0x0037, B:27:0x008c, B:28:0x009f, B:30:0x00a5, B:32:0x00b7, B:34:0x00bd, B:35:0x00db, B:37:0x00e1, B:41:0x00f4, B:43:0x00f8, B:70:0x0197, B:56:0x0135, B:59:0x013e, B:61:0x014d, B:65:0x0165, B:62:0x015b, B:64:0x015f, B:66:0x016b, B:67:0x0170, B:68:0x0171, B:69:0x0172, B:71:0x01b1, B:72:0x01c5, B:73:0x01c6, B:74:0x01cf, B:76:0x01d5, B:78:0x01e2, B:79:0x01e6, B:87:0x01fa, B:90:0x0209), top: B:110:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01d5 A[Catch: Exception -> 0x003d, c -> 0x0040, CancellationException -> 0x0043, TryCatch #2 {Exception -> 0x003d, blocks: (B:12:0x0037, B:27:0x008c, B:28:0x009f, B:30:0x00a5, B:32:0x00b7, B:34:0x00bd, B:35:0x00db, B:37:0x00e1, B:41:0x00f4, B:43:0x00f8, B:70:0x0197, B:56:0x0135, B:59:0x013e, B:61:0x014d, B:65:0x0165, B:62:0x015b, B:64:0x015f, B:66:0x016b, B:67:0x0170, B:68:0x0171, B:69:0x0172, B:71:0x01b1, B:72:0x01c5, B:73:0x01c6, B:74:0x01cf, B:76:0x01d5, B:78:0x01e2, B:79:0x01e6, B:87:0x01fa, B:90:0x0209), top: B:110:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // mg0.b
    public Object t(String str, tq.e<? super dx.i<? extends dx.b, xf0.d>> eVar) throws Throwable {
        g gVar;
        Object objB;
        ex.b aVar;
        ArrayList arrayList;
        ScopeEntity scopeEntity;
        String name;
        Object next;
        dx.i left;
        Object objB2;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f62534q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f62534q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object obj = gVar.f62532n;
        ?? E = uq.b.e();
        int i16 = gVar.f62534q;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        aVar = new ex.a();
                        gg0.l lVarD0 = ((ContainersDatabase) aVar.a(v())).d0();
                        gVar.f62523d = str;
                        gVar.f62524e = jVarA;
                        gVar.f62525f = vq.j.a(aVar);
                        gVar.f62526g = aVar;
                        gVar.f62527h = 0;
                        gVar.f62528j = 0;
                        gVar.f62529k = 0;
                        gVar.f62530l = 0;
                        gVar.f62531m = 0;
                        gVar.f62534q = 1;
                        Object objT = lVarD0.t(str, gVar);
                        if (objT == E) {
                            return E;
                        }
                        obj = objT;
                        List<DocumentWithScopes> list = (List) obj;
                        ArrayList arrayList2 = new ArrayList(v.y(list, 10));
                        for (DocumentWithScopes documentWithScopes : list) {
                            scopeEntity = (ScopeEntity) v.n0(documentWithScopes.b());
                            if (scopeEntity != null) {
                            }
                            aVar.b(new dx.b.Generic(new NoSuchElementException("Driving licence child document without scope.")));
                            throw new oq.g();
                        }
                        arrayList = new ArrayList();
                        for (Object obj2 : arrayList2) {
                            if (((DrivingLicenceDocument) obj2).getScopeData() != null) {
                                arrayList.add(obj2);
                            }
                        }
                        return new dx.i.Right(new xf0.d(str, arrayList));
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        fVar.d(message != null ? message : "", e, px.c.a(E));
                        dx.i iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                }
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ex.b bVar = (ex.b) gVar.f62526g;
                String str2 = (String) gVar.f62523d;
                try {
                    oq.u.b(obj);
                    aVar = bVar;
                    str = str2;
                    List<DocumentWithScopes> list2 = (List) obj;
                    ArrayList arrayList3 = new ArrayList(v.y(list2, 10));
                    while (r14.hasNext()) {
                        scopeEntity = (ScopeEntity) v.n0(documentWithScopes.b());
                        if (scopeEntity != null || (name = scopeEntity.getName()) == null) {
                            aVar.b(new dx.b.Generic(new NoSuchElementException("Driving licence child document without scope.")));
                            throw new oq.g();
                        }
                        String documentId = documentWithScopes.getDocument().getDocumentId();
                        vf0.c cVarC = fg0.d.c(documentWithScopes.getDocument().h());
                        Iterator it = documentWithScopes.b().iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!fr.t.c(((ScopeEntity) next).getName(), name));
                        ScopeEntity scopeEntity2 = (ScopeEntity) next;
                        if (scopeEntity2 != null) {
                            dx.j<dx.b> jVarA2 = xw.c.f221622a.a();
                            try {
                                try {
                                    new ex.a();
                                    left = new dx.i.Right(this.strictNonNullSerializer.a(this.signedDataDecoder.decode(scopeEntity2.getScope()), q0.n(DrivingLicenceScope.class)));
                                } catch (Exception e18) {
                                    px.f fVar2 = px.f.f163100a;
                                    String message2 = e18.getMessage();
                                    if (message2 == null) {
                                        message2 = "";
                                    }
                                    fVar2.d(message2, e18, px.c.a(jVarA2));
                                    Object objA = jVarA2.a(e18);
                                    if (objA instanceof dx.i.Left) {
                                        objB2 = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                                    } else {
                                        if (!(objA instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        objB2 = ((dx.i.Right) objA).b();
                                    }
                                    left = new dx.i.Left(objB2);
                                }
                            } catch (ex.c e19) {
                                try {
                                    left = new dx.i.Left((dx.b) ex.d.a(e19));
                                } catch (CancellationException e25) {
                                    throw e25;
                                }
                            } catch (CancellationException e26) {
                                throw e26;
                            }
                        } else {
                            left = new dx.i.Left(new dx.b.Generic(new NoSuchElementException("No scope named " + name + " in the ScopeEntity list.")));
                        }
                        arrayList3.add(new DrivingLicenceDocument(documentId, cVarC, name, fg0.d.m((DrivingLicenceScope) aVar.a(left)).a()));
                    }
                    arrayList = new ArrayList();
                    while (r0.hasNext()) {
                        if (((DrivingLicenceDocument) obj2).getScopeData() != null) {
                            arrayList.add(obj2);
                        }
                    }
                    return new dx.i.Right(new xf0.d(str, arrayList));
                } catch (ex.c e27) {
                    e = e27;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e28) {
                    throw e28;
                }
            } catch (Exception e29) {
                e = e29;
            }
        } catch (CancellationException e35) {
            throw e35;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // mg0.b
    public Object u(Integer num, String str, Map<String, ? extends CMSSignedData> map, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        s sVar;
        Object objB;
        if (eVar instanceof s) {
            sVar = (s) eVar;
            int i15 = sVar.f62707x;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                sVar.f62707x = i15 - PKIFailureInfo.systemUnavail;
            } else {
                sVar = new s(eVar);
            }
        } else {
            sVar = new s(eVar);
        }
        Object obj = sVar.f62705v;
        ?? E = uq.b.e();
        int i16 = sVar.f62707x;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        CMSSignedData cMSSignedData = map.get("schoolCard");
                        if (cMSSignedData == null) {
                            aVar.b(new dx.b.Generic(new NoSuchElementException("No scope named schoolCard in the scopeData.")));
                            throw new oq.g();
                        }
                        JuniorSchoolCardScope juniorSchoolCardScope = (JuniorSchoolCardScope) this.strictNonNullSerializer.a(this.signedDataDecoder.decode(cMSSignedData.getEncoded()), q0.n(JuniorSchoolCardScope.class));
                        DocumentEntity documentEntity = new DocumentEntity(0, str, DocumentEntityType.SCHOOL_CARD, DocumentEntityStatus.ACTIVE, juniorSchoolCardScope.getContainer().getExpirationDate(), num, null, 65, null);
                        List<ScopeEntity> listE = v.e(new ScopeEntity(0, str, "schoolCard", cMSSignedData.getEncoded(), 1, null));
                        gg0.l lVarD0 = ((ContainersDatabase) aVar.a(v())).d0();
                        sVar.f62690d = vq.j.a(num);
                        sVar.f62691e = vq.j.a(str);
                        sVar.f62692f = vq.j.a(map);
                        sVar.f62693g = jVarA;
                        sVar.f62694h = vq.j.a(aVar);
                        sVar.f62695j = vq.j.a(aVar);
                        sVar.f62696k = vq.j.a(juniorSchoolCardScope);
                        sVar.f62697l = vq.j.a(cMSSignedData);
                        sVar.f62698m = vq.j.a(documentEntity);
                        sVar.f62699n = vq.j.a(listE);
                        sVar.f62700p = 0;
                        sVar.f62701q = 0;
                        sVar.f62702r = 0;
                        sVar.f62703s = 0;
                        sVar.f62704t = 0;
                        sVar.f62707x = 1;
                        if (lVarD0.u(documentEntity, listE, sVar) == E) {
                            return E;
                        }
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(E));
                        dx.i iVarA = E.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new dx.i.Right(i0.f148189a);
            } catch (CancellationException e25) {
                throw e25;
            }
        } catch (Exception e26) {
            e = e26;
        }
    }
}
