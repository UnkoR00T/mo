package nd4;

import ci2.PensionerData;
import ei2.RailwayCardWrapped;
import er0.BEDocumentStatus;
import fr.q0;
import gr0.DocumentSchema;
import gr0.DynamicDocument;
import hr0.MultiDocumentSchema;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import jr0.DrivingLicenceScope;
import jr0.NipipScope;
import jr0.PersonalDataScope9;
import ju.g1;
import ju.l0;
import ju.p0;
import ju.z2;
import k34.AdvocateDataModel;
import k34.DeputyCardModel;
import k34.DocumentCertsSet;
import k34.DrivingLicenceScopes;
import k34.FamilyDataModel;
import k34.PensionerCardDocumentData;
import k34.RailwayCardDocumentData;
import k34.StudentCardDocumentData;
import k34.WruDocumentData;
import kj2.LocalDocumentDataWrapped;
import l34.DynamicDocumentDataContainer;
import m34.DynamicMultiDocumentFullDataContainer;
import m34.DynamicMultiDocumentSchemaContainer;
import mu.h0;
import oq.i0;
import or0.DocumentSchemaDtoDto;
import or0.MultiDocumentSchemaDtoDto;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.cms.CMSEnvelopedData;
import org.bouncycastle.cms.CMSSignedData;
import org.bouncycastle.cms.CMSTypedData;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.deserializer.NullableTypeAdapterFactory;
import pl.gov.coi.mobywatel.be.offlinedocumentsservice.data.model.DynamicDocumentSchemaContainerDto;
import pl.gov.coi.mobywatel.be.offlinedocumentsservice.data.model.DynamicDocumentSchemaListContainerDto;
import pl.gov.coi.mobywatel.feature.legacy.storage.ContainerManagerNew;
import pl.gov.coi.mobywatel.technical.documents.data.model.DocumentByIdContainerDto;
import pl.gov.coi.mobywatel.technical.documents.data.model.DrivingLicenceScopeDto;
import pl.gov.coi.mobywatel.technical.documents.data.model.DynamicMultiDocumentDataContainerDto;
import pl.gov.coi.mobywatel.technical.documents.data.model.NipipScopeDto;
import pl.gov.coi.mobywatel.technical.documents.data.model.personal.PersonalDataScope9Dto;
import pl.gov.mc.fringers.mobywatel.storage.EncryptedScope;
import pq.v0;
import vh2.RefugeeWrapped;
import wh2.AdvocateData;
import yh2.DeputyCardWrapped;
import zh2.FamilyData;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000º\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ<\u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020 H\u0096@¢\u0006\u0004\b(\u0010)J,\u0010,\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b,\u0010-J\u001e\u00100\u001a\b\u0012\u0004\u0012\u00020*0/2\u0006\u0010.\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b0\u00101J.\u00103\u001a \u0012\u0004\u0012\u00020&\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0/020%H\u0096@¢\u0006\u0004\b3\u00104J\u001c\u00106\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u0002050%H\u0096@¢\u0006\u0004\b6\u00104J4\u0010<\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010.\u001a\u0002072\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0096@¢\u0006\u0004\b<\u0010=J4\u0010?\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010>\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020:H\u0096@¢\u0006\u0004\b?\u0010@J\u0018\u0010B\u001a\u00020A2\u0006\u0010\u001f\u001a\u00020\u001eH\u0096@¢\u0006\u0004\bB\u00101J\u001b\u0010D\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020C0%H\u0016¢\u0006\u0004\bD\u0010EJ\u001c\u0010G\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020F0%H\u0096@¢\u0006\u0004\bG\u00104J\u001c\u0010H\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020F0%H\u0096@¢\u0006\u0004\bH\u00104J,\u0010K\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020J0%2\u0006\u00109\u001a\u0002082\u0006\u0010I\u001a\u00020*H\u0096@¢\u0006\u0004\bK\u0010LJ*\u0010M\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0/0%2\u0006\u00109\u001a\u000208H\u0096@¢\u0006\u0004\bM\u0010NJ$\u0010O\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020J0%2\u0006\u00109\u001a\u000208H\u0096@¢\u0006\u0004\bO\u0010NJ\u001b\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020P0%H\u0016¢\u0006\u0004\bQ\u0010EJ\u001b\u0010S\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020R0%H\u0016¢\u0006\u0004\bS\u0010EJ\u001b\u0010U\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020T0%H\u0016¢\u0006\u0004\bU\u0010EJ,\u0010X\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010V\u001a\u00020*2\u0006\u0010W\u001a\u00020AH\u0096@¢\u0006\u0004\bX\u0010YJ$\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010V\u001a\u00020*H\u0096@¢\u0006\u0004\bZ\u0010[J,\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010V\u001a\u00020*2\u0006\u0010W\u001a\u00020AH\u0096@¢\u0006\u0004\b\\\u0010YJ\u0018\u0010]\u001a\u00020'2\u0006\u0010\u001f\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b]\u00101J,\u0010_\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010^\u001a\u00020*H\u0096@¢\u0006\u0004\b_\u0010`J#\u0010b\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020a0%2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\bb\u0010cJ2\u0010f\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020d0/2\u0006\u0010\u001f\u001a\u00020\u001eH\u0096@¢\u0006\u0004\bf\u0010gJ\u001b\u0010h\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%H\u0016¢\u0006\u0004\bh\u0010EJ\u001c\u0010j\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020i0%H\u0096@¢\u0006\u0004\bj\u00104J.\u0010n\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020*0%2\u0006\u0010l\u001a\u00020k2\b\u0010m\u001a\u0004\u0018\u00010*H\u0096@¢\u0006\u0004\bn\u0010oJ(\u0010q\u001a\u001a\u0012\u0004\u0012\u00020&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020p020%H\u0096@¢\u0006\u0004\bq\u00104J#\u0010t\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020*0%2\u0006\u0010s\u001a\u00020rH\u0016¢\u0006\u0004\bt\u0010uJ,\u0010x\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020w0%2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010v\u001a\u00020*H\u0096@¢\u0006\u0004\bx\u0010`J(\u0010z\u001a\u001a\u0012\u0004\u0012\u00020&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020y020%H\u0096@¢\u0006\u0004\bz\u00104J\u001c\u0010|\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020{0%H\u0096@¢\u0006\u0004\b|\u00104J,\u0010~\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010}\u001a\u00020*2\u0006\u0010$\u001a\u00020 H\u0096@¢\u0006\u0004\b~\u0010\u007fJ)\u0010\u0082\u0001\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0096@¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J!\u0010\u0084\u0001\u001a\u0011\u0012\u0004\u0012\u00020&\u0012\u0007\u0012\u0005\u0018\u00010\u0080\u00010%H\u0096@¢\u0006\u0005\b\u0084\u0001\u00104J(\u0010\u0086\u0001\u001a\u000f\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030\u0080\u00010%2\u0007\u0010\u0085\u0001\u001a\u00020*H\u0096@¢\u0006\u0005\b\u0086\u0001\u0010[J2\u0010\u0088\u0001\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0007\u0010\u0085\u0001\u001a\u00020*2\b\u0010\u0087\u0001\u001a\u00030\u0080\u0001H\u0096@¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J$\u0010\u008a\u0001\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0/0%H\u0096@¢\u0006\u0005\b\u008a\u0001\u00104J'\u0010\u008b\u0001\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0007\u0010\u0085\u0001\u001a\u00020*H\u0096@¢\u0006\u0005\b\u008b\u0001\u0010[J \u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0/2\u0006\u0010\u001f\u001a\u00020\u001eH\u0096@¢\u0006\u0005\b\u008c\u0001\u00101J=\u0010\u008e\u0001\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\r\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u0002070/2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J1\u0010\u0093\u0001\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\b\u0010\u0091\u0001\u001a\u00030\u0090\u00012\u0007\u0010\u0092\u0001\u001a\u00020\u001eH\u0016¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J>\u0010\u0095\u0001\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010\u001f\u001a\u00020\u001e2\r\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u0002070/2\u0006\u0010;\u001a\u00020:H\u0096@¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J.\u0010\u0097\u0001\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020*0%2\u0006\u00109\u001a\u0002082\u0006\u0010I\u001a\u00020*H\u0096@¢\u0006\u0005\b\u0097\u0001\u0010LJ1\u0010\u0099\u0001\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020*0%2\b\u0010\u0092\u0001\u001a\u00030\u0098\u00012\u0006\u0010^\u001a\u00020*H\u0096@¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J)\u0010\u009c\u0001\u001a\u000f\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030\u009b\u00010%2\b\u0010\u0092\u0001\u001a\u00030\u0098\u0001H\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J$\u0010\u009f\u0001\u001a\u0015\u0012\u0004\u0012\u00020&\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009e\u00010/0%H\u0016¢\u0006\u0005\b\u009f\u0001\u0010EJ\u001f\u0010¡\u0001\u001a\u000f\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030 \u00010%H\u0096@¢\u0006\u0005\b¡\u0001\u00104J+\u0010¢\u0001\u001a\u001b\u0012\u0004\u0012\u00020&\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020r\u0012\u0005\u0012\u00030 \u0001020%H\u0096@¢\u0006\u0005\b¢\u0001\u00104J.\u0010£\u0001\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010+\u001a\u00020*2\u0006\u0010W\u001a\u00020AH\u0096@¢\u0006\u0005\b£\u0001\u0010YJ\u0018\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0/H\u0096@¢\u0006\u0005\b¤\u0001\u00104J\u001a\u0010§\u0001\u001a\n\u0012\u0005\u0012\u00030¦\u00010¥\u0001H\u0016¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u001d\u0010ª\u0001\u001a\u00020'2\b\u0010©\u0001\u001a\u00030¦\u0001H\u0096@¢\u0006\u0006\bª\u0001\u0010«\u0001J)\u0010¬\u0001\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\b\u0010\u0087\u0001\u001a\u00030\u0080\u0001H\u0096@¢\u0006\u0006\b¬\u0001\u0010\u0083\u0001J)\u0010®\u0001\u001a\u0019\u0012\u0004\u0012\u00020&\u0012\u000f\u0012\r \u00ad\u0001*\u0005\u0018\u00010\u0080\u00010\u0080\u00010%H\u0096@¢\u0006\u0005\b®\u0001\u00104J\u001e\u0010¯\u0001\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%H\u0096@¢\u0006\u0005\b¯\u0001\u00104J\u001a\u0010°\u0001\u001a\u00020A2\u0006\u00109\u001a\u000208H\u0082@¢\u0006\u0005\b°\u0001\u0010NJ&\u0010²\u0001\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020F0%2\u0007\u0010±\u0001\u001a\u00020\u001eH\u0002¢\u0006\u0005\b²\u0001\u0010cJ&\u0010´\u0001\u001a\u0017\u0012\u0004\u0012\u00020&\u0012\r\u0012\u000b\u0012\u0005\u0012\u00030³\u0001\u0018\u00010/0%H\u0002¢\u0006\u0005\b´\u0001\u0010EJ/\u0010¶\u0001\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u00109\u001a\u0002082\u0007\u0010µ\u0001\u001a\u00020*H\u0002¢\u0006\u0006\b¶\u0001\u0010·\u0001J(\u0010º\u0001\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\b\u0010¹\u0001\u001a\u00030¸\u0001H\u0002¢\u0006\u0006\bº\u0001\u0010»\u0001J'\u0010¼\u0001\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020*0%2\u0006\u0010l\u001a\u00020kH\u0082@¢\u0006\u0006\b¼\u0001\u0010½\u0001J4\u0010¿\u0001\u001a\u000f\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030\u0080\u00010%2\u0006\u0010l\u001a\u00020k2\u000b\b\u0002\u0010¾\u0001\u001a\u0004\u0018\u00010*H\u0082@¢\u0006\u0005\b¿\u0001\u0010oJ*\u0010Á\u0001\u001a\u000f\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030\u0080\u00010%2\t\u0010À\u0001\u001a\u0004\u0018\u00010*H\u0082@¢\u0006\u0005\bÁ\u0001\u0010[J4\u0010Ä\u0001\u001a\u000f\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030\u0080\u00010%2\t\u0010¾\u0001\u001a\u0004\u0018\u00010*2\b\u0010Ã\u0001\u001a\u00030Â\u0001H\u0002¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J6\u0010Ç\u0001\u001a\u000f\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030\u0080\u00010%2\u0014\u0010Æ\u0001\u001a\u000f\u0012\u0004\u0012\u00020*\u0012\u0005\u0012\u00030\u0080\u000102H\u0082@¢\u0006\u0006\bÇ\u0001\u0010È\u0001JF\u0010Ì\u0001\u001a\u001b\u0012\u0004\u0012\u00020&\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020*\u0012\u0005\u0012\u00030Ë\u0001020%*\u000f\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030\u0080\u00010%2\b\u0010Ê\u0001\u001a\u00030É\u0001H\u0002¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J:\u0010Î\u0001\u001a\u000f\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030Ë\u00010%*\u000f\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030\u0080\u00010%2\b\u0010Ê\u0001\u001a\u00030É\u0001H\u0002¢\u0006\u0006\bÎ\u0001\u0010Í\u0001J'\u0010Ñ\u0001\u001a\u00020'2\b\u0010Ï\u0001\u001a\u00030Â\u00012\t\u0010Ð\u0001\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J$\u0010Ô\u0001\u001a\u00020*2\b\u0010Ó\u0001\u001a\u00030\u0080\u00012\u0006\u0010$\u001a\u00020*H\u0002¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J/\u0010Ø\u0001\u001a\u00020A2\u0006\u0010s\u001a\u00020r2\t\u0010Ö\u0001\u001a\u0004\u0018\u00010*2\b\u0010×\u0001\u001a\u00030¸\u0001H\u0002¢\u0006\u0006\bØ\u0001\u0010Ù\u0001J%\u0010Û\u0001\u001a\u00030\u0080\u00012\b\u0010Ú\u0001\u001a\u00030\u0080\u00012\u0006\u0010$\u001a\u00020*H\u0002¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001J=\u0010à\u0001\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\b\u0010Ï\u0001\u001a\u00030Â\u00012\b\u0010Þ\u0001\u001a\u00030Ý\u00012\t\u0010ß\u0001\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0006\bà\u0001\u0010á\u0001J\u001b\u0010â\u0001\u001a\u00030¸\u00012\u0006\u0010l\u001a\u00020kH\u0002¢\u0006\u0006\bâ\u0001\u0010ã\u0001J2\u0010ä\u0001\u001a\u001b\u0012\u0004\u0012\u00020&\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020*\u0012\u0005\u0012\u00030\u0080\u0001020%2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0005\bä\u0001\u0010cJ2\u0010æ\u0001\u001a\u000f\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030\u0080\u00010%2\u0006\u0010\u001f\u001a\u00020\u001e2\t\b\u0002\u0010å\u0001\u001a\u00020*H\u0002¢\u0006\u0006\bæ\u0001\u0010ç\u0001J*\u0010è\u0001\u001a\u0005\u0018\u00010\u0080\u00012\u0006\u0010\u001f\u001a\u00020\u001e2\u000b\b\u0002\u0010å\u0001\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0006\bè\u0001\u0010é\u0001J&\u0010ê\u0001\u001a\u0017\u0012\u0004\u0012\u00020&\u0012\r\u0012\u000b\u0012\u0005\u0012\u00030³\u0001\u0018\u00010/0%H\u0002¢\u0006\u0005\bê\u0001\u0010EJ5\u0010ì\u0001\u001a\u001b\u0012\u0004\u0012\u00020&\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020*\u0012\u0005\u0012\u00030ë\u0001020%2\b\u0010\u0092\u0001\u001a\u00030\u0098\u0001H\u0002¢\u0006\u0006\bì\u0001\u0010\u009d\u0001J5\u0010í\u0001\u001a\u001b\u0012\u0004\u0012\u00020&\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020*\u0012\u0005\u0012\u00030\u0080\u0001020%2\b\u0010\u0092\u0001\u001a\u00030\u0098\u0001H\u0002¢\u0006\u0006\bí\u0001\u0010\u009d\u0001J/\u0010î\u0001\u001a\u000f\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030\u0080\u00010%2\u0006\u00109\u001a\u0002082\u0006\u0010I\u001a\u00020*H\u0002¢\u0006\u0006\bî\u0001\u0010·\u0001J6\u0010ï\u0001\u001a\u001c\u0012\u0004\u0012\u00020&\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020*\u0012\u0006\u0012\u0004\u0018\u00010*020%2\b\u0010\u0092\u0001\u001a\u00030\u0098\u0001H\u0002¢\u0006\u0006\bï\u0001\u0010\u009d\u0001J(\u0010ð\u0001\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\b\u0010\u0092\u0001\u001a\u00030\u0098\u0001H\u0002¢\u0006\u0006\bð\u0001\u0010\u009d\u0001J\u001b\u0010ñ\u0001\u001a\u00020A2\u0007\u00109\u001a\u00030\u0098\u0001H\u0002¢\u0006\u0006\bñ\u0001\u0010ò\u0001J(\u0010ó\u0001\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020*0%2\b\u0010\u0087\u0001\u001a\u00030\u0080\u0001H\u0002¢\u0006\u0006\bó\u0001\u0010ô\u0001J<\u0010÷\u0001\u001a\u00020'2\b\u0010Ï\u0001\u001a\u00030Â\u00012\b\u0010Þ\u0001\u001a\u00030Ý\u00012\n\u0010õ\u0001\u001a\u0005\u0018\u00010\u0080\u00012\b\u0010ö\u0001\u001a\u00030\u0080\u0001H\u0002¢\u0006\u0006\b÷\u0001\u0010ø\u0001J\\\u0010ý\u0001\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\t\b\u0002\u0010ù\u0001\u001a\u00020A2\u0006\u0010\u001f\u001a\u00020\u001e2)\u0010ü\u0001\u001a$\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020&0û\u0001\u0012\u0005\u0012\u00030Â\u0001\u0012\u0005\u0012\u00030É\u0001\u0012\u0004\u0012\u00020'0ú\u0001H\u0002¢\u0006\u0006\bý\u0001\u0010þ\u0001J^\u0010ÿ\u0001\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\t\b\u0002\u0010ù\u0001\u001a\u00020A2\b\u0010¹\u0001\u001a\u00030¸\u00012)\u0010ü\u0001\u001a$\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020&0û\u0001\u0012\u0005\u0012\u00030Â\u0001\u0012\u0005\u0012\u00030É\u0001\u0012\u0004\u0012\u00020'0ú\u0001H\u0002¢\u0006\u0006\bÿ\u0001\u0010\u0080\u0002J+\u0010\u0081\u0002\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020r0/0%2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0005\b\u0081\u0002\u0010cJ.\u0010\u0082\u0002\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020r0/0%2\b\u0010¹\u0001\u001a\u00030¸\u0001H\u0002¢\u0006\u0006\b\u0082\u0002\u0010»\u0001J&\u0010\u0084\u0002\u001a\u000f\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030\u0083\u00020%2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0005\b\u0084\u0002\u0010cJ)\u0010\u0085\u0002\u001a\u000f\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030\u0083\u00020%2\b\u0010¹\u0001\u001a\u00030¸\u0001H\u0002¢\u0006\u0006\b\u0085\u0002\u0010»\u0001J&\u0010\u0086\u0002\u001a\u000f\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030\u0083\u00020%2\u0006\u0010s\u001a\u00020rH\u0002¢\u0006\u0005\b\u0086\u0002\u0010uJ'\u0010\u0088\u0002\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0007\u0010\u0087\u0002\u001a\u00020*H\u0002¢\u0006\u0006\b\u0088\u0002\u0010\u0089\u0002J%\u0010\u008a\u0002\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010s\u001a\u00020rH\u0002¢\u0006\u0005\b\u008a\u0002\u0010uJ$\u0010\u008b\u0002\u001a\u0015\u0012\u0004\u0012\u00020&\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0083\u00020/0%H\u0002¢\u0006\u0005\b\u008b\u0002\u0010EJ#\u0010\u008c\u0002\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020r0/0%H\u0002¢\u0006\u0005\b\u008c\u0002\u0010EJ+\u0010\u008d\u0002\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020r0/0%2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0005\b\u008d\u0002\u0010cJ.\u0010\u008e\u0002\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020r0/0%2\b\u0010¹\u0001\u001a\u00030¸\u0001H\u0002¢\u0006\u0006\b\u008e\u0002\u0010»\u0001J%\u0010\u008f\u0002\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020r0%2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0005\b\u008f\u0002\u0010cJ(\u0010\u0090\u0002\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020r0%2\b\u0010¹\u0001\u001a\u00030¸\u0001H\u0002¢\u0006\u0006\b\u0090\u0002\u0010»\u0001J(\u0010\u0092\u0002\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020r0%2\b\u0010\u0091\u0002\u001a\u00030\u0083\u0002H\u0002¢\u0006\u0006\b\u0092\u0002\u0010\u0093\u0002J4\u0010\u0095\u0002\u001a\u000f\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030\u0083\u00020%2\u0006\u0010\u001f\u001a\u00020\u001e2\u000b\b\u0002\u0010\u0094\u0002\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0006\b\u0095\u0002\u0010\u0096\u0002J7\u0010\u0098\u0002\u001a\u000f\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030\u0083\u00020%2\b\u0010¹\u0001\u001a\u00030¸\u00012\f\b\u0002\u0010\u0097\u0002\u001a\u0005\u0018\u00010¸\u0001H\u0002¢\u0006\u0006\b\u0098\u0002\u0010\u0099\u0002J6\u0010\u009a\u0002\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\b\u0010¹\u0001\u001a\u00030¸\u00012\f\b\u0002\u0010\u0097\u0002\u001a\u0005\u0018\u00010¸\u0001H\u0002¢\u0006\u0006\b\u009a\u0002\u0010\u0099\u0002J%\u0010\u009b\u0002\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010s\u001a\u00020rH\u0002¢\u0006\u0005\b\u009b\u0002\u0010uJ\u001d\u0010\u009c\u0002\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%H\u0002¢\u0006\u0005\b\u009c\u0002\u0010EJ\u001e\u0010\u009e\u0002\u001a\u000f\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030\u009d\u00020%H\u0002¢\u0006\u0005\b\u009e\u0002\u0010EJ\u001c\u0010 \u0002\u001a\u00030Â\u00012\u0007\u0010\u009f\u0002\u001a\u00020rH\u0002¢\u0006\u0006\b \u0002\u0010¡\u0002J\u001c\u0010¢\u0002\u001a\u00030Ý\u00012\u0007\u0010\u009f\u0002\u001a\u00020rH\u0002¢\u0006\u0006\b¢\u0002\u0010£\u0002J&\u0010¤\u0002\u001a\u000f\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030Â\u00010%2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0005\b¤\u0002\u0010cJ)\u0010¥\u0002\u001a\u000f\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030Â\u00010%2\b\u0010¹\u0001\u001a\u00030¸\u0001H\u0002¢\u0006\u0006\b¥\u0002\u0010»\u0001J'\u0010§\u0002\u001a\u000f\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030Â\u00010%2\u0007\u0010¦\u0002\u001a\u00020rH\u0002¢\u0006\u0005\b§\u0002\u0010uJ&\u0010¨\u0002\u001a\u000f\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030Ý\u00010%2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0005\b¨\u0002\u0010cJ)\u0010ª\u0002\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020r0%2\t\b\u0002\u0010©\u0002\u001a\u00020AH\u0002¢\u0006\u0006\bª\u0002\u0010«\u0002R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b6\u0010¬\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u00ad\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010®\u0002R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b~\u0010¯\u0002R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010°\u0002R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010±\u0002R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bB\u0010²\u0002R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010³\u0002R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b0\u0010´\u0002R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010µ\u0002R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010¶\u0002R\u0016\u0010·\u0002\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bj\u0010\u00ad\u0002R\u0018\u0010º\u0002\u001a\u00030¸\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010¹\u0002R\u0017\u0010»\u0002\u001a\u00030¸\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bb\u0010¹\u0002R\u001e\u0010¾\u0002\u001a\n\u0012\u0005\u0012\u00030¦\u00010¼\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b_\u0010½\u0002¨\u0006¿\u0002"}, d2 = {"Lnd4/k;", "Lp34/a;", "Liy/e0;", "signedDataDecoder", "Lay/j;", "jsonSerializer", "Liy/c;", "bytesConverter", "Liy/a;", "base64Coder", "Lg34/c;", "identityManager", "Lpl/gov/coi/mobywatel/feature/legacy/storage/l;", "serviceToContainerIdMapper", "Lpx/d;", "remoteLogger", "Liy/v;", "pkcs12Manager", "Lyi2/a;", "legacyExceptionParser", "Lvm3/a;", "vehicleCategoryMapper", "Lez/c;", "dateConverter", "Lay/h;", "jsonFactory", "Lpl/gov/coi/common/network/deserializer/NullableTypeAdapterFactory;", "nullableTypeAdapterFactory", "<init>", "(Liy/e0;Lay/j;Liy/c;Liy/a;Lg34/c;Lpl/gov/coi/mobywatel/feature/legacy/storage/l;Lpx/d;Liy/v;Lyi2/a;Lvm3/a;Lez/c;Lay/h;Lpl/gov/coi/common/network/deserializer/NullableTypeAdapterFactory;)V", "Lrq0/b;", "documentType", "Liy/b0;", "peselTicket", "Liy/a0;", "certPkcs12", "password", "Ldx/i;", "Ldx/b;", "Loq/i0;", ip.a.f96138c, "(Lrq0/b;Liy/b0;Liy/a0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "", "dataScope", "x", "(Ljava/lang/String;Lrq0/b;Ltq/e;)Ljava/lang/Object;", "document", "", "i", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "", "t", "(Ltq/e;)Ljava/lang/Object;", "Lk34/f0;", "a", "Lgr0/r;", "Lrq0/b$b;", "dynamicDocumentType", "Lk34/j;", "saveMode", "E", "(Lgr0/r;Lrq0/b$b;Lk34/j;Ltq/e;)Ljava/lang/Object;", "documentData", "V", "(Ljava/lang/String;Lrq0/b;Lk34/j;Ltq/e;)Ljava/lang/Object;", "", "g", "Lk34/p;", "Q", "()Ldx/i;", "Ljr0/j;", "y", "U", "documentIID", "Ll34/a;", "v", "(Lrq0/b$b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Z", "(Lrq0/b$b;Ltq/e;)Ljava/lang/Object;", "I", "Lk34/x;", "p", "Lk34/c0;", "X", "Lk34/b;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "scopeData", "clearAlreadySaved", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Ljava/lang/String;ZLtq/e;)Ljava/lang/Object;", "a0", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "z", "W", "documentId", "o", "(Lrq0/b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lk34/k0;", "n", "(Lrq0/b;)Ldx/i;", "Ler0/c;", "statuses", "r", "(Ljava/util/List;Lrq0/b;Ltq/e;)Ljava/lang/Object;", ip.a.f96137b, "Ljr0/o;", "l", "Lk34/a0;", "scope", "documentPredicate", "T", "(Lk34/a0;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lk34/r;", "c0", "", "bundleId", "R", "(I)Ldx/i;", "documentIid", "Ler0/h;", "G", "Lk34/z;", "b0", "Lk34/e;", "B", "packageData", "d", "(Ljava/lang/String;Liy/b0;Ltq/e;)Ljava/lang/Object;", "", "passportsData", "f", "([BLtq/e;)Ljava/lang/Object;", "u", "processId", "m", "data", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Ljava/lang/String;[BLtq/e;)Ljava/lang/Object;", "b", "q", "d0", "documents", "s", "(Ljava/util/List;Lrq0/b;Lk34/j;)Ldx/i;", "Lhr0/a;", "multiDocumentSchema", "dynamicMultiDocumentType", "A", "(Lhr0/a;Lrq0/b;)Ldx/i;", "Y", "(Lrq0/b;Ljava/util/List;Lk34/j;Ltq/e;)Ljava/lang/Object;", "M", "Lrq0/b$c;", "C", "(Lrq0/b$c;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lm34/a;", "J", "(Lrq0/b$c;)Ldx/i;", "Lk34/g0;", "O", "Lo34/c;", "F", "h", "N", "j", "Lmu/g;", "Lk34/i;", "w", "()Lmu/g;", "documentContainerChanged", "K", "(Lk34/i;Ltq/e;)Ljava/lang/Object;", "k", "kotlin.jvm.PlatformType", "e", "c", "w1", "type", "q1", "Lpl/gov/coi/mobywatel/be/offlinedocumentsservice/data/model/DynamicDocumentSchemaContainerDto;", "F0", "dataKey", "B0", "(Lrq0/b$b;Ljava/lang/String;)Ldx/i;", "Laj2/a;", "service", "D0", "(Laj2/a;)Ldx/i;", "c1", "(Lk34/a0;Ltq/e;)Ljava/lang/Object;", "subtype", "s1", "category", "r1", "Lbj2/c;", "containerUser", "d1", "(Ljava/lang/String;Lbj2/c;)Ldx/i;", "familyCards", "m1", "(Ljava/util/Map;Ltq/e;)Ljava/lang/Object;", "Lk34/h;", "documentCertsSet", "Lorg/bouncycastle/cms/CMSSignedData;", "y0", "(Ldx/i;Lk34/h;)Ldx/i;", "z0", "userContainer", "userJSON", "Q1", "(Lbj2/c;Ljava/lang/String;)V", "packageByte", "A0", "([BLjava/lang/String;)Ljava/lang/String;", "decryptedData", "serviceId", "y1", "(ILjava/lang/String;Laj2/a;)Z", "response", "E0", "([BLjava/lang/String;)[B", "Lbj2/b;", "passContainer", "userData", "B1", "(Lbj2/c;Lbj2/b;Ljava/lang/String;)Ldx/i;", "u1", "(Lk34/a0;)Laj2/a;", "T0", "alternativeKey", "U0", "(Lrq0/b;Ljava/lang/String;)Ldx/i;", "W0", "(Lrq0/b;Ljava/lang/String;)[B", "G0", "Lm34/b;", "g1", "p1", "e1", "f1", "C0", "x1", "(Lrq0/b$c;)Z", "x0", "([B)Ldx/i;", "pkcs12", "newPass", "w0", "(Lbj2/c;Lbj2/b;[B[B)V", "forceCreateNewContainer", "Lkotlin/Function3;", "Lex/b;", "saveData", "J1", "(ZLrq0/b;Ler/q;)Ldx/i;", "I1", "(ZLaj2/a;Ler/q;)Ldx/i;", "R0", "Q0", "Lcj2/a;", "N0", "M0", "L0", "fileName", "F1", "(Ljava/lang/String;)Ldx/i;", "C1", "H0", "I0", "K0", "J0", "P0", "O0", "bundleDescription", "v1", "(Lcj2/a;)Ldx/i;", "forcedParentDocumentType", "i1", "(Lrq0/b;Lrq0/b;)Ldx/i;", "forcedParentService", "h1", "(Laj2/a;Laj2/a;)Ldx/i;", "z1", "S1", "G1", "Lcj2/b;", "S0", "activeServiceId", "l1", "(I)Lbj2/c;", "k1", "(I)Lbj2/b;", "b1", "a1", "containerUserBundleId", "Z0", "Y0", "withValidCert", "n1", "(Z)Ldx/i;", "Liy/e0;", "Lay/j;", "Liy/c;", "Liy/a;", "Lg34/c;", "Lpl/gov/coi/mobywatel/feature/legacy/storage/l;", "Lpx/d;", "Liy/v;", "Lyi2/a;", "Lvm3/a;", "Lez/c;", "jsonWithNullCheck", "Lsu/a;", "Lsu/a;", "colisionDraftMutex", "childPassportApplicationDraftMutex", "Lmu/a0;", "Lmu/a0;", "documentContainerChangedResult", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements p34.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.e0 signedDataDecoder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ay.j jsonSerializer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.c bytesConverter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g34.c identityManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final pl.gov.coi.mobywatel.feature.legacy.storage.l serviceToContainerIdMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final iy.v pkcs12Manager;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final yi2.a legacyExceptionParser;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final vm3.a vehicleCategoryMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ay.j jsonWithNullCheck;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final su.a colisionDraftMutex = su.g.b(false, 1, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final su.a childPassportApplicationDraftMutex = su.g.b(false, 1, null);

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final mu.a0<k34.i> documentContainerChangedResult = h0.b(0, 0, null, 7, null);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f134449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f134450b;

        static {
            int[] iArr = new int[wn3.a.values().length];
            try {
                iArr[wn3.a.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wn3.a.TEMPORARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f134449a = iArr;
            int[] iArr2 = new int[aj2.a.values().length];
            try {
                iArr2[aj2.a.TOZSAMOSC.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[aj2.a.STUDENT_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f134450b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f134451d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134452e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f134453f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f134454g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f134455h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f134457k;

        a0(tq.e<? super a0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f134455h = obj;
            this.f134457k |= PKIFailureInfo.systemUnavail;
            return k.this.k(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {
        int A;
        int B;
        int C;
        int D;
        int E;
        /* synthetic */ Object F;
        int H;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f134458d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134459e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f134460f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f134461g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f134462h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f134463j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f134464k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f134465l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f134466m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f134467n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f134468p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f134469q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f134470r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f134471s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f134472t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f134473v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f134474w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f134475x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f134476y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f134477z;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.F = obj;
            this.H |= PKIFailureInfo.systemUnavail;
            return k.this.d(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b0 extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b, ? extends i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134478e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ byte[] f134480g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(byte[] bArr, tq.e<? super b0> eVar) {
            super(2, eVar);
            this.f134480g = bArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(byte[] bArr, ex.b bVar, bj2.c cVar, DocumentCertsSet documentCertsSet) {
            cVar.G(bArr);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f134478e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            k kVar = k.this;
            aj2.a aVar = aj2.a.CHILD_PASSPORT_APPLICATION;
            final byte[] bArr = this.f134480g;
            return k.K1(kVar, false, aVar, new er.q() { // from class: nd4.l
                @Override // er.q
                public final Object w(Object obj2, Object obj3, Object obj4) {
                    return k.b0.O(bArr, (ex.b) obj2, (bj2.c) obj3, (DocumentCertsSet) obj4);
                }
            }, 1, null);
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
            return ((b0) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return k.this.new b0(this.f134480g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f134481d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134482e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f134483f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f134484g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f134485h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f134486j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f134487k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f134488l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f134489m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f134490n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f134491p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f134492q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f134493r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f134494s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f134495t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f134497w;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f134495t = obj;
            this.f134497w |= PKIFailureInfo.systemUnavail;
            return k.this.o(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class c0 extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b, ? extends i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134498e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f134499f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f134500g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f134501h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f134502j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f134503k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f134505m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ byte[] f134506n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(String str, byte[] bArr, tq.e<? super c0> eVar) {
            super(2, eVar);
            this.f134505m = str;
            this.f134506n = bArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(String str, byte[] bArr, ex.b bVar, bj2.c cVar, DocumentCertsSet documentCertsSet) {
            cVar.j().put(str, bArr);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final String str;
            k kVar;
            su.a aVar;
            final byte[] bArr;
            Object objE = uq.b.e();
            int i15 = this.f134503k;
            if (i15 == 0) {
                oq.u.b(obj);
                su.a aVar2 = k.this.colisionDraftMutex;
                k kVar2 = k.this;
                str = this.f134505m;
                byte[] bArr2 = this.f134506n;
                this.f134498e = aVar2;
                this.f134499f = kVar2;
                this.f134500g = str;
                this.f134501h = bArr2;
                this.f134502j = 0;
                this.f134503k = 1;
                if (aVar2.h(null, this) == objE) {
                    return objE;
                }
                kVar = kVar2;
                aVar = aVar2;
                bArr = bArr2;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bArr = (byte[]) this.f134501h;
                str = (String) this.f134500g;
                k kVar3 = (k) this.f134499f;
                su.a aVar3 = (su.a) this.f134498e;
                oq.u.b(obj);
                aVar = aVar3;
                kVar = kVar3;
            }
            try {
                return k.K1(kVar, false, aj2.a.VEHICLE_COLLISION_DATA, new er.q() { // from class: nd4.m
                    @Override // er.q
                    public final Object w(Object obj2, Object obj3, Object obj4) {
                        return k.c0.O(str, bArr, (ex.b) obj2, (bj2.c) obj3, (DocumentCertsSet) obj4);
                    }
                }, 1, null);
            } finally {
                aVar.r(null);
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
            return ((c0) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return k.this.new c0(this.f134505m, this.f134506n, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014 \u0006*\t\u0018\u00010\u0004¢\u0006\u0002\b\u00050\u0004¢\u0006\u0002\b\u00050\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "", "", "Lkotlin/jvm/internal/EnhancedNullability;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b, ? extends List<? extends String>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134507e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            uq.b.e();
            if (this.f134507e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            k kVar = k.this;
            dx.j<dx.b> jVarA = xw.c.f221622a.a();
            try {
                try {
                    try {
                        ex.a aVar = new ex.a();
                        HashMap<String, byte[]> mapJ = ((bj2.c) aVar.a(kVar.a1(aj2.a.VEHICLE_COLLISION_DATA))).j();
                        if (mapJ != null) {
                            return new dx.i.Right(pq.v.f1(mapJ.keySet()));
                        }
                        aVar.b(new dx.b.Generic(new Exception("draft no exist")));
                        throw new oq.g();
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, ? extends List<String>>> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return k.this.new d(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f134509d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134510e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f134511f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f134512g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f134513h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f134514j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f134515k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f134516l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f134518n;

        d0(tq.e<? super d0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f134516l = obj;
            this.f134518n |= PKIFailureInfo.systemUnavail;
            return k.this.E(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f134519d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134520e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f134521f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f134523h;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f134521f = obj;
            this.f134523h |= PKIFailureInfo.systemUnavail;
            return k.this.T(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class e0 extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b, ? extends i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134524e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ byte[] f134526g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(byte[] bArr, tq.e<? super e0> eVar) {
            super(2, eVar);
            this.f134526g = bArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(byte[] bArr, ex.b bVar, bj2.c cVar, DocumentCertsSet documentCertsSet) {
            cVar.O(bArr);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f134524e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            k kVar = k.this;
            aj2.a aVar = aj2.a.PASSPORTS_DATA;
            final byte[] bArr = this.f134526g;
            return k.K1(kVar, false, aVar, new er.q() { // from class: nd4.n
                @Override // er.q
                public final Object w(Object obj2, Object obj3, Object obj4) {
                    return k.e0.O(bArr, (ex.b) obj2, (bj2.c) obj3, (DocumentCertsSet) obj4);
                }
            }, 1, null);
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
            return ((e0) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return k.this.new e0(this.f134526g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b, ? extends byte[]>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134527e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f134528f;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            p0 p0Var = (p0) this.f134528f;
            uq.b.e();
            if (this.f134527e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i iVarA1 = k.this.a1(aj2.a.CHILD_PASSPORT_APPLICATION);
            if (!(iVarA1 instanceof dx.i.Left)) {
                if (!(iVarA1 instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                iVarA1 = new dx.i.Right(((bj2.c) ((dx.i.Right) iVarA1).b()).i());
            }
            k kVar = k.this;
            if (iVarA1 instanceof dx.i.Left) {
                px.b.y5(kVar.remoteLogger, "DocumentsRepository, ChildPassportApplication getting draft error", null, px.c.a(p0Var), 2, null);
            }
            return iVarA1;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar) {
            return ((f) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = k.this.new f(eVar);
            fVar.f134528f = obj;
            return fVar;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f134530d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134531e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f134532f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f134533g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f134534h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f134535j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f134536k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f134537l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f134538m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f134539n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f134540p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f134542r;

        f0(tq.e<? super f0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f134540p = obj;
            this.f134542r |= PKIFailureInfo.systemUnavail;
            return k.this.N(null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f134543d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134544e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f134545f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f134546g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f134547h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f134548j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f134549k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f134550l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f134551m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f134552n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f134554q;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f134552n = obj;
            this.f134554q |= PKIFailureInfo.systemUnavail;
            return k.this.m(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f134555d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f134557f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f134558g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f134559h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f134560j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f134561k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f134562l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f134563m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f134564n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f134565p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f134566q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f134568s;

        g0(tq.e<? super g0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f134566q = obj;
            this.f134568s |= PKIFailureInfo.systemUnavail;
            return k.this.r(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)[B"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<p0, tq.e<? super byte[]>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134569e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ex.b<dx.b> f134570f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ k f134571g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f134572h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(ex.b<? super dx.b> bVar, k kVar, String str, tq.e<? super h> eVar) {
            super(2, eVar);
            this.f134570f = bVar;
            this.f134571g = kVar;
            this.f134572h = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            byte[] bArr;
            uq.b.e();
            if (this.f134569e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            HashMap<String, byte[]> mapJ = ((bj2.c) this.f134570f.a(this.f134571g.a1(aj2.a.VEHICLE_COLLISION_DATA))).j();
            if (mapJ != null && (bArr = mapJ.get(this.f134572h)) != null) {
                return bArr;
            }
            this.f134570f.b(new dx.b.Generic(new Exception("draft no exist")));
            throw new oq.g();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super byte[]> eVar) {
            return ((h) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new h(this.f134570f, this.f134571g, this.f134572h, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f134573d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f134574e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f134576g;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f134574e = obj;
            this.f134576g |= PKIFailureInfo.systemUnavail;
            return k.this.i(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class j extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f134577d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134578e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f134579f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f134580g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f134581h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f134582j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f134583k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f134584l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f134585m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f134586n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f134587p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f134588q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f134590s;

        j(tq.e<? super j> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f134588q = obj;
            this.f134590s |= PKIFailureInfo.systemUnavail;
            return k.this.G(null, null, this);
        }
    }

    /* JADX INFO: renamed from: nd4.k$k, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Ldx/i$c;", "Ler0/h;", "<anonymous>", "(Lju/p0;)Ldx/i$c;"}, k = 3, mv = {2, 2, 0})
    static final class C3338k extends vq.k implements er.p<p0, tq.e<? super dx.i.Right<er0.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134591e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f134592f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ rq0.b f134594h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ ex.b<dx.b> f134595j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f134596k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C3338k(rq0.b bVar, ex.b<? super dx.b> bVar2, String str, tq.e<? super C3338k> eVar) {
            super(2, eVar);
            this.f134594h = bVar;
            this.f134595j = bVar2;
            this.f134596k = str;
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0178 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:102:? A[LOOP:3: B:37:0x00ab->B:102:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:30:0x008e  */
        /* JADX WARN: Code duplicated, block: B:36:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:39:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:70:0x0146  */
        /* JADX WARN: Code duplicated, block: B:76:0x015e  */
        /* JADX WARN: Code duplicated, block: B:79:0x0168  */
        /* JADX WARN: Code duplicated, block: B:88:0x0153 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:90:0x0140 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:92:0x0178 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:94:? A[LOOP:1: B:77:0x0162->B:94:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:96:0x009b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:98:0x0088 A[SYNTHETIC] */
        @Override // vq.a
        public final Object J(Object obj) throws Exception {
            cj2.a aVar;
            Set setKeySet;
            cj2.a aVar2;
            String str;
            ArrayList arrayList;
            Iterator it;
            String str2;
            ArrayList arrayList2;
            Iterator it4;
            Object objE = uq.b.e();
            int i15 = this.f134592f;
            if (i15 == 0) {
                oq.u.b(obj);
                k kVar = k.this;
                rq0.b bVar = this.f134594h;
                this.f134592f = 1;
                obj = kVar.g(bVar, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 != 1) {
                if (i15 == 2) {
                    aVar2 = (cj2.a) this.f134591e;
                    oq.u.b(obj);
                    str = this.f134596k;
                    arrayList = new ArrayList();
                    for (Object obj2 : (Iterable) obj) {
                        if (fr.t.c((String) obj2, str)) {
                            arrayList.add(obj2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (!aVar2.e((String) it.next()).booleanValue()) {
                                return new dx.i.Right(er0.h.INACTIVE);
                            }
                        }
                    }
                    return new dx.i.Right(er0.h.ACTIVE);
                }
                if (i15 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (cj2.a) this.f134591e;
                oq.u.b(obj);
                str2 = this.f134596k;
                arrayList2 = new ArrayList();
                for (Object obj3 : (Iterable) obj) {
                    if (fr.t.c((String) obj3, str2)) {
                        arrayList2.add(obj3);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        if (!aVar.e((String) it4.next()).booleanValue()) {
                            return new dx.i.Right(er0.h.INACTIVE);
                        }
                    }
                }
                return new dx.i.Right(er0.h.ACTIVE);
            }
            oq.u.b(obj);
            if (!((Boolean) obj).booleanValue()) {
                this.f134595j.b(new dx.b.Generic(new Exception("Document error: Document is not added")));
                throw new oq.g();
            }
            cj2.a aVar3 = (cj2.a) this.f134595j.a(k.this.N0(this.f134594h));
            if (aVar3.k()) {
                return new dx.i.Right(er0.h.INACTIVE);
            }
            rq0.b bVar2 = this.f134594h;
            if (bVar2 instanceof rq0.b.EnumC4479b) {
                k kVar2 = k.this;
                this.f134591e = aVar3;
                this.f134592f = 2;
                Object objI = kVar2.i(bVar2, this);
                if (objI != objE) {
                    aVar2 = aVar3;
                    obj = objI;
                    str = this.f134596k;
                    arrayList = new ArrayList();
                    while (r6.hasNext()) {
                        if (fr.t.c((String) obj2, str)) {
                            arrayList.add(obj2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (!aVar2.e((String) it.next()).booleanValue()) {
                                return new dx.i.Right(er0.h.INACTIVE);
                            }
                        }
                    }
                    return new dx.i.Right(er0.h.ACTIVE);
                }
            } else {
                if (bVar2 instanceof rq0.b.c) {
                    Map map = (Map) k.this.g1((rq0.b.c) bVar2).a();
                    if (map != null && (setKeySet = map.keySet()) != null) {
                        String str3 = this.f134596k;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj4 : setKeySet) {
                            if (fr.t.c((String) obj4, str3)) {
                                arrayList3.add(obj4);
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            Iterator it5 = arrayList3.iterator();
                            while (it5.hasNext()) {
                                if (!aVar3.e((String) it5.next()).booleanValue()) {
                                }
                            }
                        }
                        return new dx.i.Right(er0.h.ACTIVE);
                    }
                    return new dx.i.Right(er0.h.INACTIVE);
                }
                k kVar3 = k.this;
                this.f134591e = aVar3;
                this.f134592f = 3;
                Object objI2 = kVar3.i(bVar2, this);
                if (objI2 != objE) {
                    aVar = aVar3;
                    obj = objI2;
                    str2 = this.f134596k;
                    arrayList2 = new ArrayList();
                    while (r6.hasNext()) {
                        if (fr.t.c((String) obj3, str2)) {
                            arrayList2.add(obj3);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            if (!aVar.e((String) it4.next()).booleanValue()) {
                                return new dx.i.Right(er0.h.INACTIVE);
                            }
                        }
                    }
                    return new dx.i.Right(er0.h.ACTIVE);
                }
            }
            return objE;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i.Right<er0.h>> eVar) {
            return ((C3338k) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return k.this.new C3338k(this.f134594h, this.f134595j, this.f134596k, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class l extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f134597d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134598e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f134599f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f134600g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f134601h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f134602j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f134603k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f134604l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f134605m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f134606n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f134607p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f134609r;

        l(tq.e<? super l> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f134607p = obj;
            this.f134609r |= PKIFailureInfo.systemUnavail;
            return k.this.c1(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class m extends vq.d {
        /* synthetic */ Object A;
        int C;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f134610d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134611e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f134612f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f134613g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f134614h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f134615j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f134616k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f134617l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f134618m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f134619n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f134620p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f134621q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f134622r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f134623s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f134624t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f134625v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f134626w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Object f134627x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        Object f134628y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        Object f134629z;

        m(tq.e<? super m> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.A = obj;
            this.C |= PKIFailureInfo.systemUnavail;
            return k.this.t(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class n extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f134630d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134631e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f134632f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f134633g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f134634h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f134635j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f134636k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f134637l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f134639n;

        n(tq.e<? super n> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f134637l = obj;
            this.f134639n |= PKIFailureInfo.systemUnavail;
            return k.this.m1(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class o extends vq.d {
        int A;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f134640d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134641e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f134642f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f134643g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f134644h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f134645j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f134646k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f134647l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f134648m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f134649n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f134650p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f134651q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f134652r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f134653s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f134654t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f134655v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f134656w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f134657x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        /* synthetic */ Object f134658y;

        o(tq.e<? super o> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f134658y = obj;
            this.A |= PKIFailureInfo.systemUnavail;
            return k.this.d0(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class p extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f134660d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f134662f;

        p(tq.e<? super p> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f134660d = obj;
            this.f134662f |= PKIFailureInfo.systemUnavail;
            return k.this.l(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class q extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f134663d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f134665f;

        q(tq.e<? super q> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f134663d = obj;
            this.f134665f |= PKIFailureInfo.systemUnavail;
            return k.this.a(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class r extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f134666d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134667e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f134668f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f134669g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f134670h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f134671j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f134672k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f134673l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f134674m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f134675n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f134676p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f134677q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f134678r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f134680t;

        r(tq.e<? super r> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f134678r = obj;
            this.f134680t |= PKIFailureInfo.systemUnavail;
            return k.this.r1(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class s extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f134681d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134682e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f134683f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f134684g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f134685h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f134686j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f134687k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f134688l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f134689m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f134691p;

        s(tq.e<? super s> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f134689m = obj;
            this.f134691p |= PKIFailureInfo.systemUnavail;
            return k.this.u(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)[B"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.p<p0, tq.e<? super byte[]>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134692e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ex.b<dx.b> f134693f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ k f134694g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        t(ex.b<? super dx.b> bVar, k kVar, tq.e<? super t> eVar) {
            super(2, eVar);
            this.f134693f = bVar;
            this.f134694g = kVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f134692e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return ((bj2.c) this.f134693f.a(this.f134694g.a1(aj2.a.PASSPORTS_DATA))).s();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super byte[]> eVar) {
            return ((t) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new t(this.f134693f, this.f134694g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class u extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f134695d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134696e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f134697f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f134698g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f134699h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f134700j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f134701k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f134702l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f134703m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f134704n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f134705p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f134706q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f134707r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f134708s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f134710v;

        u(tq.e<? super u> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f134708s = obj;
            this.f134710v |= PKIFailureInfo.systemUnavail;
            return k.this.s1(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class v extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f134711d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134712e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f134713f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f134714g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f134716j;

        v(tq.e<? super v> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f134714g = obj;
            this.f134716j |= PKIFailureInfo.systemUnavail;
            return k.this.w1(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "", "Lrq0/b;", "<anonymous>", "(Lju/p0;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.p<p0, tq.e<? super List<? extends rq0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134717e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f134718f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f134719g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f134720h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f134721j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f134722k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f134723l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f134724m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f134725n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f134726p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f134727q;

        w(tq.e<? super w> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0059  */
        /* JADX WARN: Code duplicated, block: B:13:0x0088 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x0091  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0086 -> B:14:0x0089). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r12.f134727q
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L36
                if (r1 != r2) goto L2e
                int r1 = r12.f134725n
                int r4 = r12.f134724m
                java.lang.Object r5 = r12.f134723l
                rq0.b r5 = (rq0.b) r5
                java.lang.Object r5 = r12.f134722k
                java.lang.Object r6 = r12.f134721j
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r7 = r12.f134720h
                java.util.Collection r7 = (java.util.Collection) r7
                java.lang.Object r8 = r12.f134719g
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.lang.Object r9 = r12.f134718f
                nd4.k r9 = (nd4.k) r9
                java.lang.Object r10 = r12.f134717e
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                oq.u.b(r13)
                goto L89
            L2e:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L36:
                oq.u.b(r13)
                rq0.b$a r13 = rq0.b.INSTANCE
                java.util.List r13 = r13.b()
                java.lang.Iterable r13 = (java.lang.Iterable) r13
                nd4.k r1 = nd4.k.this
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r5 = r13.iterator()
                r8 = r13
                r10 = r8
                r9 = r1
                r1 = r3
                r7 = r4
                r6 = r5
                r4 = r1
            L53:
                boolean r13 = r6.hasNext()
                if (r13 == 0) goto L95
                java.lang.Object r5 = r6.next()
                r13 = r5
                rq0.b r13 = (rq0.b) r13
                java.lang.Object r11 = vq.j.a(r10)
                r12.f134717e = r11
                r12.f134718f = r9
                java.lang.Object r11 = vq.j.a(r8)
                r12.f134719g = r11
                r12.f134720h = r7
                r12.f134721j = r6
                r12.f134722k = r5
                java.lang.Object r11 = vq.j.a(r13)
                r12.f134723l = r11
                r12.f134724m = r4
                r12.f134725n = r1
                r12.f134726p = r3
                r12.f134727q = r2
                java.lang.Object r13 = r9.g(r13, r12)
                if (r13 != r0) goto L89
                return r0
            L89:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto L53
                r7.add(r5)
                goto L53
            L95:
                java.util.List r7 = (java.util.List) r7
                boolean r13 = r7.isEmpty()
                if (r13 == 0) goto Laa
                nd4.k r13 = nd4.k.this
                px.d r13 = nd4.k.t0(r13)
                java.lang.String r0 = "No added documents"
                px.d$a r1 = px.d.a.GENERAL
                r13.F8(r0, r1)
            Laa:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: nd4.k.w.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super List<? extends rq0.b>> eVar) {
            return ((w) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return k.this.new w(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class x extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f134729d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134730e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f134731f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f134733h;

        x(tq.e<? super x> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f134731f = obj;
            this.f134733h |= PKIFailureInfo.systemUnavail;
            return k.this.c(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class y extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f134734d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134735e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f134736f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f134737g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f134739j;

        y(tq.e<? super y> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f134737g = obj;
            this.f134739j |= PKIFailureInfo.systemUnavail;
            return k.this.q(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class z extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f134740d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134741e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f134742f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f134743g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f134744h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f134745j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f134746k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f134747l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f134748m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f134749n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f134750p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f134751q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f134752r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f134753s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f134754t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f134755v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f134757x;

        z(tq.e<? super z> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f134755v = obj;
            this.f134757x |= PKIFailureInfo.systemUnavail;
            return k.this.D(null, null, null, null, this);
        }
    }

    public k(iy.e0 e0Var, ay.j jVar, iy.c cVar, iy.a aVar, g34.c cVar2, pl.gov.coi.mobywatel.feature.legacy.storage.l lVar, px.d dVar, iy.v vVar, yi2.a aVar2, vm3.a aVar3, ez.c cVar3, ay.h hVar, NullableTypeAdapterFactory nullableTypeAdapterFactory) {
        this.signedDataDecoder = e0Var;
        this.jsonSerializer = jVar;
        this.bytesConverter = cVar;
        this.base64Coder = aVar;
        this.identityManager = cVar2;
        this.serviceToContainerIdMapper = lVar;
        this.remoteLogger = dVar;
        this.pkcs12Manager = vVar;
        this.legacyExceptionParser = aVar2;
        this.vehicleCategoryMapper = aVar3;
        this.dateConverter = cVar3;
        this.jsonWithNullCheck = hVar.a(nullableTypeAdapterFactory);
    }

    private final String A0(byte[] packageByte, String password) throws uh2.a {
        try {
            return new String(E0(packageByte, password), StandardCharsets.UTF_8);
        } catch (ii2.e unused) {
            throw new uh2.a(uh2.b.SCHOOL_CARD_PASSWORD_WRONG);
        }
    }

    static /* synthetic */ dx.i A1(k kVar, aj2.a aVar, aj2.a aVar2, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            aVar2 = null;
        }
        return kVar.z1(aVar, aVar2);
    }

    private final dx.i<dx.b, i0> B0(rq0.b.EnumC4479b dynamicDocumentType, String dataKey) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    bj2.c cVar = (bj2.c) new ex.a().a(b1(dynamicDocumentType));
                    cVar.m().remove(dataKey);
                    cVar.k().remove(dataKey);
                    cVar.c();
                    if (cVar.m().isEmpty()) {
                        D0(pl.gov.coi.mobywatel.feature.legacy.storage.n.a(dynamicDocumentType));
                    }
                    return new dx.i.Right(i0.f148189a);
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

    private final dx.i<dx.b, i0> B1(bj2.c userContainer, bj2.b passContainer, String userData) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    sh2.c.a aVarB = sh2.c.b(userData);
                    byte[] bArr = (byte[]) aVar.a(iy.a.c(this.base64Coder, aVarB.a("pkcs12Pass"), null, 2, null));
                    byte[] bArr2 = (byte[]) aVar.a(iy.a.c(this.base64Coder, aVarB.a("pkcs12Data"), null, 2, null));
                    byte[] bArrA = li2.a.a(16);
                    w0(userContainer, passContainer, sh2.a.g().b(bArr2, bArr, bArrA), bArrA);
                    return new dx.i.Right(i0.f148189a);
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

    private final dx.i<dx.b, i0> C0(rq0.b.c dynamicMultiDocumentType) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    bj2.c cVar = (bj2.c) new ex.a().a(b1(dynamicMultiDocumentType));
                    cVar.n().remove(dynamicMultiDocumentType.getReferenceName());
                    cVar.m().remove(dynamicMultiDocumentType.getReferenceName());
                    cVar.k().remove(dynamicMultiDocumentType.getReferenceName());
                    cVar.c();
                    if (cVar.n().isEmpty()) {
                        D0(pl.gov.coi.mobywatel.feature.legacy.storage.n.a(dynamicMultiDocumentType));
                    }
                    return new dx.i.Right(i0.f148189a);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
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
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private final dx.i<dx.b, i0> C1(int bundleId) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    ContainerManagerNew.u().i(bundleId);
                    return new dx.i.Right(i0.f148189a);
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

    private final dx.i<dx.b, i0> D0(aj2.a service) {
        Object objB;
        Object objB2;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    cj2.a aVarA = M0(service).a();
                    if (aVarA != null) {
                        aj2.a.Companion companion = aj2.a.INSTANCE;
                        dx.i<dx.b, List<Integer>> iVarQ0 = Q0(service);
                        if (iVarQ0 instanceof dx.i.Left) {
                            objB2 = pq.v.n();
                        } else {
                            if (!(iVarQ0 instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB2 = ((dx.i.Right) iVarQ0).b();
                        }
                        List<aj2.a> listB = companion.b((List) objB2);
                        px.f.f163100a.b("DocumentsRepository legacy, removing " + service + " with linked services: " + listB, new ArrayList());
                        if (!listB.isEmpty()) {
                            Iterator<aj2.a> it = listB.iterator();
                            while (it.hasNext()) {
                                D0(it.next());
                            }
                        }
                        HashSet<String> hashSetC = aVarA.c();
                        px.f.f163100a.b("DocumentsRepository legacy, removing " + hashSetC.size() + " files from FileStorage for service: " + service, new ArrayList());
                        Iterator<String> it4 = hashSetC.iterator();
                        while (it4.hasNext()) {
                            F1(it4.next());
                        }
                    }
                    Iterator it5 = ((Iterable) aVar.a(J0(service))).iterator();
                    while (it5.hasNext()) {
                        C1(((Number) it5.next()).intValue());
                    }
                    return new dx.i.Right(i0.f148189a);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
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
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D1(ex.b bVar, bj2.c cVar, DocumentCertsSet documentCertsSet) {
        cVar.G(null);
        return i0.f148189a;
    }

    private final byte[] E0(byte[] response, String password) {
        return fi2.a.b(response, fi2.a.e(password.toCharArray(), nd4.o.f134762a, nd4.o.f134762a, nd4.o.f134762a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E1(String str, ex.b bVar, bj2.c cVar, DocumentCertsSet documentCertsSet) {
        cVar.j().remove(str);
        return i0.f148189a;
    }

    private final dx.i<dx.b, List<DynamicDocumentSchemaContainerDto>> F0() {
        Object objB;
        Collection<byte[]> collectionValues;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    ArrayList arrayList = null;
                    try {
                        HashMap<String, byte[]> mapM = ((bj2.c) aVar.a(b1(rq0.b.EnumC4479b.DEFAULT))).m();
                        if (mapM != null && (collectionValues = mapM.values()) != null) {
                            Collection<byte[]> collection = collectionValues;
                            ArrayList arrayList2 = new ArrayList(pq.v.y(collection, 10));
                            Iterator<T> it = collection.iterator();
                            while (it.hasNext()) {
                                arrayList2.add((DynamicDocumentSchemaContainerDto) this.jsonWithNullCheck.a(new String((byte[]) aVar.a(iy.a.a(this.base64Coder, (byte[]) it.next(), null, 2, null)), fu.d.UTF_8), q0.n(DynamicDocumentSchemaContainerDto.class)));
                            }
                            arrayList = arrayList2;
                        }
                        return new dx.i.Right(arrayList);
                    } catch (Exception e15) {
                        if (e15 instanceof CancellationException) {
                            throw e15;
                        }
                        if (e15 instanceof com.google.gson.p) {
                            aVar.b(new dx.b.Parsing(e15));
                            throw new oq.g();
                        }
                        aVar.b(new dx.b.Generic(null, 1, null));
                        throw new oq.g();
                    }
                } catch (CancellationException e16) {
                    throw e16;
                }
            } catch (ex.c e17) {
                return new dx.i.Left((dx.b) ex.d.a(e17));
            } catch (CancellationException e18) {
                throw e18;
            }
        } catch (Exception e19) {
            px.f fVar = px.f.f163100a;
            String message = e19.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e19, px.c.a(jVarA));
            Object objA = jVarA.a(e19);
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

    private final dx.i<dx.b, i0> F1(String fileName) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    ContainerManagerNew.u().h(fileName);
                    return new dx.i.Right(i0.f148189a);
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

    private final dx.i<dx.b, List<DynamicDocumentSchemaContainerDto>> G0() {
        Object objB;
        Collection<byte[]> collectionValues;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    ArrayList arrayList = null;
                    try {
                        HashMap<String, byte[]> mapM = ((bj2.c) aVar.a(b1(rq0.b.c.DEFAULT))).m();
                        if (mapM != null && (collectionValues = mapM.values()) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<T> it = collectionValues.iterator();
                            while (it.hasNext()) {
                                pq.v.D(arrayList2, ((DynamicDocumentSchemaListContainerDto) this.jsonWithNullCheck.a(new String((byte[]) aVar.a(iy.a.a(this.base64Coder, (byte[]) it.next(), null, 2, null)), fu.d.UTF_8), q0.n(DynamicDocumentSchemaListContainerDto.class))).getSchemas());
                            }
                            arrayList = arrayList2;
                        }
                        return new dx.i.Right(arrayList);
                    } catch (Exception e15) {
                        if (e15 instanceof CancellationException) {
                            throw e15;
                        }
                        if (e15 instanceof com.google.gson.p) {
                            aVar.b(new dx.b.Parsing(e15));
                            throw new oq.g();
                        }
                        aVar.b(new dx.b.Generic(null, 1, null));
                        throw new oq.g();
                    }
                } catch (CancellationException e16) {
                    throw e16;
                }
            } catch (ex.c e17) {
                return new dx.i.Left((dx.b) ex.d.a(e17));
            } catch (CancellationException e18) {
                throw e18;
            }
        } catch (Exception e19) {
            px.f fVar = px.f.f163100a;
            String message = e19.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e19, px.c.a(jVarA));
            Object objA = jVarA.a(e19);
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

    private final dx.i<dx.b, i0> G1() {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ((cj2.b) new ex.a().a(S0())).c();
                    return new dx.i.Right(i0.f148189a);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
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
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private final dx.i<dx.b, List<cj2.a>> H0() {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    return new dx.i.Right(((cj2.b) new ex.a().a(S0())).g());
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
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
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final i0 H1(k34.j jVar, rq0.b bVar, k kVar, String str, ex.b bVar2, bj2.c cVar, DocumentCertsSet documentCertsSet) throws Exception {
        String str2;
        HashMap<String, byte[]> mapK = cVar.k();
        if (jVar instanceof k34.j.a) {
            mapK.put(bVar.getReferenceName(), ((CMSSignedData) bVar2.a(kVar.z0(iy.a.c(kVar.base64Coder, str, null, 2, null), documentCertsSet))).getEncoded());
        } else if (jVar instanceof k34.j.AsyncById) {
            mapK.put(((k34.j.AsyncById) jVar).getDocumentIID(), kVar.jsonSerializer.b(new DocumentByIdContainerDto(bVar.getReferenceName(), iy.a.e(kVar.base64Coder, ((CMSSignedData) bVar2.a(kVar.z0(iy.a.c(kVar.base64Coder, str, null, 2, null), documentCertsSet))).getEncoded(), null, 2, null)), q0.n(DocumentByIdContainerDto.class)).getBytes(fu.d.UTF_8));
        } else if (jVar instanceof k34.j.d) {
            Map map = (Map) bVar2.a(kVar.y0(iy.a.c(kVar.base64Coder, str, null, 2, null), documentCertsSet));
            if (map.isEmpty()) {
                bVar2.b(new dx.b.Generic(new Exception("Failed to save document: Document data map is empty")));
                throw new oq.g();
            }
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                CMSSignedData cMSSignedData = (CMSSignedData) entry.getValue();
                switch (str3.hashCode()) {
                    case -1869673657:
                        if (!str3.equals("DEPUTY_SCOPE_ZERO")) {
                            throw new Exception("Wrong DocumentDataSaveMode");
                        }
                        str2 = "DeputyData_Scope_Zero";
                        break;
                        break;
                    case -1411570905:
                        if (!str3.equals("ADVOCATE_SCOPE_ZERO")) {
                            throw new Exception("Wrong DocumentDataSaveMode");
                        }
                        str2 = "AdvocateData_Scope_Zero";
                        break;
                        break;
                    case -184092185:
                        if (!str3.equals("ADVOCATE_SCOPE_ONE")) {
                            throw new Exception("Wrong DocumentDataSaveMode");
                        }
                        str2 = "AdvocateData_Scope_One";
                        break;
                        break;
                    case -60322361:
                        if (!str3.equals("DEPUTY_SCOPE_ONE")) {
                            throw new Exception("Wrong DocumentDataSaveMode");
                        }
                        str2 = "DeputyData_Scope_One";
                        break;
                        break;
                    default:
                        throw new Exception("Wrong DocumentDataSaveMode");
                }
                mapK.put(str2, cMSSignedData.getEncoded());
            }
        } else {
            if (!(jVar instanceof k34.j.AsyncMultiDocument)) {
                throw new oq.p();
            }
            Map map2 = (Map) bVar2.a(kVar.y0(iy.a.c(kVar.base64Coder, str, null, 2, null), documentCertsSet));
            if (map2.isEmpty()) {
                bVar2.b(new dx.b.Generic(new Exception("Failed to save document: Document data map is empty")));
                throw new oq.g();
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                mapK.put((String) entry2.getKey(), ((CMSSignedData) entry2.getValue()).getEncoded());
            }
        }
        cVar.H(mapK);
        return i0.f148189a;
    }

    private final dx.i<dx.b, List<Integer>> I0() {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    return new dx.i.Right(((cj2.b) new ex.a().a(S0())).i());
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
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
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private final dx.i<dx.b, i0> I1(boolean forceCreateNewContainer, aj2.a service, er.q<? super ex.b<? super dx.b>, ? super bj2.c, ? super DocumentCertsSet, i0> saveData) {
        Object objB;
        bj2.c cVarL1;
        Object objB2;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int iIntValue = ((Number) aVar.a(O0(service))).intValue();
                    if (forceCreateNewContainer || iIntValue == -1) {
                        iIntValue = ((Number) aVar.a(v1((cj2.a) aVar.a(j1(this, service, null, 2, null))))).intValue();
                        cVarL1 = l1(iIntValue);
                    } else {
                        cVarL1 = (bj2.c) aVar.a(Z0(iIntValue));
                    }
                    dx.i iVarO1 = o1(this, false, 1, null);
                    if (iVarO1 instanceof dx.i.Left) {
                        objB2 = -1;
                    } else {
                        if (!(iVarO1 instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB2 = ((dx.i.Right) iVarO1).b();
                    }
                    saveData.w(aVar, cVarL1, (DocumentCertsSet) aVar.a(vi2.a.INSTANCE.a(this.pkcs12Manager).m(((Number) objB2).intValue())));
                    cVarL1.c();
                    A1(this, service, null, 2, null);
                    S1(iIntValue);
                    return new dx.i.Right(i0.f148189a);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
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
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private final dx.i<dx.b, List<Integer>> J0(aj2.a service) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    return new dx.i.Right(((cj2.b) new ex.a().a(S0())).n(service));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
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
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private final dx.i<dx.b, i0> J1(boolean forceCreateNewContainer, rq0.b documentType, er.q<? super ex.b<? super dx.b>, ? super bj2.c, ? super DocumentCertsSet, i0> saveData) {
        return I1(forceCreateNewContainer, pl.gov.coi.mobywatel.feature.legacy.storage.n.a(documentType), saveData);
    }

    private final dx.i<dx.b, List<Integer>> K0(rq0.b documentType) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    return new dx.i.Right(((cj2.b) new ex.a().a(S0())).n(pl.gov.coi.mobywatel.feature.legacy.storage.n.a(documentType)));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
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
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    static /* synthetic */ dx.i K1(k kVar, boolean z15, aj2.a aVar, er.q qVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        return kVar.I1(z15, aVar, qVar);
    }

    private final dx.i<dx.b, cj2.a> L0(int bundleId) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    return new dx.i.Right(((cj2.b) new ex.a().a(S0())).k(bundleId));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
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
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    static /* synthetic */ dx.i L1(k kVar, boolean z15, rq0.b bVar, er.q qVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        return kVar.J1(z15, bVar, qVar);
    }

    private final dx.i<dx.b, cj2.a> M0(aj2.a service) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    return new dx.i.Right(((cj2.b) new ex.a().a(S0())).l(service));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
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
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M1(boolean z15, k kVar, String str, ex.b bVar, bj2.c cVar, DocumentCertsSet documentCertsSet) {
        if (z15) {
            cVar.I(null);
            cVar.D(null);
            cVar.M(new HashMap<>());
        }
        Map map = (Map) bVar.a(kVar.y0(iy.a.c(kVar.base64Coder, str, null, 2, null), documentCertsSet));
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(oq.y.a(entry.getKey(), ((CMSSignedData) entry.getValue()).getEncoded()));
        }
        for (Map.Entry entry2 : v0.s(arrayList).entrySet()) {
            String str2 = (String) entry2.getKey();
            byte[] bArr = (byte[]) entry2.getValue();
            int iHashCode = str2.hashCode();
            if (iHashCode != -1808063079) {
                if (iHashCode != -1566357195) {
                    if (iHashCode == 1438742418 && str2.equals("ACTIVE_TEMPORARY_DRIVING_LICENCE")) {
                        cVar.D(bArr);
                    }
                } else if (str2.equals("INVALIDATED_TEMPORARY_DRIVING_LICENCE")) {
                    int size = cVar.q().size();
                    Map mapW = v0.w(cVar.q());
                    mapW.put("INVALIDATED_TEMPORARY_DRIVING_LICENCES_" + size, bArr);
                    cVar.M(new HashMap<>(mapW));
                }
            } else if (str2.equals("DRIVING_LICENCE")) {
                cVar.I(bArr);
            }
        }
        cVar.L(null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx.i<dx.b, cj2.a> N0(rq0.b documentType) {
        return M0(pl.gov.coi.mobywatel.feature.legacy.storage.n.a(documentType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N1(k34.j jVar, rq0.b bVar, Map map, k kVar, ex.b bVar2, bj2.c cVar, DocumentCertsSet documentCertsSet) {
        DynamicMultiDocumentDataContainerDto dynamicMultiDocumentDataContainerDto;
        String strB;
        HashMap<String, byte[]> mapK = cVar.k();
        if ((jVar instanceof k34.j.a) || (jVar instanceof k34.j.AsyncById) || (jVar instanceof k34.j.d)) {
            bVar2.b(new dx.b.Generic(new Exception("Saving error: wrong documentDataSaveMode for " + bVar)));
            throw new oq.g();
        }
        if (!(jVar instanceof k34.j.AsyncMultiDocument)) {
            throw new oq.p();
        }
        if (((k34.j.AsyncMultiDocument) jVar).getOverride()) {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(oq.y.a(entry.getKey(), ((CMSSignedData) bVar2.a(kVar.z0(iy.a.c(kVar.base64Coder, iy.c0.e(((gr0.c) entry.getValue()).getData()), null, 2, null), documentCertsSet))).getEncoded()));
            }
            strB = kVar.jsonSerializer.b(new DynamicMultiDocumentDataContainerDto(v0.s(arrayList)), q0.n(DynamicMultiDocumentDataContainerDto.class));
        } else {
            byte[] bArr = mapK.get(bVar.getReferenceName());
            DynamicMultiDocumentDataContainerDto dynamicMultiDocumentDataContainerDto2 = bArr != null ? (DynamicMultiDocumentDataContainerDto) kVar.jsonWithNullCheck.a(new String((byte[]) bVar2.a(iy.a.a(kVar.base64Coder, bArr, null, 2, null)), fu.d.UTF_8), q0.n(DynamicMultiDocumentDataContainerDto.class)) : null;
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Map.Entry entry2 : map.entrySet()) {
                arrayList2.add(oq.y.a(entry2.getKey(), ((CMSSignedData) bVar2.a(kVar.z0(iy.a.c(kVar.base64Coder, iy.c0.e(((gr0.c) entry2.getValue()).getData()), null, 2, null), documentCertsSet))).getEncoded()));
            }
            Map mapS = v0.s(arrayList2);
            if (dynamicMultiDocumentDataContainerDto2 == null || (dynamicMultiDocumentDataContainerDto = dynamicMultiDocumentDataContainerDto2.copy(v0.o(dynamicMultiDocumentDataContainerDto2.getDataMap(), mapS))) == null) {
                dynamicMultiDocumentDataContainerDto = new DynamicMultiDocumentDataContainerDto(mapS);
            }
            strB = kVar.jsonSerializer.b(dynamicMultiDocumentDataContainerDto, q0.n(DynamicMultiDocumentDataContainerDto.class));
        }
        iy.a aVar = kVar.base64Coder;
        Charset charset = fu.d.UTF_8;
        mapK.put(bVar.getReferenceName(), iy.a.e(aVar, strB.getBytes(charset), null, 2, null).getBytes(charset));
        cVar.H(mapK);
        return i0.f148189a;
    }

    private final dx.i<dx.b, Integer> O0(aj2.a service) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    return new dx.i.Right(Integer.valueOf(((cj2.b) new ex.a().a(S0())).m(service)));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
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
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O1(k kVar, String str, ex.b bVar, bj2.c cVar, DocumentCertsSet documentCertsSet) {
        for (Map.Entry entry : ((Map) bVar.a(kVar.y0(iy.a.c(kVar.base64Coder, str, null, 2, null), documentCertsSet))).entrySet()) {
            cVar.o().put((String) entry.getKey(), ((CMSSignedData) entry.getValue()).getEncoded());
        }
        return i0.f148189a;
    }

    private final dx.i<dx.b, Integer> P0(rq0.b documentType) {
        return O0(pl.gov.coi.mobywatel.feature.legacy.storage.n.a(documentType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P1(k kVar, String str, ex.b bVar, bj2.c cVar, DocumentCertsSet documentCertsSet) {
        for (Map.Entry entry : ((Map) bVar.a(kVar.y0(iy.a.c(kVar.base64Coder, str, null, 2, null), documentCertsSet))).entrySet()) {
            String str2 = (String) entry.getKey();
            CMSSignedData cMSSignedData = (CMSSignedData) entry.getValue();
            int length = str2.length();
            int i15 = 0;
            while (true) {
                if (i15 >= length) {
                    i15 = -1;
                    break;
                }
                if (str2.charAt(i15) == '_') {
                    break;
                }
                i15++;
            }
            String strSubstring = str2.substring(i15 + 1);
            if (fr.t.c(strSubstring, "REFUGEE_SCOPE_3001")) {
                cVar.L(cMSSignedData.getEncoded());
            } else if (fr.t.c(strSubstring, "REFUGEE_SCOPE_3002")) {
                cVar.N(cMSSignedData.getEncoded());
            }
        }
        return i0.f148189a;
    }

    private final dx.i<dx.b, List<Integer>> Q0(aj2.a service) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    return new dx.i.Right(((cj2.a) new ex.a().a(M0(service))).d());
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
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
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private final void Q1(bj2.c userContainer, String userJSON) throws uh2.a {
        Object objB;
        Object objB2;
        Object objB3;
        Object objB4;
        dx.i iVarC = iy.a.c(this.base64Coder, sh2.c.b(userJSON).a("signedDataList"), null, 2, null);
        if (iVarC instanceof dx.i.Left) {
            objB = new byte[0];
        } else {
            if (!(iVarC instanceof dx.i.Right)) {
                throw new oq.p();
            }
            objB = ((dx.i.Right) iVarC).b();
        }
        dx.i<dx.b, char[]> iVarC2 = this.bytesConverter.c((byte[]) objB, new iy.b.Standard(null, 1, null));
        if (iVarC2 instanceof dx.i.Left) {
            objB2 = new char[0];
        } else {
            if (!(iVarC2 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            objB2 = ((dx.i.Right) iVarC2).b();
        }
        HashMap map = (HashMap) sh2.c.a(new String((char[]) objB2), HashMap.class);
        dx.i iVarC3 = iy.a.c(this.base64Coder, (String) map.get("fullStudentData"), null, 2, null);
        if (iVarC3 instanceof dx.i.Left) {
            objB3 = new byte[0];
        } else {
            if (!(iVarC3 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            objB3 = ((dx.i.Right) iVarC3).b();
        }
        byte[] bArr = (byte[]) objB3;
        dx.i iVarC4 = iy.a.c(this.base64Coder, (String) map.get("basicStudentData"), null, 2, null);
        if (iVarC4 instanceof dx.i.Left) {
            objB4 = new byte[0];
        } else {
            if (!(iVarC4 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            objB4 = ((dx.i.Right) iVarC4).b();
        }
        byte[] bArr2 = (byte[]) objB4;
        try {
            CMSSignedData cMSSignedData = new CMSSignedData(bArr);
            CMSSignedData cMSSignedData2 = new CMSSignedData(bArr2);
            userContainer.L(cMSSignedData.getEncoded());
            userContainer.E(cMSSignedData2.getEncoded());
        } catch (Exception e15) {
            throw new uh2.a(uh2.b.SERVER_PARSE_USER_DATA, e15);
        }
    }

    private final dx.i<dx.b, List<Integer>> R0(rq0.b documentType) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    return new dx.i.Right(((cj2.a) new ex.a().a(N0(documentType))).d());
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
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
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R1(boolean z15, k kVar, String str, ex.b bVar, bj2.c cVar, DocumentCertsSet documentCertsSet) {
        BigDecimal bigDecimal;
        if (z15) {
            cVar.C().clear();
        }
        for (Map.Entry entry : ((Map) bVar.a(kVar.y0(iy.a.c(kVar.base64Coder, str, null, 2, null), documentCertsSet))).entrySet()) {
            String str2 = (String) entry.getKey();
            CMSSignedData cMSSignedData = (CMSSignedData) entry.getValue();
            dx.i<dx.b, String> iVarX0 = kVar.x0(cMSSignedData.getEncoded());
            if (iVarX0 instanceof dx.i.Left) {
                bVar.b((dx.b) ((dx.i.Left) iVarX0).b());
                throw new oq.g();
            }
            if (!(iVarX0 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            ri2.e eVar = ((ri2.f) kVar.jsonSerializer.a((String) ((dx.i.Right) iVarX0).b(), q0.n(ri2.f.class))).f174483c.get("BASIC");
            if (eVar == null || (bigDecimal = eVar.W) == null) {
                bVar.b(new dx.b.Generic(new Exception("Failed to save document: imageCode cannot be null")));
                throw new oq.g();
            }
            cVar.C().put(str2, kVar.jsonSerializer.b(new ai2.a(bigDecimal.intValue(), cMSSignedData.getEncoded()), q0.n(ai2.a.class)).getBytes(fu.d.UTF_8));
        }
        return i0.f148189a;
    }

    private final dx.i<dx.b, cj2.b> S0() {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    cj2.b bVarR = ContainerManagerNew.u().r();
                    if (bVarR != null) {
                        return new dx.i.Right(bVarR);
                    }
                    aVar.b(new dx.b.Generic(new NullPointerException("DocumentsRepository, commonContainer is null")));
                    throw new oq.g();
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
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
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private final dx.i<dx.b, i0> S1(int bundleId) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    cj2.b bVar = (cj2.b) aVar.a(S0());
                    cj2.a aVarK = bVar.k(bundleId);
                    aVarK.l();
                    bVar.v(bundleId, aVarK);
                    aVar.a(G1());
                    return new dx.i.Right(i0.f148189a);
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

    private final dx.i<dx.b, Map<String, byte[]>> T0(rq0.b documentType) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    HashMap<String, byte[]> mapK = ((bj2.c) aVar.a(b1(documentType))).k();
                    if (mapK != null) {
                        return new dx.i.Right(mapK);
                    }
                    aVar.b(new dx.b.Generic(new Exception("DocumentList error: DocumentList cannot be null")));
                    throw new oq.g();
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

    private final dx.i<dx.b, byte[]> U0(rq0.b documentType, String alternativeKey) {
        dx.i iVarT0 = T0(documentType);
        if (iVarT0 instanceof dx.i.Left) {
            return iVarT0;
        }
        if (!(iVarT0 instanceof dx.i.Right)) {
            throw new oq.p();
        }
        Map map = (Map) ((dx.i.Right) iVarT0).b();
        byte[] bArr = (byte[]) map.get(documentType.getReferenceName());
        if (bArr == null) {
            bArr = (byte[]) map.get(alternativeKey);
        }
        return bArr != null ? new dx.i.Right(bArr) : new dx.i.Left(new dx.b.Generic(new Exception("DocumentData error: DocumentData cannot be null")));
    }

    static /* synthetic */ dx.i V0(k kVar, rq0.b bVar, String str, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            str = "";
        }
        return kVar.U0(bVar, str);
    }

    private final byte[] W0(rq0.b documentType, String alternativeKey) {
        HashMap<String, byte[]> mapM;
        bj2.c cVarA = b1(documentType).a();
        if (cVarA == null || (mapM = cVarA.m()) == null) {
            return null;
        }
        if (alternativeKey == null) {
            alternativeKey = documentType.getReferenceName();
        }
        return mapM.get(alternativeKey);
    }

    static /* synthetic */ byte[] X0(k kVar, rq0.b bVar, String str, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            str = null;
        }
        return kVar.W0(bVar, str);
    }

    private final dx.i<dx.b, bj2.b> Y0(rq0.b documentType) {
        Object objB;
        dx.i<dx.b, bj2.b> left;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int iIntValue = ((Number) aVar.a(P0(documentType))).intValue();
                    bj2.b bVar = (bj2.b) ContainerManagerNew.u().z(bj2.b.class, iIntValue, pl.gov.coi.mobywatel.feature.legacy.storage.d.PASS);
                    if (bVar != null) {
                        left = new dx.i.Right<>(bVar);
                        if (left instanceof dx.i.Left) {
                            px.b.y5(this.remoteLogger, "DocumentsRepository, getContainerPass error", null, px.c.a(this), 2, null);
                        }
                        return left;
                    }
                    aVar.b(new dx.b.Generic(new NullPointerException("DocumentsRepository, containerPass with id:" + iIntValue + " is null")));
                    throw new oq.g();
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                left = new dx.i.Left((dx.b) ex.d.a(e16));
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
            left = new dx.i.Left<>(objB);
        }
    }

    private final dx.i<dx.b, bj2.c> Z0(int containerUserBundleId) {
        Object objB;
        dx.i<dx.b, bj2.c> left;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    bj2.c cVar = (bj2.c) ContainerManagerNew.u().z(bj2.c.class, containerUserBundleId, pl.gov.coi.mobywatel.feature.legacy.storage.d.USER);
                    if (cVar != null) {
                        left = new dx.i.Right<>(cVar);
                        if (left instanceof dx.i.Left) {
                            px.b.y5(this.remoteLogger, "DocumentsRepository, getContainerUser error", null, px.c.a(this), 2, null);
                        }
                        return left;
                    }
                    aVar.b(new dx.b.Generic(new NullPointerException("DocumentsRepository, containerUser with id:" + containerUserBundleId + " is null")));
                    throw new oq.g();
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                left = new dx.i.Left((dx.b) ex.d.a(e16));
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
            left = new dx.i.Left<>(objB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx.i<dx.b, bj2.c> a1(aj2.a service) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    return new dx.i.Right((bj2.c) aVar.a(Z0(((cj2.b) aVar.a(S0())).m(service))));
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

    private final dx.i<dx.b, bj2.c> b1(rq0.b documentType) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    return new dx.i.Right((bj2.c) aVar.a(Z0(((cj2.b) aVar.a(S0())).m(pl.gov.coi.mobywatel.feature.legacy.storage.n.a(documentType)))));
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3 A[Catch: Exception -> 0x00c0, c -> 0x00c4, CancellationException -> 0x00c8, TryCatch #9 {c -> 0x00c4, CancellationException -> 0x00c8, Exception -> 0x00c0, blocks: (B:30:0x009c, B:36:0x00b3, B:33:0x00a3, B:35:0x00a7, B:43:0x00cc, B:44:0x00d1), top: B:78:0x009c }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7 A[Catch: Exception -> 0x00c0, c -> 0x00c4, CancellationException -> 0x00c8, TryCatch #9 {c -> 0x00c4, CancellationException -> 0x00c8, Exception -> 0x00c0, blocks: (B:30:0x009c, B:36:0x00b3, B:33:0x00a3, B:35:0x00a7, B:43:0x00cc, B:44:0x00d1), top: B:78:0x009c }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc A[Catch: Exception -> 0x00c0, c -> 0x00c4, CancellationException -> 0x00c8, TryCatch #9 {c -> 0x00c4, CancellationException -> 0x00c8, Exception -> 0x00c0, blocks: (B:30:0x009c, B:36:0x00b3, B:33:0x00a3, B:35:0x00a7, B:43:0x00cc, B:44:0x00d1), top: B:78:0x009c }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:66:0x010e  */
    /* JADX WARN: Code duplicated, block: B:67:0x011c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0120  */
    /* JADX WARN: Code duplicated, block: B:72:0x012d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v3, types: [dx.j, java.lang.Object] */
    public final Object c1(k34.a0 a0Var, tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
        l lVar;
        Exception exc;
        ?? r15;
        String message;
        dx.i iVarA;
        Object objB;
        ex.c cVar;
        Object obj;
        Object obj2;
        ex.b bVar;
        dx.i<dx.b, String> iVarX0;
        if (eVar instanceof l) {
            lVar = (l) eVar;
            int i15 = lVar.f134609r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                lVar.f134609r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                lVar = new l(eVar);
            }
        } else {
            lVar = new l(eVar);
        }
        l lVar2 = lVar;
        Object objA = lVar2.f134607p;
        Object objE = uq.b.e();
        int i16 = lVar2.f134609r;
        try {
            try {
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) lVar2.f134601h;
                    dx.j jVar = (dx.j) lVar2.f134598e;
                    try {
                        oq.u.b(objA);
                        obj = jVar;
                        obj2 = objA;
                        try {
                            iVarX0 = (dx.i) obj2;
                            if (!(iVarX0 instanceof dx.i.Left)) {
                                if (iVarX0 instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                iVarX0 = x0((byte[]) ((dx.i.Right) iVarX0).b());
                            }
                            return new dx.i.Right((String) bVar.a(iVarX0));
                        } catch (ex.c e15) {
                            cVar = e15;
                            return new dx.i.Left((dx.b) ex.d.a(cVar));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            exc = e17;
                            r15 = obj;
                            px.f fVar = px.f.f163100a;
                            message = exc.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, exc, px.c.a(r15));
                            iVarA = r15.a(exc);
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
                        cVar = e18;
                        return new dx.i.Left((dx.b) ex.d.a(cVar));
                    } catch (CancellationException e19) {
                        throw e19;
                    } catch (Exception e25) {
                        exc = e25;
                        r15 = jVar;
                        px.f fVar2 = px.f.f163100a;
                        message = exc.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar2.d(message, exc, px.c.a(r15));
                        iVarA = r15.a(exc);
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
                oq.u.b(objA);
                objA = xw.c.f221622a.a();
                try {
                    ex.a aVar = new ex.a();
                    lVar2.f134597d = vq.j.a(a0Var);
                    lVar2.f134598e = objA;
                    lVar2.f134599f = vq.j.a(aVar);
                    lVar2.f134600g = vq.j.a(aVar);
                    lVar2.f134601h = aVar;
                    lVar2.f134602j = 0;
                    lVar2.f134603k = 0;
                    lVar2.f134604l = 0;
                    lVar2.f134605m = 0;
                    lVar2.f134606n = 0;
                    lVar2.f134609r = 1;
                    try {
                        Object objT1 = t1(this, a0Var, null, lVar2, 2, null);
                        if (objT1 == objE) {
                            return objE;
                        }
                        obj = objA;
                        obj2 = objT1;
                        bVar = aVar;
                        iVarX0 = (dx.i) obj2;
                        if (!(iVarX0 instanceof dx.i.Left)) {
                            if (iVarX0 instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            iVarX0 = x0((byte[]) ((dx.i.Right) iVarX0).b());
                        }
                        return new dx.i.Right((String) bVar.a(iVarX0));
                    } catch (ex.c e26) {
                        e = e26;
                        cVar = e;
                        return new dx.i.Left((dx.b) ex.d.a(cVar));
                    } catch (CancellationException e27) {
                        e = e27;
                        throw e;
                    }
                } catch (ex.c e28) {
                    e = e28;
                } catch (CancellationException e29) {
                    e = e29;
                } catch (Exception e35) {
                    e = e35;
                    exc = e;
                    r15 = objA;
                    px.f fVar3 = px.f.f163100a;
                    message = exc.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar3.d(message, exc, px.c.a(r15));
                    iVarA = r15.a(exc);
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
            } catch (CancellationException e36) {
                throw e36;
            }
        } catch (Exception e37) {
            e = e37;
        }
    }

    private final dx.i<dx.b, byte[]> d1(String subtype, bj2.c containerUser) {
        wn3.a aVarA = wn3.a.INSTANCE.a(subtype);
        int i15 = aVarA == null ? -1 : a.f134449a[aVarA.ordinal()];
        if (i15 == 1) {
            byte[] bArrL = containerUser.l();
            if (bArrL != null) {
                return new dx.i.Right(bArrL);
            }
            return new dx.i.Left(new dx.b.Generic(new Exception("There is no driving licence of subtype " + subtype)));
        }
        if (i15 != 2) {
            byte[] bArrP = containerUser.p();
            if (bArrP != null) {
                return new dx.i.Right(bArrP);
            }
            return new dx.i.Left(new dx.b.Generic(new Exception("There is no driving licence of subtype " + subtype)));
        }
        byte[] bArrG = containerUser.g();
        if (bArrG != null) {
            return new dx.i.Right(bArrG);
        }
        HashMap<String, byte[]> mapQ = containerUser.q();
        if (mapQ == null) {
            return new dx.i.Left(new dx.b.Generic(new Exception("There is no driving licence of subtype " + subtype)));
        }
        if (!mapQ.values().isEmpty()) {
            return new dx.i.Right(pq.v.k0(mapQ.values()));
        }
        return new dx.i.Left(new dx.b.Generic(new Exception("There is no driving licence of subtype " + subtype)));
    }

    private final dx.i<dx.b, byte[]> e1(rq0.b.EnumC4479b dynamicDocumentType, String documentIID) {
        dx.i<dx.b, byte[]> left;
        dx.i<dx.b, byte[]> iVarU0 = U0(dynamicDocumentType, documentIID);
        if (iVarU0 instanceof dx.i.Left) {
            return iVarU0;
        }
        if (!(iVarU0 instanceof dx.i.Right)) {
            throw new oq.p();
        }
        try {
            dx.i iVarC = iy.a.c(this.base64Coder, ((DocumentByIdContainerDto) this.jsonSerializer.a(new String((byte[]) ((dx.i.Right) iVarU0).b(), fu.d.UTF_8), q0.n(DocumentByIdContainerDto.class))).getScope(), null, 2, null);
            if (iVarC instanceof dx.i.Left) {
                return new dx.i.Left(new dx.b.Parsing(null, 1, null));
            }
            if (!(iVarC instanceof dx.i.Right)) {
                throw new oq.p();
            }
            left = new dx.i.Right<>(((dx.i.Right) iVarC).b());
            return left;
        } catch (com.google.gson.p e15) {
            left = new dx.i.Left<>(new dx.b.Parsing(e15));
        }
    }

    private final dx.i<dx.b, Map<String, String>> f1(rq0.b.c dynamicMultiDocumentType) {
        dx.i<dx.b, Map<String, String>> iVarV0 = V0(this, dynamicMultiDocumentType, null, 2, null);
        if (iVarV0 instanceof dx.i.Left) {
            return iVarV0;
        }
        if (!(iVarV0 instanceof dx.i.Right)) {
            throw new oq.p();
        }
        byte[] bArr = (byte[]) ((dx.i.Right) iVarV0).b();
        try {
            ay.j jVar = this.jsonWithNullCheck;
            dx.i iVarA = iy.a.a(this.base64Coder, bArr, null, 2, null);
            if (iVarA instanceof dx.i.Left) {
                return new dx.i.Left(new dx.b.Parsing(null, 1, null));
            }
            if (!(iVarA instanceof dx.i.Right)) {
                throw new oq.p();
            }
            Map<String, byte[]> dataMap = ((DynamicMultiDocumentDataContainerDto) jVar.a(new String((byte[]) ((dx.i.Right) iVarA).b(), fu.d.UTF_8), q0.n(DynamicMultiDocumentDataContainerDto.class))).getDataMap();
            LinkedHashMap linkedHashMap = new LinkedHashMap(v0.e(dataMap.size()));
            for (Object obj : dataMap.entrySet()) {
                linkedHashMap.put(((Map.Entry) obj).getKey(), x0((byte[]) ((Map.Entry) obj).getValue()).a());
            }
            return new dx.i.Right(v0.u(linkedHashMap));
        } catch (com.google.gson.p e15) {
            return new dx.i.Left(new dx.b.Parsing(e15));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx.i<dx.b, Map<String, DynamicMultiDocumentSchemaContainer>> g1(rq0.b.c dynamicMultiDocumentType) {
        Object objB;
        Map mapI;
        byte[] bArr;
        byte[] bArr2;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    bj2.c cVar = (bj2.c) aVar.a(b1(dynamicMultiDocumentType));
                    HashMap<String, byte[]> mapN = cVar.n();
                    if (mapN == null || (bArr = mapN.get(dynamicMultiDocumentType.getReferenceName())) == null) {
                        mapI = v0.i();
                    } else {
                        try {
                            ay.j jVar = this.jsonWithNullCheck;
                            byte[] bArr3 = (byte[]) aVar.a(iy.a.a(this.base64Coder, bArr, null, 2, null));
                            Charset charset = fu.d.UTF_8;
                            MultiDocumentSchemaDtoDto multiDocumentSchemaDtoDto = (MultiDocumentSchemaDtoDto) jVar.a(new String(bArr3, charset), q0.n(MultiDocumentSchemaDtoDto.class));
                            HashMap<String, byte[]> mapM = cVar.m();
                            if (mapM == null || (bArr2 = mapM.get(dynamicMultiDocumentType.getReferenceName())) == null) {
                                mapI = v0.i();
                            } else {
                                List<DynamicDocumentSchemaContainerDto> schemas = ((DynamicDocumentSchemaListContainerDto) this.jsonWithNullCheck.a(new String((byte[]) aVar.a(iy.a.a(this.base64Coder, bArr2, null, 2, null)), charset), q0.n(DynamicDocumentSchemaListContainerDto.class))).getSchemas();
                                mapI = new LinkedHashMap(lr.m.e(v0.e(pq.v.y(schemas, 10)), 16));
                                for (DynamicDocumentSchemaContainerDto dynamicDocumentSchemaContainerDto : schemas) {
                                    String documentId = dynamicDocumentSchemaContainerDto.getDocumentId();
                                    DocumentSchema documentSchemaF = nr0.d.f(dynamicDocumentSchemaContainerDto.getSchema());
                                    MultiDocumentSchema multiDocumentSchemaW = nr0.d.w(multiDocumentSchemaDtoDto);
                                    LocalDate expirationDate = dynamicDocumentSchemaContainerDto.getExpirationDate();
                                    oq.r rVarA = oq.y.a(documentId, new DynamicMultiDocumentSchemaContainer(documentSchemaF, multiDocumentSchemaW, expirationDate != null ? new fz.b.LocalDate(expirationDate) : null));
                                    mapI.put(rVarA.c(), rVarA.d());
                                }
                            }
                        } catch (com.google.gson.p e15) {
                            aVar.b(new dx.b.Parsing(e15));
                            throw new oq.g();
                        }
                    }
                    return new dx.i.Right(mapI);
                } catch (CancellationException e16) {
                    throw e16;
                }
            } catch (ex.c e17) {
                return new dx.i.Left((dx.b) ex.d.a(e17));
            } catch (CancellationException e18) {
                throw e18;
            }
        } catch (Exception e19) {
            px.f fVar = px.f.f163100a;
            String message = e19.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e19, px.c.a(jVarA));
            Object objA = jVarA.a(e19);
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

    private final dx.i<dx.b, cj2.a> h1(aj2.a service, aj2.a forcedParentService) {
        Object objB;
        aj2.a aVarA;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    rq0.b bVarH = this.identityManager.h(true);
                    if (bVarH == null || (aVarA = pl.gov.coi.mobywatel.feature.legacy.storage.n.a(bVarH)) == null) {
                        aVarA = aj2.a.DEFAULT;
                    }
                    cj2.a aVar = new cj2.a();
                    aVar.r(service);
                    aVar.q(forcedParentService != null ? forcedParentService.getId() : aVarA.getId());
                    return new dx.i.Right(aVar);
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

    private final dx.i<dx.b, cj2.a> i1(rq0.b documentType, rq0.b forcedParentDocumentType) {
        return h1(pl.gov.coi.mobywatel.feature.legacy.storage.n.a(documentType), forcedParentDocumentType != null ? pl.gov.coi.mobywatel.feature.legacy.storage.n.a(forcedParentDocumentType) : null);
    }

    static /* synthetic */ dx.i j1(k kVar, aj2.a aVar, aj2.a aVar2, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            aVar2 = null;
        }
        return kVar.h1(aVar, aVar2);
    }

    private final bj2.b k1(int activeServiceId) {
        bj2.b bVar = new bj2.b();
        bVar.d(activeServiceId);
        bVar.e(pl.gov.coi.mobywatel.feature.legacy.storage.d.PASS);
        bVar.c();
        return bVar;
    }

    private final bj2.c l1(int activeServiceId) {
        bj2.c cVar = new bj2.c();
        cVar.d(activeServiceId);
        cVar.e(pl.gov.coi.mobywatel.feature.legacy.storage.d.USER);
        cVar.c();
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x0062  */
    /* JADX WARN: Code duplicated, block: B:20:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0088  */
    /* JADX WARN: Code duplicated, block: B:26:0x009c  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0088 -> B:12:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object m1(java.util.Map<java.lang.String, byte[]> r12, tq.e<? super dx.i<? extends dx.b, byte[]>> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nd4.k.m1(java.util.Map, tq.e):java.lang.Object");
    }

    private final dx.i<dx.b, Integer> n1(boolean withValidCert) {
        Object objB;
        Object obj;
        Integer num;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    Iterator it = v0.y(((cj2.b) aVar.a(S0())).h(Boolean.valueOf(withValidCert))).iterator();
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (it.hasNext()) {
                            aj2.a aVar2 = (aj2.a) ((oq.r) next).a();
                            do {
                                Object next2 = it.next();
                                aj2.a aVar3 = (aj2.a) ((oq.r) next2).a();
                                if (aVar2.compareTo(aVar3) > 0) {
                                    next = next2;
                                    aVar2 = aVar3;
                                }
                            } while (it.hasNext());
                        }
                        obj = next;
                    } else {
                        obj = null;
                    }
                    oq.r rVar = (oq.r) obj;
                    if (rVar != null && (num = (Integer) rVar.d()) != null) {
                        return new dx.i.Right(num);
                    }
                    aVar.b(new dx.b.Generic(new NoSuchElementException("There is no main service with " + withValidCert + " cert")));
                    throw new oq.g();
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

    static /* synthetic */ dx.i o1(k kVar, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        return kVar.n1(z15);
    }

    private final dx.i<dx.b, Map<String, byte[]>> p1(rq0.b.c dynamicMultiDocumentType) {
        dx.i<dx.b, Map<String, byte[]>> left;
        dx.i<dx.b, Map<String, byte[]>> iVarV0 = V0(this, dynamicMultiDocumentType, null, 2, null);
        if (iVarV0 instanceof dx.i.Left) {
            return iVarV0;
        }
        if (!(iVarV0 instanceof dx.i.Right)) {
            throw new oq.p();
        }
        byte[] bArr = (byte[]) ((dx.i.Right) iVarV0).b();
        try {
            ay.j jVar = this.jsonWithNullCheck;
            dx.i iVarA = iy.a.a(this.base64Coder, bArr, null, 2, null);
            if (iVarA instanceof dx.i.Left) {
                return new dx.i.Left(new dx.b.Parsing(null, 1, null));
            }
            if (!(iVarA instanceof dx.i.Right)) {
                throw new oq.p();
            }
            left = new dx.i.Right<>(((DynamicMultiDocumentDataContainerDto) jVar.a(new String((byte[]) ((dx.i.Right) iVarA).b(), fu.d.UTF_8), q0.n(DynamicMultiDocumentDataContainerDto.class))).getDataMap());
            return left;
        } catch (com.google.gson.p e15) {
            left = new dx.i.Left<>(new dx.b.Parsing(e15));
        }
    }

    private final dx.i<dx.b, NipipScope> q1(rq0.b type) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    Object objV0 = V0(this, type, null, 2, null);
                    if (!(objV0 instanceof dx.i.Left)) {
                        if (!(objV0 instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        try {
                            objV0 = new dx.i.Right(t34.c.e((NipipScopeDto) this.jsonSerializer.a((String) aVar.a(x0((byte[]) ((dx.i.Right) objV0).b())), q0.n(NipipScopeDto.class))));
                        } catch (Exception unused) {
                            throw new Exception("Document " + type.getReferenceName() + " data not available");
                        }
                    }
                    return new dx.i.Right((NipipScope) aVar.a(objV0));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
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
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x0094  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:28:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:37:0x0113  */
    /* JADX WARN: Code duplicated, block: B:38:0x0118  */
    /* JADX WARN: Code duplicated, block: B:41:0x011f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0124  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ca -> B:25:0x00cd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:30:0x00e0
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object r1(java.lang.String r17, tq.e<? super dx.i<? extends dx.b, byte[]>> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nd4.k.r1(java.lang.String, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [nd4.k] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7 */
    public final Object s1(k34.a0 a0Var, String str, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar) throws Throwable {
        u uVar;
        Object objB;
        byte[] bArrP;
        byte[] bArrA;
        Object next;
        byte[] bArr;
        ex.b bVar;
        ex.b bVar2;
        if (eVar instanceof u) {
            uVar = (u) eVar;
            int i15 = uVar.f134710v;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                uVar.f134710v = i15 - PKIFailureInfo.systemUnavail;
            } else {
                uVar = new u(eVar);
            }
        } else {
            uVar = new u(eVar);
        }
        Object obj = uVar.f134708s;
        Object objE = uq.b.e();
        int i16 = uVar.f134710v;
        try {
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(obj);
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            aj2.a aVarU1 = u1(a0Var);
                            bj2.c cVar = (bj2.c) aVar.a(a1(aVarU1));
                            if (fr.t.c(a0Var, k34.a0.n.f107880a) || fr.t.c(a0Var, k34.a0.b0.f107850a) || fr.t.c(a0Var, k34.a0.x.f107900a)) {
                                bArrP = cVar.p();
                            } else if (fr.t.c(a0Var, k34.a0.C2570a0.f107847a)) {
                                bArrP = cVar.h();
                            } else if (fr.t.c(a0Var, k34.a0.z.f107904a)) {
                                bArrP = (byte[]) aVar.a(d1(str, cVar));
                            } else if (fr.t.c(a0Var, k34.a0.o.f107882a) || fr.t.c(a0Var, k34.a0.y.f107902a)) {
                                bArrP = cVar.r();
                            } else if (fr.t.c(a0Var, k34.a0.p.f107884a)) {
                                bArrP = cVar.h();
                            } else if (fr.t.c(a0Var, k34.a0.q.f107886a)) {
                                bArrP = cVar.x();
                            } else if (fr.t.c(a0Var, k34.a0.r.f107888a)) {
                                bArrP = cVar.w();
                            } else if (fr.t.c(a0Var, k34.a0.s.f107890a)) {
                                bArrP = cVar.A();
                            } else if (fr.t.c(a0Var, k34.a0.t.f107892a)) {
                                bArrP = cVar.z();
                            } else if (fr.t.c(a0Var, k34.a0.u.f107894a)) {
                                bArrP = cVar.v();
                            } else {
                                if (fr.t.c(a0Var, k34.a0.v.f107896a)) {
                                    bArrA = cVar.y();
                                    if (bArrA == null) {
                                        aVar.b(new dx.b.Generic(new Exception(a0Var.getClass().getName() + " is not supported")));
                                        throw new oq.g();
                                    }
                                } else if (fr.t.c(a0Var, k34.a0.s0.f107891a)) {
                                    bArrA = cVar.k().get("pensionerData");
                                    if (bArrA == null) {
                                        bArrA = cVar.k().get(rq0.b.d.PENSIONER_CARD.getReferenceName());
                                        if (bArrA == null) {
                                            aVar.b(new dx.b.Generic(new Exception(a0Var.getClass().getName() + " is not supported")));
                                            throw new oq.g();
                                        }
                                    }
                                } else {
                                    if (!fr.t.c(a0Var, k34.a0.h1.f107869a) && !fr.t.c(a0Var, k34.a0.g1.f107866a) && !fr.t.c(a0Var, k34.a0.f1.f107863a) && !fr.t.c(a0Var, k34.a0.y0.f107903a) && !fr.t.c(a0Var, k34.a0.p0.f107885a) && !fr.t.c(a0Var, k34.a0.o0.f107883a) && !fr.t.c(a0Var, k34.a0.q0.f107887a) && !fr.t.c(a0Var, k34.a0.a1.f107848a) && !fr.t.c(a0Var, k34.a0.i0.f107871a) && !fr.t.c(a0Var, k34.a0.c.f107852a) && !fr.t.c(a0Var, k34.a0.e.f107858a) && !fr.t.c(a0Var, k34.a0.d.f107855a) && !fr.t.c(a0Var, k34.a0.g0.f107865a) && !fr.t.c(a0Var, k34.a0.f0.f107862a) && !fr.t.c(a0Var, k34.a0.z0.f107905a) && !fr.t.c(a0Var, k34.a0.t0.f107893a) && !fr.t.c(a0Var, k34.a0.k.f107874a) && !fr.t.c(a0Var, k34.a0.v0.f107897a) && !fr.t.c(a0Var, k34.a0.w0.f107899a) && !fr.t.c(a0Var, k34.a0.u0.f107895a) && !fr.t.c(a0Var, k34.a0.c1.f107854a) && !fr.t.c(a0Var, k34.a0.d0.f107856a) && !fr.t.c(a0Var, k34.a0.k0.f107875a) && !fr.t.c(a0Var, k34.a0.j0.f107873a) && !fr.t.c(a0Var, k34.a0.b1.f107851a) && !fr.t.c(a0Var, k34.a0.l0.f107877a) && !fr.t.c(a0Var, k34.a0.l.f107876a) && !fr.t.c(a0Var, k34.a0.r0.f107889a) && !fr.t.c(a0Var, k34.a0.b.f107849a) && !fr.t.c(a0Var, k34.a0.e1.f107860a) && !fr.t.c(a0Var, k34.a0.m0.f107879a) && !fr.t.c(a0Var, k34.a0.e0.f107859a) && !fr.t.c(a0Var, k34.a0.d1.f107857a) && !fr.t.c(a0Var, k34.a0.c0.f107853a) && !fr.t.c(a0Var, k34.a0.j.f107872a) && !fr.t.c(a0Var, k34.a0.n0.f107881a) && !fr.t.c(a0Var, k34.a0.h0.f107868a)) {
                                        if (fr.t.c(a0Var, k34.a0.i.f107870a)) {
                                            if (str == 0) {
                                                HashMap<String, byte[]> mapO = cVar.o();
                                                uVar.f134695d = vq.j.a(a0Var);
                                                uVar.f134696e = vq.j.a(str);
                                                uVar.f134697f = jVarA;
                                                uVar.f134698g = vq.j.a(aVar);
                                                uVar.f134699h = vq.j.a(aVar);
                                                uVar.f134700j = vq.j.a(aVarU1);
                                                uVar.f134701k = vq.j.a(cVar);
                                                uVar.f134702l = aVar;
                                                uVar.f134703m = 0;
                                                uVar.f134704n = 0;
                                                uVar.f134705p = 0;
                                                uVar.f134706q = 0;
                                                uVar.f134707r = 0;
                                                uVar.f134710v = 1;
                                                Object objM1 = m1(mapO, uVar);
                                                if (objM1 != objE) {
                                                    obj = objM1;
                                                    bVar2 = aVar;
                                                    bArrP = (byte[]) bVar2.a((dx.i) obj);
                                                }
                                            } else {
                                                byte[] bArr2 = cVar.o().get(str);
                                                if (bArr2 == null) {
                                                    aVar.b(new dx.b.Generic(new Exception(a0Var.getClass().getName() + " with " + ((String) str) + " subtype is not supported")));
                                                    throw new oq.g();
                                                }
                                                bArrP = bArr2;
                                            }
                                        } else if (fr.t.c(a0Var, k34.a0.a.f107846a)) {
                                            bArrA = cVar.k().get("AdvocateData_Scope_Zero");
                                            if (bArrA == null) {
                                                aVar.b(new dx.b.Parsing(new Exception("Brak danych dla " + a0Var.getClass().getName())));
                                                throw new oq.g();
                                            }
                                        } else if (fr.t.c(a0Var, k34.a0.f.f107861a)) {
                                            HashMap<String, byte[]> mapK = cVar.k();
                                            if (mapK == null || (bArrA = mapK.get("DeputyData_Scope_Zero")) == null) {
                                                aVar.b(new dx.b.Generic(new Exception(a0Var.getClass().getName() + " is not supported")));
                                                throw new oq.g();
                                            }
                                        } else if (fr.t.c(a0Var, k34.a0.x0.f107901a)) {
                                            uVar.f134695d = vq.j.a(a0Var);
                                            uVar.f134696e = vq.j.a(str);
                                            uVar.f134697f = jVarA;
                                            uVar.f134698g = vq.j.a(aVar);
                                            uVar.f134699h = vq.j.a(aVar);
                                            uVar.f134700j = vq.j.a(aVarU1);
                                            uVar.f134701k = vq.j.a(cVar);
                                            uVar.f134702l = aVar;
                                            uVar.f134703m = 0;
                                            uVar.f134704n = 0;
                                            uVar.f134705p = 0;
                                            uVar.f134706q = 0;
                                            uVar.f134707r = 0;
                                            uVar.f134710v = 2;
                                            Object objR1 = r1(str, uVar);
                                            if (objR1 != objE) {
                                                obj = objR1;
                                                bVar = aVar;
                                                bArrP = (byte[]) bVar.a((dx.i) obj);
                                            }
                                        } else if (a0Var instanceof k34.a0.DynamicDocument) {
                                            bArrA = str != 0 ? e1(((k34.a0.DynamicDocument) a0Var).getDocumentType(), str).a() : cVar.k().get(((k34.a0.DynamicDocument) a0Var).getDocumentType().getReferenceName());
                                            if (bArrA == null) {
                                                aVar.b(new dx.b.Generic(new Exception(a0Var.getClass().getName() + " is not supported")));
                                                throw new oq.g();
                                            }
                                        } else {
                                            if (!(a0Var instanceof k34.a0.DynamicMultiDocument)) {
                                                aVar.b(new dx.b.Generic(new Exception(a0Var.getClass().getName() + " is not supported")));
                                                throw new oq.g();
                                            }
                                            dx.i<dx.b, Map<String, byte[]>> iVarP1 = p1(((k34.a0.DynamicMultiDocument) a0Var).getDocumentType());
                                            if (!(iVarP1 instanceof dx.i.Left)) {
                                                if (!(iVarP1 instanceof dx.i.Right)) {
                                                    throw new oq.p();
                                                }
                                                Iterator it = ((Map) ((dx.i.Right) iVarP1).b()).entrySet().iterator();
                                                do {
                                                    if (!it.hasNext()) {
                                                        next = null;
                                                        break;
                                                    }
                                                    next = it.next();
                                                } while (!fr.t.c(str, ((Map.Entry) next).getKey()));
                                                Map.Entry entry = (Map.Entry) next;
                                                if (entry == null || (bArr = (byte[]) entry.getValue()) == null) {
                                                    aVar.b(new dx.b.Generic(new Exception("Document data not available")));
                                                    throw new oq.g();
                                                }
                                                iVarP1 = new dx.i.Right(bArr);
                                            }
                                            bArrP = (byte[]) aVar.a(iVarP1);
                                        }
                                        return objE;
                                    }
                                    bArrA = (byte[]) ((Map.Entry[]) cVar.k().entrySet().toArray(new Map.Entry[0]))[0].getValue();
                                    if (bArrA == null) {
                                        aVar.b(new dx.b.Generic(new Exception(a0Var.getClass().getName() + " is not supported")));
                                        throw new oq.g();
                                    }
                                }
                                bArrP = bArrA;
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
                    } else if (i16 == 1) {
                        bVar2 = (ex.b) uVar.f134702l;
                        oq.u.b(obj);
                        bArrP = (byte[]) bVar2.a((dx.i) obj);
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (ex.b) uVar.f134702l;
                        oq.u.b(obj);
                        bArrP = (byte[]) bVar.a((dx.i) obj);
                    }
                    return new dx.i.Right(bArrP);
                } catch (Exception e18) {
                    e = e18;
                }
            } catch (CancellationException e19) {
                throw e19;
            }
        } catch (ex.c e25) {
            e = e25;
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    static /* synthetic */ Object t1(k kVar, k34.a0 a0Var, String str, tq.e eVar, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            str = null;
        }
        return kVar.s1(a0Var, str, eVar);
    }

    private final aj2.a u1(k34.a0 scope) {
        if (fr.t.c(scope, k34.a0.m.f107878a) || fr.t.c(scope, k34.a0.n.f107880a) || fr.t.c(scope, k34.a0.o.f107882a) || fr.t.c(scope, k34.a0.p.f107884a) || fr.t.c(scope, k34.a0.q.f107886a) || fr.t.c(scope, k34.a0.r.f107888a) || fr.t.c(scope, k34.a0.s.f107890a) || fr.t.c(scope, k34.a0.t.f107892a) || fr.t.c(scope, k34.a0.u.f107894a) || fr.t.c(scope, k34.a0.v.f107896a)) {
            return aj2.a.TOZSAMOSC;
        }
        if (fr.t.c(scope, k34.a0.C2570a0.f107847a) || fr.t.c(scope, k34.a0.b0.f107850a)) {
            return aj2.a.STUDENT_CARD;
        }
        if (fr.t.c(scope, k34.a0.w.f107898a) || fr.t.c(scope, k34.a0.x.f107900a) || fr.t.c(scope, k34.a0.y.f107902a)) {
            return aj2.a.REFUGEE;
        }
        if (fr.t.c(scope, k34.a0.z.f107904a)) {
            return aj2.a.DRIVING_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.s0.f107891a)) {
            return aj2.a.PENSIONER_CARD;
        }
        if (fr.t.c(scope, k34.a0.h1.f107869a)) {
            return aj2.a.ZDUNSKOWOLSKA_SENIOR_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.g1.f107866a)) {
            return aj2.a.ZDUNSKOWOLSKA_RESIDENT_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.f1.f107863a)) {
            return aj2.a.ZDUNSKOWOLSKA_CITY_FAMILY_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.y0.f107903a)) {
            return aj2.a.RASKA_SENIOR_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.p0.f107885a)) {
            return aj2.a.OLAWA_RESIDENT_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.o0.f107883a)) {
            return aj2.a.OLAWA_FAMILY_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.q0.f107887a)) {
            return aj2.a.OLAWA_SENIOR_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.a1.f107848a)) {
            return aj2.a.SUCHY_LAS_FAMILY_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.i0.f107871a)) {
            return aj2.a.MIEJSKA_AUGUSTOW_TOURIST_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.c.f107852a)) {
            return aj2.a.CHELM_FAMILY_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.e.f107858a)) {
            return aj2.a.CHELM_SENIOR_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.d.f107855a)) {
            return aj2.a.CHELM_RESIDENT_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.g0.f107865a)) {
            return aj2.a.LODZ_SENIOR_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.f0.f107862a)) {
            return aj2.a.LODZ_FAMILY_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.z0.f107905a)) {
            return aj2.a.SENATOR_CARD;
        }
        if (fr.t.c(scope, k34.a0.i.f107870a)) {
            return aj2.a.FAMILY_CARD;
        }
        if (fr.t.c(scope, k34.a0.a.f107846a)) {
            return aj2.a.ADVOCATE_CARD;
        }
        if (fr.t.c(scope, k34.a0.x0.f107901a)) {
            return aj2.a.RAILWAY_CARD;
        }
        if (fr.t.c(scope, k34.a0.f.f107861a)) {
            return aj2.a.DEPUTY_CARD;
        }
        if (fr.t.c(scope, k34.a0.t0.f107893a)) {
            return aj2.a.PZPN_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.k.f107874a)) {
            return aj2.a.GIZYCKA_RESIDENT_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.v0.f107897a)) {
            return aj2.a.RACIBORSKA_RESIDENT_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.w0.f107899a)) {
            return aj2.a.RACIBORSKA_SENIOR_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.u0.f107895a)) {
            return aj2.a.RACIBORSKA_FAMILY_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.n0.f107881a)) {
            return aj2.a.NURSE_CARD;
        }
        if (fr.t.c(scope, k34.a0.h0.f107868a)) {
            return aj2.a.MIDWIFE_CARD;
        }
        if (fr.t.c(scope, k34.a0.c1.f107854a)) {
            return aj2.a.WROCLAWSKA_SENIOR_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.d0.f107856a)) {
            return aj2.a.KOBYLKA_RESIDENT_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.k0.f107875a)) {
            return aj2.a.MIEKINIA_SENIOR_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.j0.f107873a)) {
            return aj2.a.MIEKINIA_FAMILY_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.b1.f107851a)) {
            return aj2.a.TOPR_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.l0.f107877a)) {
            return aj2.a.MAZOVIA_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.l.f107876a)) {
            return aj2.a.GENERAL_COUNSEL_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.r0.f107889a)) {
            return aj2.a.OLECKO_RESIDENT_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.b.f107849a)) {
            return aj2.a.BYDGOSZCZ_FAMILY_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.e1.f107860a)) {
            return aj2.a.WODZISLAW_FAMILY_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.m0.f107879a)) {
            return aj2.a.MICHALOWICE_RESIDENT_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.e0.f107859a)) {
            return aj2.a.KOLEJE_DOLNOSLASKIE_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.d1.f107857a)) {
            return aj2.a.WISLA_RESIDENT_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.c0.f107853a)) {
            return aj2.a.JASTRZEBIA_GORA_RESIDENT_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.j.f107872a)) {
            return aj2.a.FIREFIGHTER_OSP_LICENCE;
        }
        if (scope instanceof k34.a0.DynamicDocument) {
            return aj2.a.DYNAMIC_DOCUMENTS;
        }
        if (scope instanceof k34.a0.DynamicMultiDocument) {
            return aj2.a.DYNAMIC_MULTI_DOCUMENTS;
        }
        throw new oq.p();
    }

    private final dx.i<dx.b, Integer> v1(cj2.a bundleDescription) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    return new dx.i.Right(Integer.valueOf(ContainerManagerNew.u().w(bundleDescription)));
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

    private final void w0(bj2.c userContainer, bj2.b passContainer, byte[] pkcs12, byte[] newPass) {
        HashMap<String, byte[]> mapT = userContainer.t();
        if (mapT == null) {
            mapT = new HashMap<>();
        }
        HashMap<String, byte[]> mapF = passContainer.f();
        if (mapF == null) {
            mapF = new HashMap<>();
        }
        String string = UUID.randomUUID().toString();
        mapT.put(string, pkcs12);
        mapF.put(string, sh2.a.d().a(newPass));
        userContainer.P(mapT);
        userContainer.Q(string);
        userContainer.F(Boolean.FALSE);
        passContainer.g(mapF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w1(rq0.b.EnumC4479b enumC4479b, tq.e<? super Boolean> eVar) throws Exception {
        v vVar;
        bj2.c cVarA;
        Set<String> setKeySet;
        if (eVar instanceof v) {
            vVar = (v) eVar;
            int i15 = vVar.f134716j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                vVar.f134716j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                vVar = new v(eVar);
            }
        } else {
            vVar = new v(eVar);
        }
        Object objZ = vVar.f134714g;
        Object objE = uq.b.e();
        int i16 = vVar.f134716j;
        try {
            if (i16 == 0) {
                oq.u.b(objZ);
                if (N0(enumC4479b).a() != null && (cVarA = b1(enumC4479b).a()) != null) {
                    HashMap<String, byte[]> mapM = cVarA.m();
                    Boolean boolA = (mapM == null || (setKeySet = mapM.keySet()) == null) ? null : vq.b.a(setKeySet.contains(enumC4479b.getReferenceName()));
                    if (fr.t.c(boolA, vq.b.a(true))) {
                        return vq.b.a(true);
                    }
                    vVar.f134711d = vq.j.a(enumC4479b);
                    vVar.f134712e = vq.j.a(cVarA);
                    vVar.f134713f = vq.j.a(boolA);
                    vVar.f134716j = 1;
                    objZ = Z(enumC4479b, vVar);
                    if (objZ == objE) {
                        return objE;
                    }
                }
                return vq.b.a(false);
            }
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objZ);
            dx.i iVar = (dx.i) objZ;
            if (!(iVar instanceof dx.i.Right)) {
                return vq.b.a(false);
            }
            return vq.b.a(true);
        } catch (Exception e15) {
            if (e15 instanceof CancellationException) {
                throw e15;
            }
            this.remoteLogger.T6("Error reading DYNAMIC_DOCUMENTS data", e15, px.c.a(this));
            return vq.b.a(false);
        }
    }

    private final dx.i<dx.b, String> x0(byte[] data) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    return new dx.i.Right(this.signedDataDecoder.decode(data));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
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
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private final boolean x1(rq0.b.c dynamicDocumentType) throws Exception {
        bj2.c cVarA;
        Set<String> setKeySet;
        try {
            if (N0(dynamicDocumentType).a() != null && (cVarA = b1(dynamicDocumentType).a()) != null) {
                HashMap<String, byte[]> mapN = cVarA.n();
                Boolean boolValueOf = (mapN == null || (setKeySet = mapN.keySet()) == null) ? null : Boolean.valueOf(setKeySet.contains(dynamicDocumentType.getReferenceName()));
                if (boolValueOf != null) {
                    return boolValueOf.booleanValue();
                }
            }
            return false;
        } catch (Exception e15) {
            if (e15 instanceof CancellationException) {
                throw e15;
            }
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final dx.i<dx.b, Map<String, CMSSignedData>> y0(dx.i<? extends dx.b, byte[]> iVar, DocumentCertsSet documentCertsSet) {
        Object objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        byte[] bArr = (byte[]) ((dx.i.Right) iVar).b();
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    List<EncryptedScope> list = (List) this.jsonSerializer.a(new String(fi2.a.a(new CMSEnvelopedData(bArr), documentCertsSet.getUserCert(), documentCertsSet.getUserPrivateKey()), fu.d.UTF_8), q0.o(List.class, mr.r.INSTANCE.d(q0.n(EncryptedScope.class))));
                    LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(v0.e(pq.v.y(list, 10)), 16));
                    for (EncryptedScope encryptedScope : list) {
                        oq.r rVarA = oq.y.a(encryptedScope.getId(), new CMSSignedData((byte[]) aVar.a(iy.a.c(this.base64Coder, encryptedScope.getContent(), null, 2, null))));
                        linkedHashMap.put(rVarA.c(), rVarA.d());
                    }
                    return new dx.i.Right(linkedHashMap);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
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
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private final boolean y1(int bundleId, String decryptedData, aj2.a serviceId) throws uh2.a {
        String strA;
        Object objB;
        try {
            bj2.c cVarA = Z0(bundleId).a();
            if (cVarA == null) {
                return false;
            }
            CMSSignedData cMSSignedData = new CMSSignedData(cVarA.p());
            Charset charset = StandardCharsets.UTF_8;
            String string = charset.decode(ByteBuffer.wrap((byte[]) cMSSignedData.getSignedContent().getContent())).toString();
            int i15 = a.f134450b[serviceId.ordinal()];
            if (i15 == 1) {
                strA = ((bi2.a) new com.google.gson.f().i(string, bi2.a.class)).a();
            } else {
                if (i15 != 2) {
                    throw new uh2.a(uh2.b.SERVER_PARSE_USER_DATA);
                }
                strA = ((di2.a) new com.google.gson.f().i(string, di2.a.class)).f42828g;
            }
            dx.i iVarC = iy.a.c(this.base64Coder, sh2.c.b(decryptedData).a("signedDataList"), null, 2, null);
            if (iVarC instanceof dx.i.Left) {
                throw new uh2.a(uh2.b.SERVER_PARSE_USER_DATA);
            }
            if (!(iVarC instanceof dx.i.Right)) {
                throw new oq.p();
            }
            dx.i<dx.b, char[]> iVarC2 = this.bytesConverter.c((byte[]) ((dx.i.Right) iVarC).b(), new iy.b.Standard(null, 1, null));
            if (iVarC2 instanceof dx.i.Left) {
                objB = new char[0];
            } else {
                if (!(iVarC2 instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) iVarC2).b();
            }
            dx.i iVarC3 = iy.a.c(this.base64Coder, (String) ((HashMap) sh2.c.a(new String((char[]) objB), HashMap.class)).get("fullStudentData"), null, 2, null);
            if (iVarC3 instanceof dx.i.Left) {
                throw new uh2.a(uh2.b.SERVER_PARSE_USER_DATA);
            }
            if (!(iVarC3 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return fr.t.c(strA, ((di2.a) new com.google.gson.f().i(charset.decode(ByteBuffer.wrap((byte[]) new CMSSignedData((byte[]) ((dx.i.Right) iVarC3).b()).getSignedContent().getContent())).toString(), di2.a.class)).f42828g);
        } catch (Exception e15) {
            throw new uh2.a(uh2.b.SERVER_PARSE_USER_DATA, e15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final dx.i<dx.b, CMSSignedData> z0(dx.i<? extends dx.b, byte[]> iVar, DocumentCertsSet documentCertsSet) {
        Object objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        byte[] bArr = (byte[]) ((dx.i.Right) iVar).b();
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    List list = (List) this.jsonSerializer.a(new String(fi2.a.a(new CMSEnvelopedData(bArr), documentCertsSet.getUserCert(), documentCertsSet.getUserPrivateKey()), fu.d.UTF_8), q0.o(List.class, mr.r.INSTANCE.d(q0.n(EncryptedScope.class))));
                    if (list.size() == 1) {
                        return new dx.i.Right(new CMSSignedData((byte[]) aVar.a(iy.a.c(this.base64Coder, ((EncryptedScope) list.get(0)).getContent(), null, 2, null))));
                    }
                    throw new Exception("Wrong decrypting method");
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
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
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private final dx.i<dx.b, i0> z1(aj2.a service, aj2.a forcedParentService) {
        Object objB;
        rq0.b bVarO;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    cj2.b bVar = (cj2.b) new ex.a().a(S0());
                    if (forcedParentService == null && ((bVarO = g34.c.o(this.identityManager, false, 1, null)) == null || (forcedParentService = pl.gov.coi.mobywatel.feature.legacy.storage.n.a(bVarO)) == null)) {
                        forcedParentService = aj2.a.DEFAULT;
                    }
                    bVar.r(forcedParentService, service);
                    return new dx.i.Right(i0.f148189a);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
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
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    @Override // p34.a
    public dx.i<dx.b, i0> A(MultiDocumentSchema multiDocumentSchema, rq0.b dynamicMultiDocumentType) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    bj2.c cVar = (bj2.c) new ex.a().a(b1(dynamicMultiDocumentType));
                    iy.a aVar = this.base64Coder;
                    String strB = this.jsonSerializer.b(nr0.d.S(multiDocumentSchema), q0.n(MultiDocumentSchemaDtoDto.class));
                    Charset charset = fu.d.UTF_8;
                    byte[] bytes = iy.a.e(aVar, strB.getBytes(charset), null, 2, null).getBytes(charset);
                    HashMap<String, byte[]> mapN = cVar.n();
                    if (mapN != null) {
                        mapN.put(dynamicMultiDocumentType.getReferenceName(), bytes);
                    } else {
                        mapN = v0.k(oq.y.a(dynamicMultiDocumentType.getReferenceName(), bytes));
                    }
                    cVar.K(mapN);
                    cVar.c();
                    return new dx.i.Right(i0.f148189a);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
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
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    @Override // p34.a
    public Object B(tq.e<? super dx.i<? extends dx.b, DeputyCardModel>> eVar) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    dx.i<dx.b, byte[]> iVarU0 = U0(rq0.b.d.DEPUTY_CARD, "DeputyData_Scope_Zero");
                    if (!(iVarU0 instanceof dx.i.Left)) {
                        if (!(iVarU0 instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        try {
                            iVarU0 = new dx.i.Right(yh2.c.b((DeputyCardWrapped) this.jsonSerializer.a((String) aVar.a(x0((byte[]) ((dx.i.Right) iVarU0).b())), q0.n(DeputyCardWrapped.class))));
                        } catch (Exception unused) {
                            throw new Exception("Document data not available");
                        }
                    }
                    return new dx.i.Right((DeputyCardModel) aVar.a(iVarU0));
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

    @Override // p34.a
    public Object C(rq0.b.c cVar, String str, tq.e<? super dx.i<? extends dx.b, String>> eVar) {
        Object next;
        byte[] bArr;
        dx.i<dx.b, Map<String, byte[]>> iVarP1 = p1(cVar);
        if (iVarP1 instanceof dx.i.Left) {
            return iVarP1;
        }
        if (!(iVarP1 instanceof dx.i.Right)) {
            throw new oq.p();
        }
        Map map = (Map) ((dx.i.Right) iVarP1).b();
        iy.a aVar = this.base64Coder;
        Iterator it = map.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!fr.t.c(((Map.Entry) next).getKey(), str));
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (bArr = (byte[]) entry.getValue()) == null) {
            bArr = (byte[]) pq.v.k0(map.values());
        }
        return new dx.i.Right(iy.a.e(aVar, bArr, null, 2, null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2 */
    @Override // p34.a
    public Object D(rq0.b bVar, iy.b0 b0Var, iy.a0 a0Var, iy.b0 b0Var2, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        z zVar;
        Exception exc;
        ?? r15;
        Object objB;
        ex.c cVar;
        int iIntValue;
        ex.b bVar2;
        int i15;
        if (eVar instanceof z) {
            zVar = (z) eVar;
            int i16 = zVar.f134757x;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                zVar.f134757x = i16 - PKIFailureInfo.systemUnavail;
            } else {
                zVar = new z(eVar);
            }
        } else {
            zVar = new z(eVar);
        }
        z zVar2 = zVar;
        Object obj = zVar2.f134755v;
        Object objE = uq.b.e();
        int i17 = zVar2.f134757x;
        try {
            try {
                if (i17 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        iIntValue = ((Number) aVar.a(P0(bVar))).intValue();
                        boolean zA = lj2.a.a(iIntValue);
                        if (!zA) {
                            g34.c cVar2 = this.identityManager;
                            zVar2.f134740d = vq.j.a(bVar);
                            zVar2.f134741e = vq.j.a(b0Var);
                            zVar2.f134742f = vq.j.a(a0Var);
                            zVar2.f134743g = vq.j.a(b0Var2);
                            zVar2.f134744h = jVarA;
                            zVar2.f134745j = vq.j.a(aVar);
                            zVar2.f134746k = vq.j.a(aVar);
                            zVar2.f134747l = aVar;
                            zVar2.f134748m = 0;
                            zVar2.f134749n = 0;
                            zVar2.f134750p = 0;
                            zVar2.f134751q = 0;
                            zVar2.f134752r = 0;
                            zVar2.f134753s = iIntValue;
                            zVar2.f134754t = zA;
                            zVar2.f134757x = 1;
                            Object objI = cVar2.i(bVar, b0Var, a0Var, b0Var2, zVar2);
                            if (objI == objE) {
                                return objE;
                            }
                            bVar2 = aVar;
                            obj = objI;
                            i15 = iIntValue;
                        }
                        S1(iIntValue);
                        return new dx.i.Right(i0.f148189a);
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
                }
                if (i17 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i15 = zVar2.f134753s;
                bVar2 = (ex.b) zVar2.f134747l;
                try {
                    oq.u.b(obj);
                } catch (ex.c e18) {
                    cVar = e18;
                    return new dx.i.Left((dx.b) ex.d.a(cVar));
                } catch (CancellationException e19) {
                    throw e19;
                }
                bVar2.a((dx.i) obj);
                iIntValue = i15;
                S1(iIntValue);
                return new dx.i.Right(i0.f148189a);
            } catch (Exception e25) {
                exc = e25;
                r15 = a0Var;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b6, code lost:
    
        if (r9 == r1) goto L26;
     */
    @Override // p34.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E(gr0.DynamicDocument r6, rq0.b.EnumC4479b r7, k34.j r8, tq.e<? super dx.i<? extends dx.b, oq.i0>> r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof nd4.k.d0
            if (r0 == 0) goto L13
            r0 = r9
            nd4.k$d0 r0 = (nd4.k.d0) r0
            int r1 = r0.f134518n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134518n = r1
            goto L18
        L13:
            nd4.k$d0 r0 = new nd4.k$d0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f134516l
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f134518n
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L5b
            if (r2 == r4) goto L49
            if (r2 != r3) goto L41
            java.lang.Object r6 = r0.f134513h
            oq.i0 r6 = (oq.i0) r6
            java.lang.Object r6 = r0.f134512g
            dx.i r6 = (dx.i) r6
            java.lang.Object r6 = r0.f134511f
            k34.j r6 = (k34.j) r6
            java.lang.Object r6 = r0.f134510e
            rq0.b$b r6 = (rq0.b.EnumC4479b) r6
            java.lang.Object r6 = r0.f134509d
            gr0.r r6 = (gr0.DynamicDocument) r6
            oq.u.b(r9)
            goto Lb9
        L41:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L49:
            java.lang.Object r6 = r0.f134511f
            r8 = r6
            k34.j r8 = (k34.j) r8
            java.lang.Object r6 = r0.f134510e
            r7 = r6
            rq0.b$b r7 = (rq0.b.EnumC4479b) r7
            java.lang.Object r6 = r0.f134509d
            gr0.r r6 = (gr0.DynamicDocument) r6
            oq.u.b(r9)
            goto L75
        L5b:
            oq.u.b(r9)
            iy.b0 r9 = r6.getSignedAndEncryptedDocumentBase64()
            java.lang.String r9 = iy.c0.e(r9)
            r0.f134509d = r6
            r0.f134510e = r7
            r0.f134511f = r8
            r0.f134518n = r4
            java.lang.Object r9 = r5.V(r9, r7, r8, r0)
            if (r9 != r1) goto L75
            goto Lb8
        L75:
            dx.i r9 = (dx.i) r9
            boolean r2 = r9 instanceof dx.i.Left
            if (r2 == 0) goto L7c
            return r9
        L7c:
            boolean r2 = r9 instanceof dx.i.Right
            if (r2 == 0) goto Lbc
            r2 = r9
            dx.i$c r2 = (dx.i.Right) r2
            java.lang.Object r2 = r2.b()
            oq.i0 r2 = (oq.i0) r2
            java.util.List r4 = pq.v.e(r6)
            java.lang.Object r6 = vq.j.a(r6)
            r0.f134509d = r6
            java.lang.Object r6 = vq.j.a(r7)
            r0.f134510e = r6
            java.lang.Object r6 = vq.j.a(r8)
            r0.f134511f = r6
            java.lang.Object r6 = vq.j.a(r9)
            r0.f134512g = r6
            java.lang.Object r6 = vq.j.a(r2)
            r0.f134513h = r6
            r6 = 0
            r0.f134514j = r6
            r0.f134515k = r6
            r0.f134518n = r3
            java.lang.Object r9 = r5.Y(r7, r4, r8, r0)
            if (r9 != r1) goto Lb9
        Lb8:
            return r1
        Lb9:
            dx.i r9 = (dx.i) r9
            return r9
        Lbc:
            oq.p r6 = new oq.p
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nd4.k.E(gr0.r, rq0.b$b, k34.j, tq.e):java.lang.Object");
    }

    @Override // p34.a
    public Object F(tq.e<? super dx.i<? extends dx.b, o34.c>> eVar) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    dx.i<dx.b, String> iVarX0 = x0(((bj2.c) aVar.a(b1(rq0.b.d.DIIA_REFUGEE_CARD))).p());
                    if (!(iVarX0 instanceof dx.i.Left)) {
                        if (!(iVarX0 instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        iVarX0 = new dx.i.Right(dj2.a.c((RefugeeWrapped) this.jsonSerializer.a((String) ((dx.i.Right) iVarX0).b(), q0.n(RefugeeWrapped.class))));
                    }
                    return new dx.i.Right((o34.c) aVar.a(iVarX0));
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v7 */
    @Override // p34.a
    public Object G(rq0.b bVar, String str, tq.e<? super dx.i<? extends dx.b, ? extends er0.h>> eVar) throws Throwable {
        j jVar;
        Exception exc;
        ?? r15;
        Object objB;
        ex.c cVar;
        ex.b bVar2;
        if (eVar instanceof j) {
            jVar = (j) eVar;
            int i15 = jVar.f134590s;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                jVar.f134590s = i15 - PKIFailureInfo.systemUnavail;
            } else {
                jVar = new j(eVar);
            }
        } else {
            jVar = new j(eVar);
        }
        Object obj = jVar.f134588q;
        Object objE = uq.b.e();
        int i16 = jVar.f134590s;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        tq.i iVarN0 = g1.b().n0(z2.b(null, 1, null));
                        C3338k c3338k = new C3338k(bVar, aVar, str, null);
                        jVar.f134577d = vq.j.a(bVar);
                        jVar.f134578e = vq.j.a(str);
                        jVar.f134579f = jVarA;
                        jVar.f134580g = vq.j.a(aVar);
                        jVar.f134581h = vq.j.a(aVar);
                        jVar.f134582j = aVar;
                        jVar.f134583k = 0;
                        jVar.f134584l = 0;
                        jVar.f134585m = 0;
                        jVar.f134586n = 0;
                        jVar.f134587p = 0;
                        jVar.f134590s = 1;
                        Object objG = ju.i.g(iVarN0, c3338k, jVar);
                        if (objG == objE) {
                            return objE;
                        }
                        obj = objG;
                        bVar2 = aVar;
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
                    bVar2 = (ex.b) jVar.f134582j;
                    try {
                        oq.u.b(obj);
                    } catch (ex.c e18) {
                        cVar = e18;
                        return new dx.i.Left((dx.b) ex.d.a(cVar));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new dx.i.Right((er0.h) bVar2.a((dx.i) obj));
            } catch (CancellationException e25) {
                throw e25;
            }
        } catch (Exception e26) {
            exc = e26;
            r15 = str;
        }
    }

    @Override // p34.a
    public Object H(String str, byte[] bArr, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return ju.i.g(g1.b(), new c0(str, bArr, null), eVar);
    }

    @Override // p34.a
    public Object I(rq0.b.EnumC4479b enumC4479b, tq.e<? super dx.i<? extends dx.b, DynamicDocumentDataContainer>> eVar) {
        Object left;
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        Throwable e15 = null;
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    dx.i<dx.b, String> iVarX0 = x0((byte[]) aVar.a(V0(this, enumC4479b, null, 2, null)));
                    if (!(iVarX0 instanceof dx.i.Left)) {
                        if (!(iVarX0 instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        iVarX0 = new dx.i.Right(gr0.c.a(gr0.c.b(iy.c0.g((String) ((dx.i.Right) iVarX0).b()))));
                    }
                    iy.b0 data = ((gr0.c) aVar.a(iVarX0)).getData();
                    byte[] bArrX0 = X0(this, enumC4479b, null, 2, null);
                    if (bArrX0 == null) {
                        aVar.b(new dx.b.Generic(new Exception("Document data not available")));
                        throw new oq.g();
                    }
                    try {
                        left = new dx.i.Right(new DynamicDocumentDataContainer(nr0.f.b((DynamicDocumentSchemaContainerDto) this.jsonWithNullCheck.a(new String((byte[]) aVar.a(iy.a.a(this.base64Coder, bArrX0, null, 2, null)), fu.d.UTF_8), q0.n(DynamicDocumentSchemaContainerDto.class))), data, null));
                        if (left instanceof dx.i.Left) {
                            dx.b bVar = (dx.b) ((dx.i.Left) left).b();
                            px.d dVar = this.remoteLogger;
                            String str = "Error reading " + enumC4479b.name() + " domainError: " + bVar;
                            if (bVar instanceof dx.b.Parsing) {
                                e15 = ((dx.b.Parsing) bVar).getE();
                            } else {
                                dx.b.Generic generic = bVar instanceof dx.b.Generic ? (dx.b.Generic) bVar : null;
                                if (generic != null) {
                                    e15 = generic.getE();
                                }
                            }
                            dVar.T6(str, e15, px.c.a(this));
                        }
                        return left;
                    } catch (com.google.gson.p e16) {
                        aVar.b(new dx.b.Parsing(e16));
                        throw new oq.g();
                    }
                } catch (Exception e17) {
                    px.f fVar = px.f.f163100a;
                    String message = e17.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e17, px.c.a(jVarA));
                    Object objA = jVarA.a(e17);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    left = new dx.i.Left(objB);
                }
            } catch (ex.c e18) {
                left = new dx.i.Left((dx.b) ex.d.a(e18));
            } catch (CancellationException e19) {
                throw e19;
            }
        } catch (CancellationException e25) {
            throw e25;
        }
    }

    @Override // p34.a
    public dx.i<dx.b, DynamicMultiDocumentFullDataContainer> J(rq0.b.c dynamicMultiDocumentType) throws Exception {
        MultiDocumentSchema multiDocumentSchema;
        rq0.b.c cVar;
        String str;
        try {
            dx.i iVarF1 = f1(dynamicMultiDocumentType);
            if (iVarF1 instanceof dx.i.Left) {
                return iVarF1;
            }
            if (!(iVarF1 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            Map map = (Map) ((dx.i.Right) iVarF1).b();
            dx.i iVarG1 = g1(dynamicMultiDocumentType);
            if (iVarG1 instanceof dx.i.Left) {
                return iVarG1;
            }
            if (!(iVarG1 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            Map map2 = (Map) ((dx.i.Right) iVarG1).b();
            Set<String> setR0 = pq.v.r0(map.keySet(), map2.keySet());
            ArrayList arrayList = new ArrayList();
            for (String str2 : setR0) {
                DynamicMultiDocumentSchemaContainer dynamicMultiDocumentSchemaContainer = (DynamicMultiDocumentSchemaContainer) map2.get(str2);
                DynamicDocument dynamicDocument = null;
                if (dynamicMultiDocumentSchemaContainer == null || (str = (String) map.get(str2)) == null) {
                    cVar = dynamicMultiDocumentType;
                } else {
                    cVar = dynamicMultiDocumentType;
                    dynamicDocument = new DynamicDocument(str2, cVar, dynamicMultiDocumentSchemaContainer.getSchema(), gr0.c.b(iy.c0.g(str)), dynamicMultiDocumentSchemaContainer.getExpirationDate(), null);
                }
                if (dynamicDocument != null) {
                    arrayList.add(dynamicDocument);
                }
                dynamicMultiDocumentType = cVar;
            }
            rq0.b.c cVar2 = dynamicMultiDocumentType;
            DynamicMultiDocumentSchemaContainer dynamicMultiDocumentSchemaContainer2 = (DynamicMultiDocumentSchemaContainer) pq.v.m0(map2.values());
            if (dynamicMultiDocumentSchemaContainer2 != null && (multiDocumentSchema = dynamicMultiDocumentSchemaContainer2.getMultiDocumentSchema()) != null) {
                return !arrayList.isEmpty() ? new dx.i.Right(new DynamicMultiDocumentFullDataContainer(cVar2.getReferenceName(), arrayList, multiDocumentSchema)) : new dx.i.Left(new dx.b.Generic(new Exception("getDynamicMultiDocumentFullDataContainer")));
            }
            return new dx.i.Left(new dx.b.Generic(new Exception("MultiDocumentSchema cannot be null")));
        } catch (Exception e15) {
            if (e15 instanceof CancellationException) {
                throw e15;
            }
            return new dx.i.Left(new dx.b.Generic(new Exception("getDynamicMultiDocumentFullDataContainer")));
        }
    }

    @Override // p34.a
    public Object K(k34.i iVar, tq.e<? super i0> eVar) {
        Object objF = this.documentContainerChangedResult.F(iVar, eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    @Override // p34.a
    public Object L(final String str, final boolean z15, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    L1(this, false, rq0.b.d.DRIVING_LICENCE, new er.q() { // from class: nd4.d
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return k.M1(z15, this, str, (ex.b) obj, (bj2.c) obj2, (DocumentCertsSet) obj3);
                        }
                    }, 1, null);
                    return new dx.i.Right(i0.f148189a);
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

    @Override // p34.a
    public Object M(rq0.b.EnumC4479b enumC4479b, String str, tq.e<? super dx.i<? extends dx.b, String>> eVar) {
        dx.i<dx.b, byte[]> iVarE1 = e1(enumC4479b, str);
        if (iVarE1 instanceof dx.i.Left) {
            return iVarE1;
        }
        if (!(iVarE1 instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return new dx.i.Right(iy.a.e(this.base64Coder, (byte[]) ((dx.i.Right) iVarE1).b(), null, 2, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [nd4.k] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v2, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    @Override // p34.a
    public Object N(String str, boolean z15, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        f0 f0Var;
        Object objB;
        dx.j<dx.b> jVarA;
        ex.c e15;
        final ?? r15;
        if (eVar instanceof f0) {
            f0Var = (f0) eVar;
            int i15 = f0Var.f134542r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                f0Var.f134542r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                f0Var = new f0(eVar);
            }
        } else {
            f0Var = new f0(eVar);
        }
        Object obj = f0Var.f134540p;
        Object objE = uq.b.e();
        int i16 = f0Var.f134542r;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        r15 = str;
                        if (z15) {
                            rq0.b.d dVar = rq0.b.d.DIIA_REFUGEE_CHILD_CARD;
                            f0Var.f134530d = str;
                            f0Var.f134531e = jVarA;
                            f0Var.f134532f = vq.j.a(aVar);
                            f0Var.f134533g = vq.j.a(aVar);
                            f0Var.f134534h = z15;
                            f0Var.f134535j = 0;
                            f0Var.f134536k = 0;
                            f0Var.f134537l = 0;
                            f0Var.f134538m = 0;
                            f0Var.f134539n = 0;
                            f0Var.f134542r = 1;
                            if (W(dVar, f0Var) == objE) {
                                r15 = str;
                                return objE;
                            }
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
                    dx.j<dx.b> jVar = (dx.j) f0Var.f134531e;
                    String str2 = (String) f0Var.f134530d;
                    try {
                        oq.u.b(obj);
                        jVarA = jVar;
                        r15 = str2;
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                r15 = str;
                J1(true, rq0.b.d.DIIA_REFUGEE_CHILD_CARD, new er.q() { // from class: nd4.g
                    @Override // er.q
                    public final Object w(Object obj2, Object obj3, Object obj4) {
                        return k.P1(this.f134427a, r15, (ex.b) obj2, (bj2.c) obj3, (DocumentCertsSet) obj4);
                    }
                });
                return new dx.i.Right(i0.f148189a);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    @Override // p34.a
    public dx.i<dx.b, List<k34.g0>> O() {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    try {
                        HashMap<String, byte[]> mapC = ((bj2.c) aVar.a(b1(rq0.b.d.VEHICLE_CARD))).C();
                        ArrayList arrayList = new ArrayList(mapC.size());
                        Iterator<Map.Entry<String, byte[]>> it = mapC.entrySet().iterator();
                        while (it.hasNext()) {
                            dx.i<dx.b, String> iVarX0 = x0(((ai2.a) this.jsonSerializer.a(new String(it.next().getValue(), fu.d.UTF_8), q0.n(ai2.a.class))).a());
                            if (!(iVarX0 instanceof dx.i.Left)) {
                                if (!(iVarX0 instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                iVarX0 = new dx.i.Right(ai2.b.f((ri2.f) this.jsonSerializer.a((String) ((dx.i.Right) iVarX0).b(), q0.n(ri2.f.class)), this.vehicleCategoryMapper));
                            }
                            if (iVarX0 instanceof dx.i.Left) {
                                aVar.b(new dx.b.Generic(new Exception("Document data not available")));
                                throw new oq.g();
                            }
                            if (!(iVarX0 instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            arrayList.add((k34.g0) ((dx.i.Right) iVarX0).b());
                        }
                        return new dx.i.Right(arrayList);
                    } catch (Exception e15) {
                        this.remoteLogger.T6("Error reading VEHICLE data: " + e15, e15, px.c.a(aVar));
                        aVar.b(new dx.b.Generic(e15));
                        throw new oq.g();
                    }
                } catch (Exception e16) {
                    px.f fVar = px.f.f163100a;
                    String message = e16.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e16, px.c.a(jVarA));
                    Object objA = jVarA.a(e16);
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
            } catch (ex.c e17) {
                return new dx.i.Left((dx.b) ex.d.a(e17));
            } catch (CancellationException e18) {
                throw e18;
            }
        } catch (CancellationException e19) {
            throw e19;
        }
    }

    @Override // p34.a
    public dx.i<dx.b, AdvocateDataModel> P() {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    dx.i<dx.b, byte[]> iVarU0 = U0(rq0.b.d.ADVOCATE_CARD, "AdvocateData_Scope_Zero");
                    if (!(iVarU0 instanceof dx.i.Left)) {
                        if (!(iVarU0 instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        try {
                            iVarU0 = new dx.i.Right(wh2.b.b((AdvocateData) this.jsonSerializer.a((String) aVar.a(x0((byte[]) ((dx.i.Right) iVarU0).b())), q0.n(AdvocateData.class))));
                        } catch (Exception unused) {
                            throw new Exception("Document data not available");
                        }
                    }
                    return new dx.i.Right((AdvocateDataModel) aVar.a(iVarU0));
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

    @Override // p34.a
    public dx.i<dx.b, DrivingLicenceScopes> Q() {
        Object objB;
        ArrayList arrayList;
        ArrayList arrayList2;
        Collection<byte[]> collectionValues;
        CMSTypedData signedContent;
        CMSTypedData signedContent2;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    try {
                        bj2.c cVar = (bj2.c) aVar.a(b1(rq0.b.d.DRIVING_LICENCE));
                        byte[] bArrL = cVar.l();
                        byte[] bArr = (byte[]) ((bArrL == null || (signedContent2 = new CMSSignedData(bArrL).getSignedContent()) == null) ? null : signedContent2.getContent());
                        byte[] bArrG = cVar.g();
                        byte[] bArr2 = (byte[]) ((bArrG == null || (signedContent = new CMSSignedData(bArrG).getSignedContent()) == null) ? null : signedContent.getContent());
                        HashMap<String, byte[]> mapQ = cVar.q();
                        if (mapQ == null || (collectionValues = mapQ.values()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList();
                            Iterator<T> it = collectionValues.iterator();
                            while (it.hasNext()) {
                                CMSTypedData signedContent3 = new CMSSignedData((byte[]) it.next()).getSignedContent();
                                byte[] bArr3 = (byte[]) (signedContent3 != null ? signedContent3.getContent() : null);
                                if (bArr3 != null) {
                                    arrayList.add(bArr3);
                                }
                            }
                        }
                        DrivingLicenceScope drivingLicenceScopeC = bArr != null ? t34.a.c((DrivingLicenceScopeDto) this.jsonSerializer.a(new String(bArr, fu.d.UTF_8), q0.n(DrivingLicenceScopeDto.class))) : null;
                        DrivingLicenceScope drivingLicenceScopeC2 = bArr2 != null ? t34.a.c((DrivingLicenceScopeDto) this.jsonSerializer.a(new String(bArr2, fu.d.UTF_8), q0.n(DrivingLicenceScopeDto.class))) : null;
                        if (arrayList != null) {
                            arrayList2 = new ArrayList();
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                DrivingLicenceScope drivingLicenceScopeC3 = t34.a.c((DrivingLicenceScopeDto) this.jsonSerializer.a(new String((byte[]) it4.next(), fu.d.UTF_8), q0.n(DrivingLicenceScopeDto.class)));
                                if (drivingLicenceScopeC3 != null) {
                                    arrayList2.add(drivingLicenceScopeC3);
                                }
                            }
                        } else {
                            arrayList2 = null;
                        }
                        return new dx.i.Right(new DrivingLicenceScopes(drivingLicenceScopeC, drivingLicenceScopeC2, arrayList2, null));
                    } catch (Exception e15) {
                        if (e15 instanceof CancellationException) {
                            throw e15;
                        }
                        this.remoteLogger.T6("Error reading DRIVING_LICENCE data", e15, px.c.a(aVar));
                        return new dx.i.Left(new dx.b.Generic(e15));
                    }
                } catch (CancellationException e16) {
                    throw e16;
                }
            } catch (ex.c e17) {
                return new dx.i.Left((dx.b) ex.d.a(e17));
            } catch (CancellationException e18) {
                throw e18;
            }
        } catch (Exception e19) {
            px.f fVar = px.f.f163100a;
            String message = e19.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e19, px.c.a(jVarA));
            Object objA = jVarA.a(e19);
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

    @Override // p34.a
    public dx.i<dx.b, String> R(int bundleId) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    return new dx.i.Right(iy.a.e(this.base64Coder, ((bj2.c) new ex.a().a(Z0(bundleId))).p(), null, 2, null));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
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
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    @Override // p34.a
    public dx.i<dx.b, i0> S() {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    try {
                        Object objA = aVar.a(b1(rq0.b.d.VEHICLE_CARD));
                        bj2.c cVar = (bj2.c) objA;
                        cVar.C().clear();
                        cVar.c();
                        return new dx.i.Right(i0.f148189a);
                    } catch (Exception e15) {
                        this.remoteLogger.T6("Error deleting VEHICLE data: " + e15, e15, px.c.a(aVar));
                        aVar.b(new dx.b.Generic(e15));
                        throw new oq.g();
                    }
                } catch (Exception e16) {
                    px.f fVar = px.f.f163100a;
                    String message = e16.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e16, px.c.a(jVarA));
                    Object objA2 = jVarA.a(e16);
                    if (objA2 instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA2).b());
                    } else {
                        if (!(objA2 instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) objA2).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e17) {
                return new dx.i.Left((dx.b) ex.d.a(e17));
            } catch (CancellationException e18) {
                throw e18;
            }
        } catch (CancellationException e19) {
            throw e19;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p34.a
    public Object T(k34.a0 a0Var, String str, tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f134523h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f134523h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objS1 = eVar2.f134521f;
        Object objE = uq.b.e();
        int i16 = eVar2.f134523h;
        if (i16 == 0) {
            oq.u.b(objS1);
            eVar2.f134519d = vq.j.a(a0Var);
            eVar2.f134520e = vq.j.a(str);
            eVar2.f134523h = 1;
            objS1 = s1(a0Var, str, eVar2);
            if (objS1 == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objS1);
        }
        dx.i iVar = (dx.i) objS1;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return new dx.i.Right(iy.a.e(this.base64Coder, (byte[]) ((dx.i.Right) iVar).b(), null, 2, null));
    }

    @Override // p34.a
    public Object U(tq.e<? super dx.i<? extends dx.b, NipipScope>> eVar) {
        return q1(rq0.b.d.MIDWIFE_CARD);
    }

    @Override // p34.a
    public Object V(final String str, final rq0.b bVar, final k34.j jVar, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    L1(this, false, bVar, new er.q() { // from class: nd4.e
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return k.H1(jVar, bVar, this, str, (ex.b) obj, (bj2.c) obj2, (DocumentCertsSet) obj3);
                        }
                    }, 1, null);
                    return new dx.i.Right(i0.f148189a);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
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
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    @Override // p34.a
    public Object W(rq0.b bVar, tq.e<? super i0> eVar) {
        if ((bVar instanceof rq0.b.d) || (bVar instanceof rq0.b.e)) {
            D0(pl.gov.coi.mobywatel.feature.legacy.storage.n.a(bVar));
        } else if (bVar instanceof rq0.b.EnumC4479b) {
            rq0.b.EnumC4479b enumC4479b = (rq0.b.EnumC4479b) bVar;
            B0(enumC4479b, enumC4479b.getReferenceName());
        } else {
            if (!(bVar instanceof rq0.b.c)) {
                throw new oq.p();
            }
            C0((rq0.b.c) bVar);
        }
        Object objK = K(new k34.i.DeletedByType(bVar), eVar);
        return objK == uq.b.e() ? objK : i0.f148189a;
    }

    @Override // p34.a
    public dx.i<dx.b, StudentCardDocumentData> X() {
        Object objB;
        Object objB2;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    try {
                        dx.i<dx.b, char[]> iVarC = this.bytesConverter.c((byte[]) new CMSSignedData(((bj2.c) aVar.a(b1(rq0.b.d.STUDENT_CARD))).p()).getSignedContent().getContent(), new iy.b.Standard(null, 1, null));
                        if (iVarC instanceof dx.i.Left) {
                            objB2 = new char[0];
                        } else {
                            if (!(iVarC instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB2 = ((dx.i.Right) iVarC).b();
                        }
                        return new dx.i.Right(di2.b.b((di2.a) this.jsonSerializer.a(new String((char[]) objB2), q0.n(di2.a.class))));
                    } catch (Exception e15) {
                        if (e15 instanceof CancellationException) {
                            throw e15;
                        }
                        this.remoteLogger.T6("Error reading STUDENT_CARD data: " + e15, e15, px.c.a(aVar));
                        aVar.b(new dx.b.Generic(e15));
                        throw new oq.g();
                    }
                } catch (CancellationException e16) {
                    throw e16;
                }
            } catch (ex.c e17) {
                return new dx.i.Left((dx.b) ex.d.a(e17));
            } catch (CancellationException e18) {
                throw e18;
            }
        } catch (Exception e19) {
            px.f fVar = px.f.f163100a;
            String message = e19.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e19, px.c.a(jVarA));
            Object objA = jVarA.a(e19);
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

    @Override // p34.a
    public Object Y(rq0.b bVar, List<DynamicDocument> list, k34.j jVar, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        Object objB;
        Object dynamicDocumentSchemaContainerDto;
        List arrayList;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    if (list.isEmpty()) {
                        aVar.b(new dx.b.Generic(new Exception("DynamicSchemaDocument error: documents list is empty")));
                        throw new oq.g();
                    }
                    bj2.c cVar = (bj2.c) aVar.a(b1(bVar));
                    if (jVar instanceof k34.j.d) {
                        aVar.b(new dx.b.Generic(new Exception("Saving error: wrong documentDataSaveMode for " + bVar)));
                        throw new oq.g();
                    }
                    if (jVar instanceof k34.j.AsyncMultiDocument) {
                        if (((k34.j.AsyncMultiDocument) jVar).getOverride()) {
                            List<DynamicDocument> list2 = list;
                            arrayList = new ArrayList(pq.v.y(list2, 10));
                            for (DynamicDocument dynamicDocument : list2) {
                                String documentId = dynamicDocument.getDocumentId();
                                DocumentSchemaDtoDto documentSchemaDtoDtoH = nr0.d.H(dynamicDocument.getSchema());
                                fz.b.LocalDate expirationDate = dynamicDocument.getExpirationDate();
                                arrayList.add(new DynamicDocumentSchemaContainerDto(documentId, documentSchemaDtoDtoH, expirationDate != null ? expirationDate.getDate() : null));
                            }
                        } else {
                            byte[] bArr = cVar.m().get(bVar.getReferenceName());
                            DynamicDocumentSchemaListContainerDto dynamicDocumentSchemaListContainerDto = bArr != null ? (DynamicDocumentSchemaListContainerDto) this.jsonWithNullCheck.a(new String((byte[]) aVar.a(iy.a.a(this.base64Coder, bArr, null, 2, null)), fu.d.UTF_8), q0.n(DynamicDocumentSchemaListContainerDto.class)) : null;
                            List<DynamicDocument> list3 = list;
                            ArrayList arrayList2 = new ArrayList(pq.v.y(list3, 10));
                            for (DynamicDocument dynamicDocument2 : list3) {
                                String documentId2 = dynamicDocument2.getDocumentId();
                                DocumentSchemaDtoDto documentSchemaDtoDtoH2 = nr0.d.H(dynamicDocument2.getSchema());
                                fz.b.LocalDate expirationDate2 = dynamicDocument2.getExpirationDate();
                                arrayList2.add(new DynamicDocumentSchemaContainerDto(documentId2, documentSchemaDtoDtoH2, expirationDate2 != null ? expirationDate2.getDate() : null));
                            }
                            List listI1 = pq.v.i1(arrayList2);
                            if (dynamicDocumentSchemaListContainerDto != null) {
                                listI1.addAll(dynamicDocumentSchemaListContainerDto.getSchemas());
                            }
                            arrayList = listI1;
                        }
                        dynamicDocumentSchemaContainerDto = new DynamicDocumentSchemaListContainerDto(arrayList);
                    } else {
                        if (!(jVar instanceof k34.j.AsyncById) && !(jVar instanceof k34.j.a)) {
                            throw new oq.p();
                        }
                        DynamicDocument dynamicDocument3 = (DynamicDocument) pq.v.l0(list);
                        String documentId3 = dynamicDocument3.getDocumentId();
                        DocumentSchemaDtoDto documentSchemaDtoDtoH3 = nr0.d.H(dynamicDocument3.getSchema());
                        fz.b.LocalDate expirationDate3 = dynamicDocument3.getExpirationDate();
                        dynamicDocumentSchemaContainerDto = new DynamicDocumentSchemaContainerDto(documentId3, documentSchemaDtoDtoH3, expirationDate3 != null ? expirationDate3.getDate() : null);
                    }
                    String strB = this.jsonSerializer.b(dynamicDocumentSchemaContainerDto, q0.n(Object.class));
                    iy.a aVar2 = this.base64Coder;
                    Charset charset = fu.d.UTF_8;
                    byte[] bytes = iy.a.e(aVar2, strB.getBytes(charset), null, 2, null).getBytes(charset);
                    String documentIID = jVar instanceof k34.j.AsyncById ? ((k34.j.AsyncById) jVar).getDocumentIID() : bVar.getReferenceName();
                    HashMap<String, byte[]> mapM = cVar.m();
                    if (mapM != null) {
                        mapM.put(documentIID, bytes);
                    } else {
                        mapM = v0.k(oq.y.a(documentIID, bytes));
                    }
                    cVar.J(mapM);
                    cVar.c();
                    return new dx.i.Right(i0.f148189a);
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

    @Override // p34.a
    public Object Z(rq0.b.EnumC4479b enumC4479b, tq.e<? super dx.i<? extends dx.b, ? extends List<DynamicDocumentDataContainer>>> eVar) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    Map map = (Map) aVar.a(T0(enumC4479b));
                    ArrayList arrayList = new ArrayList();
                    Iterator it = map.entrySet().iterator();
                    while (true) {
                        oq.r rVarA = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        try {
                            Object key = entry.getKey();
                            Object objA = this.jsonSerializer.a(new String((byte[]) entry.getValue(), fu.d.UTF_8), q0.n(DocumentByIdContainerDto.class));
                            if (!vq.b.a(fr.t.c(((DocumentByIdContainerDto) objA).getDocumentType(), enumC4479b.getReferenceName())).booleanValue()) {
                                objA = null;
                            }
                            DocumentByIdContainerDto documentByIdContainerDto = (DocumentByIdContainerDto) objA;
                            if (documentByIdContainerDto != null) {
                                rVarA = oq.y.a(key, documentByIdContainerDto);
                            }
                        } catch (com.google.gson.p unused) {
                        }
                        if (rVarA != null) {
                            arrayList.add(rVarA);
                        }
                    }
                    Map mapS = v0.s(arrayList);
                    ArrayList arrayList2 = new ArrayList(mapS.size());
                    for (Map.Entry entry2 : mapS.entrySet()) {
                        String str = (String) entry2.getKey();
                        dx.i<dx.b, String> iVarX0 = x0((byte[]) aVar.a(iy.a.c(this.base64Coder, ((DocumentByIdContainerDto) entry2.getValue()).getScope(), null, 2, null)));
                        if (!(iVarX0 instanceof dx.i.Left)) {
                            if (!(iVarX0 instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            iVarX0 = new dx.i.Right(gr0.c.a(gr0.c.b(iy.c0.g((String) ((dx.i.Right) iVarX0).b()))));
                        }
                        iy.b0 data = ((gr0.c) aVar.a(iVarX0)).getData();
                        byte[] bArrW0 = W0(enumC4479b, str);
                        if (bArrW0 == null) {
                            aVar.b(new dx.b.Generic(new Exception("Document " + enumC4479b + " data not available")));
                            throw new oq.g();
                        }
                        try {
                            arrayList2.add(new DynamicDocumentDataContainer(nr0.f.b((DynamicDocumentSchemaContainerDto) this.jsonWithNullCheck.a(new String((byte[]) aVar.a(iy.a.a(this.base64Coder, bArrW0, null, 2, null)), fu.d.UTF_8), q0.n(DynamicDocumentSchemaContainerDto.class))), data, null));
                        } catch (com.google.gson.p e15) {
                            aVar.b(new dx.b.Parsing(e15));
                            throw new oq.g();
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        return new dx.i.Right(arrayList2);
                    }
                    aVar.b(new dx.b.Generic(new Exception("Document " + enumC4479b + " data not available")));
                    throw new oq.g();
                } catch (CancellationException e16) {
                    throw e16;
                }
            } catch (ex.c e17) {
                return new dx.i.Left((dx.b) ex.d.a(e17));
            } catch (CancellationException e18) {
                throw e18;
            }
        } catch (Exception e19) {
            px.f fVar = px.f.f163100a;
            String message = e19.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e19, px.c.a(jVarA));
            Object objA2 = jVarA.a(e19);
            if (objA2 instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA2).b());
            } else {
                if (!(objA2 instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA2).b();
            }
            return new dx.i.Left(objB);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r14 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014f, code lost:
    
        if (r14 == r1) goto L66;
     */
    @Override // p34.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(tq.e<? super dx.i<? extends dx.b, k34.UserDocumentData>> r14) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nd4.k.a(tq.e):java.lang.Object");
    }

    @Override // p34.a
    public Object a0(final String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    L1(this, false, rq0.b.d.FAMILY_CARD, new er.q() { // from class: nd4.c
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return k.O1(this.f134415a, str, (ex.b) obj, (bj2.c) obj2, (DocumentCertsSet) obj3);
                        }
                    }, 1, null);
                    return new dx.i.Right(i0.f148189a);
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

    @Override // p34.a
    public Object b(tq.e<? super dx.i<? extends dx.b, ? extends List<String>>> eVar) {
        return ju.i.g(g1.b(), new d(null), eVar);
    }

    @Override // p34.a
    public Object b0(tq.e<? super dx.i<? extends dx.b, ? extends Map<String, RailwayCardDocumentData>>> eVar) {
        dx.i<dx.b, Map<String, byte[]>> iVarT0 = T0(rq0.b.d.RAILWAY_CARD);
        if (iVarT0 instanceof dx.i.Left) {
            return iVarT0;
        }
        if (!(iVarT0 instanceof dx.i.Right)) {
            throw new oq.p();
        }
        Set<Map.Entry> setEntrySet = ((Map) ((dx.i.Right) iVarT0).b()).entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(v0.e(pq.v.y(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            dx.i<dx.b, String> iVarX0 = x0((byte[]) entry.getValue());
            if (!(iVarX0 instanceof dx.i.Right)) {
                if (iVarX0 instanceof dx.i.Left) {
                    return new dx.i.Left(((dx.i.Left) iVarX0).b());
                }
                throw new oq.p();
            }
            oq.r rVarA = oq.y.a(entry.getKey(), ei2.b.c((RailwayCardWrapped) this.jsonSerializer.a((String) ((dx.i.Right) iVarX0).b(), q0.n(RailwayCardWrapped.class))));
            linkedHashMap.put(rVarA.c(), rVarA.d());
        }
        return new dx.i.Right(linkedHashMap);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p34.a
    public Object c(tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        x xVar;
        su.a aVar;
        if (eVar instanceof x) {
            xVar = (x) eVar;
            int i15 = xVar.f134733h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                xVar.f134733h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                xVar = new x(eVar);
            }
        } else {
            xVar = new x(eVar);
        }
        Object obj = xVar.f134731f;
        Object objE = uq.b.e();
        int i16 = xVar.f134733h;
        if (i16 == 0) {
            oq.u.b(obj);
            aVar = this.childPassportApplicationDraftMutex;
            xVar.f134729d = aVar;
            xVar.f134730e = 0;
            xVar.f134733h = 1;
            if (aVar.h(null, xVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            su.a aVar2 = (su.a) xVar.f134729d;
            oq.u.b(obj);
            aVar = aVar2;
        }
        try {
            return K1(this, false, aj2.a.CHILD_PASSPORT_APPLICATION, new er.q() { // from class: nd4.i
                @Override // er.q
                public final Object w(Object obj2, Object obj3, Object obj4) {
                    return k.D1((ex.b) obj2, (bj2.c) obj3, (DocumentCertsSet) obj4);
                }
            }, 1, null);
        } finally {
            aVar.r(null);
        }
    }

    @Override // p34.a
    public Object c0(tq.e<? super dx.i<? extends dx.b, ? extends Map<String, FamilyDataModel>>> eVar) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    try {
                        HashMap<String, byte[]> mapO = ((bj2.c) aVar.a(b1(rq0.b.d.FAMILY_CARD))).o();
                        ArrayList arrayList = new ArrayList(mapO.size());
                        for (Map.Entry<String, byte[]> entry : mapO.entrySet()) {
                            String key = entry.getKey();
                            dx.i<dx.b, String> iVarX0 = x0(entry.getValue());
                            if (!(iVarX0 instanceof dx.i.Left)) {
                                if (!(iVarX0 instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                iVarX0 = new dx.i.Right(oq.y.a(key, zh2.b.b((FamilyData) this.jsonSerializer.a((String) ((dx.i.Right) iVarX0).b(), q0.n(FamilyData.class)))));
                            }
                            arrayList.add((oq.r) aVar.a(iVarX0));
                        }
                        return new dx.i.Right(v0.s(arrayList));
                    } catch (Exception e15) {
                        if (e15 instanceof CancellationException) {
                            throw e15;
                        }
                        this.remoteLogger.T6("Error reading FAMILY_CARD data: " + e15, e15, px.c.a(aVar));
                        aVar.b(new dx.b.Generic(e15));
                        throw new oq.g();
                    }
                } catch (CancellationException e16) {
                    throw e16;
                }
            } catch (ex.c e17) {
                return new dx.i.Left((dx.b) ex.d.a(e17));
            } catch (CancellationException e18) {
                throw e18;
            }
        } catch (Exception e19) {
            px.f fVar = px.f.f163100a;
            String message = e19.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e19, px.c.a(jVarA));
            Object objA = jVarA.a(e19);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:88:0x0279 A[Catch: Exception -> 0x0266, c -> 0x0269, CancellationException -> 0x026c, TryCatch #10 {c -> 0x0269, CancellationException -> 0x026c, Exception -> 0x0266, blocks: (B:78:0x0258, B:79:0x0265, B:86:0x026f, B:88:0x0279, B:90:0x027d, B:94:0x0292, B:95:0x029a, B:91:0x0283, B:92:0x0288, B:93:0x0289), top: B:120:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x027d A[Catch: Exception -> 0x0266, c -> 0x0269, CancellationException -> 0x026c, TryCatch #10 {c -> 0x0269, CancellationException -> 0x026c, Exception -> 0x0266, blocks: (B:78:0x0258, B:79:0x0265, B:86:0x026f, B:88:0x0279, B:90:0x027d, B:94:0x0292, B:95:0x029a, B:91:0x0283, B:92:0x0288, B:93:0x0289), top: B:120:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0283 A[Catch: Exception -> 0x0266, c -> 0x0269, CancellationException -> 0x026c, TryCatch #10 {c -> 0x0269, CancellationException -> 0x026c, Exception -> 0x0266, blocks: (B:78:0x0258, B:79:0x0265, B:86:0x026f, B:88:0x0279, B:90:0x027d, B:94:0x0292, B:95:0x029a, B:91:0x0283, B:92:0x0288, B:93:0x0289), top: B:120:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0289 A[Catch: Exception -> 0x0266, c -> 0x0269, CancellationException -> 0x026c, TryCatch #10 {c -> 0x0269, CancellationException -> 0x026c, Exception -> 0x0266, blocks: (B:78:0x0258, B:79:0x0265, B:86:0x026f, B:88:0x0279, B:90:0x027d, B:94:0x0292, B:95:0x029a, B:91:0x0283, B:92:0x0288, B:93:0x0289), top: B:120:0x0025 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r22v0, types: [nd4.k] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v4, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [T, java.util.List] */
    @Override // p34.a
    public Object d(String str, iy.b0 b0Var, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        b bVar;
        Object objB;
        ex.b aVar;
        ex.b bVar2;
        dx.i<dx.b, StudentCardDocumentData> iVarX;
        dx.j<dx.b> jVar;
        ex.b bVar3;
        dx.j<dx.b> jVar2;
        dx.i<Exception, dx.b.Business> iVarA;
        Object generic;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.H;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.H = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.F;
        Object objE = uq.b.e();
        ?? r15 = bVar.H;
        try {
            try {
                try {
                    try {
                        try {
                            if (r15 == 0) {
                                oq.u.b(obj);
                                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                                try {
                                    aVar = new ex.a();
                                    try {
                                        rq0.b.d dVar = rq0.b.d.STUDENT_CARD;
                                        aj2.a aVarA = pl.gov.coi.mobywatel.feature.legacy.storage.n.a(dVar);
                                        aj2.a aVarI = null;
                                        byte[] bArr = (byte[]) aVar.a(iy.a.c(this.base64Coder, str, null, 2, null));
                                        String strA0 = A0(bArr, iy.c0.e(b0Var));
                                        cj2.a aVarA2 = N0(dVar).a();
                                        fr.p0 p0Var = new fr.p0();
                                        p0Var.f66410a = pq.v.n();
                                        List<Integer> listA = I0().a();
                                        if (listA != null) {
                                            Iterator<Integer> it = listA.iterator();
                                            while (it.hasNext()) {
                                                int iIntValue = it.next().intValue();
                                                cj2.a aVarA3 = L0(iIntValue).a();
                                                if (aVarA3 != null) {
                                                    aVarI = aVarA3.i();
                                                }
                                                if (aVarI == aVarA || aVarI == aj2.a.TOZSAMOSC) {
                                                    if (!y1(iIntValue, strA0, aVarI)) {
                                                        throw new uh2.a(uh2.b.SCHOOL_ACTIVATION_DIFFERENT_REFRESHED_PESEL);
                                                    }
                                                    if (aVarI == aVarA && aVarA2 != null) {
                                                        ?? r16 = (List) R0(dVar).a();
                                                        if (r16 != 0) {
                                                            p0Var.f66410a = r16;
                                                        }
                                                        C1(iIntValue);
                                                    }
                                                }
                                                aVarI = null;
                                            }
                                        }
                                        cj2.a aVar2 = (cj2.a) aVar.a(i1(dVar, dVar));
                                        if (!((Collection) p0Var.f66410a).isEmpty()) {
                                            aVar2.o((List) p0Var.f66410a);
                                        }
                                        int iIntValue2 = ((Number) aVar.a(v1(aVar2))).intValue();
                                        bj2.c cVarL1 = l1(iIntValue2);
                                        bj2.b bVarK1 = k1(iIntValue2);
                                        B1(cVarL1, bVarK1, strA0);
                                        Q1(cVarL1, strA0);
                                        cVarL1.c();
                                        bVarK1.c();
                                        aVar.a(S1(iIntValue2));
                                        iVarX = X();
                                        if (iVarX instanceof dx.i.Left) {
                                            jVar2 = jVarA;
                                            bVar2 = aVar;
                                        } else {
                                            if (!(iVarX instanceof dx.i.Right)) {
                                                throw new oq.p();
                                            }
                                            StudentCardDocumentData studentCardDocumentData = (StudentCardDocumentData) ((dx.i.Right) iVarX).b();
                                            k34.i.Added added = new k34.i.Added(dVar, studentCardDocumentData.getDataHeader().getSerialNumber(), new fz.b.LocalDate(this.dateConverter.l(studentCardDocumentData.getExpireDate())), true);
                                            bVar.f134458d = vq.j.a(str);
                                            bVar.f134459e = vq.j.a(b0Var);
                                            bVar.f134460f = jVarA;
                                            bVar.f134461g = vq.j.a(aVar);
                                            bVar.f134462h = aVar;
                                            bVar.f134463j = vq.j.a(dVar);
                                            bVar.f134464k = vq.j.a(aVarA);
                                            bVar.f134465l = vq.j.a(bArr);
                                            bVar.f134466m = vq.j.a(strA0);
                                            bVar.f134467n = vq.j.a(aVarA2);
                                            bVar.f134468p = vq.j.a(p0Var);
                                            bVar.f134469q = vq.j.a(aVar2);
                                            bVar.f134470r = vq.j.a(cVarL1);
                                            bVar.f134471s = vq.j.a(bVarK1);
                                            bVar.f134472t = vq.j.a(iVarX);
                                            bVar.f134473v = vq.j.a(studentCardDocumentData);
                                            bVar.f134474w = aVar;
                                            bVar.f134475x = 0;
                                            bVar.f134476y = 0;
                                            bVar.f134477z = 0;
                                            bVar.A = 0;
                                            bVar.B = 0;
                                            bVar.C = iIntValue2;
                                            bVar.D = 0;
                                            bVar.E = 0;
                                            bVar.H = 1;
                                            if (K(added, bVar) == objE) {
                                                return objE;
                                            }
                                            jVar = jVarA;
                                            bVar3 = aVar;
                                            bVar2 = bVar3;
                                        }
                                        aVar.a(iVarX);
                                        return new dx.i.Right(i0.f148189a);
                                    } catch (uh2.a e15) {
                                        e = e15;
                                        bVar2 = aVar;
                                        iVarA = this.legacyExceptionParser.a(e);
                                        if (iVarA instanceof dx.i.Right) {
                                            generic = (dx.b) ((dx.i.Right) iVarA).b();
                                        } else {
                                            if (!(iVarA instanceof dx.i.Left)) {
                                                throw new oq.p();
                                            }
                                            generic = new dx.b.Generic(e);
                                        }
                                        bVar2.b(generic);
                                        throw new oq.g();
                                    } catch (Exception e16) {
                                        e = e16;
                                        bVar2 = aVar;
                                        bVar2.b(new dx.b.Generic(e));
                                        throw new oq.g();
                                    }
                                } catch (ex.c e17) {
                                    e = e17;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e18) {
                                    throw e18;
                                }
                            }
                            if (r15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar3 = (ex.b) bVar.f134474w;
                            bVar2 = (ex.b) bVar.f134462h;
                            jVar = (dx.j) bVar.f134460f;
                            try {
                                oq.u.b(obj);
                            } catch (uh2.a e19) {
                                e = e19;
                                iVarA = this.legacyExceptionParser.a(e);
                                if (iVarA instanceof dx.i.Right) {
                                    generic = (dx.b) ((dx.i.Right) iVarA).b();
                                } else {
                                    if (!(iVarA instanceof dx.i.Left)) {
                                        throw new oq.p();
                                    }
                                    generic = new dx.b.Generic(e);
                                }
                                bVar2.b(generic);
                                throw new oq.g();
                            } catch (Exception e25) {
                                e = e25;
                                bVar2.b(new dx.b.Generic(e));
                                throw new oq.g();
                            }
                            return new dx.i.Right(i0.f148189a);
                        } catch (ex.c e26) {
                            e = e26;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e27) {
                            throw e27;
                        } catch (Exception e28) {
                            e = e28;
                            r15 = jVar2;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(r15));
                            dx.i iVarA2 = r15.a(e);
                            if (iVarA2 instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA2).b());
                            } else {
                                if (!(iVarA2 instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA2).b();
                            }
                            return new dx.i.Left(objB);
                        }
                        aVar.a(iVarX);
                    } catch (uh2.a e29) {
                        e = e29;
                        iVarA = this.legacyExceptionParser.a(e);
                        if (iVarA instanceof dx.i.Right) {
                            generic = (dx.b) ((dx.i.Right) iVarA).b();
                        } else {
                            if (!(iVarA instanceof dx.i.Left)) {
                                throw new oq.p();
                            }
                            generic = new dx.b.Generic(e);
                        }
                        bVar2.b(generic);
                        throw new oq.g();
                    } catch (Exception e35) {
                        e = e35;
                        bVar2.b(new dx.b.Generic(e));
                        throw new oq.g();
                    }
                    dx.j<dx.b> jVar3 = jVar;
                    iVarX = new dx.i.Right(i0.f148189a);
                    jVar2 = jVar3;
                    aVar = bVar3;
                } catch (Exception e36) {
                    e = e36;
                }
            } catch (CancellationException e37) {
                throw e37;
            }
        } catch (ex.c e38) {
            e = e38;
        } catch (CancellationException e39) {
            throw e39;
        } catch (Exception e45) {
            e = e45;
            r15 = 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x018a A[Catch: Exception -> 0x020b, TRY_LEAVE, TryCatch #0 {Exception -> 0x020b, blocks: (B:71:0x0240, B:73:0x0246, B:49:0x0184, B:51:0x018a), top: B:91:0x0240 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x01de  */
    /* JADX WARN: Code duplicated, block: B:59:0x01f7 A[Catch: Exception -> 0x01fb, TryCatch #1 {Exception -> 0x01fb, blocks: (B:79:0x02ab, B:81:0x02b3, B:43:0x015f, B:45:0x0165, B:47:0x0170, B:57:0x01ef, B:59:0x01f7, B:67:0x0222, B:69:0x0228, B:84:0x02cf, B:85:0x02da), top: B:93:0x02ab }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0210 -> B:66:0x021c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0230 -> B:91:0x0240). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0299 -> B:93:0x02ab). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p34.a
    public java.lang.Object d0(rq0.b r23, tq.e<? super java.util.List<? extends rq0.b>> r24) {
        /*
            Method dump skipped, instruction units count: 771
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nd4.k.d0(rq0.b, tq.e):java.lang.Object");
    }

    @Override // p34.a
    public Object e(tq.e<? super dx.i<? extends dx.b, byte[]>> eVar) {
        return ju.i.g(g1.b(), new f(null), eVar);
    }

    @Override // p34.a
    public Object f(byte[] bArr, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return ju.i.g(g1.b(), new e0(bArr, null), eVar);
    }

    @Override // p34.a
    public Object g(rq0.b bVar, tq.e<? super Boolean> eVar) throws Exception {
        ArrayList arrayList;
        boolean zX1;
        if (bVar instanceof rq0.b.EnumC4479b) {
            return w1((rq0.b.EnumC4479b) bVar, eVar);
        }
        if (bVar instanceof rq0.b.c) {
            zX1 = x1((rq0.b.c) bVar);
        } else {
            List<cj2.a> listA = H0().a();
            if (listA != null) {
                arrayList = new ArrayList();
                for (Object obj : listA) {
                    if (((cj2.a) obj).i() == pl.gov.coi.mobywatel.feature.legacy.storage.n.a(bVar)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            zX1 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        }
        return vq.b.a(zX1);
    }

    @Override // p34.a
    public Object h(tq.e<? super dx.i<? extends dx.b, ? extends Map<Integer, o34.c>>> eVar) {
        Object objB;
        String strA;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    Iterable iterable = (Iterable) new ex.a().a(K0(rq0.b.d.DIIA_REFUGEE_CHILD_CARD));
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        bj2.c cVarA = Z0(iIntValue).a();
                        oq.r rVarA = null;
                        if (cVarA != null && (strA = x0(cVarA.p()).a()) != null) {
                            rVarA = oq.y.a(vq.b.e(iIntValue), dj2.a.c((RefugeeWrapped) this.jsonSerializer.a(strA, q0.n(RefugeeWrapped.class))));
                        }
                        if (rVarA != null) {
                            arrayList.add(rVarA);
                        }
                    }
                    return new dx.i.Right(v0.s(arrayList));
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

    /* JADX WARN: Code duplicated, block: B:259:0x0529  */
    /* JADX WARN: Code duplicated, block: B:280:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0222, code lost:
    
        if (r6 == r1) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0281, code lost:
    
        if (r6 == r1) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02b2, code lost:
    
        if (r6 == r1) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x030b, code lost:
    
        if (r6 == r1) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0357, code lost:
    
        if (r6 == r1) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03bc, code lost:
    
        if (r6 == r1) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r6 == r1) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d6, code lost:
    
        if (r6 == r1) goto L185;
     */
    @Override // p34.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(rq0.b r5, tq.e<? super java.util.List<java.lang.String>> r6) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nd4.k.i(rq0.b, tq.e):java.lang.Object");
    }

    @Override // p34.a
    public Object j(tq.e<? super List<? extends rq0.b>> eVar) {
        return ju.i.g(g1.b().n0(z2.b(null, 1, null)), new w(null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p34.a
    public Object k(byte[] bArr, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        a0 a0Var;
        su.a aVar;
        int i15;
        Throwable th4;
        su.a aVar2;
        if (eVar instanceof a0) {
            a0Var = (a0) eVar;
            int i16 = a0Var.f134457k;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                a0Var.f134457k = i16 - PKIFailureInfo.systemUnavail;
            } else {
                a0Var = new a0(eVar);
            }
        } else {
            a0Var = new a0(eVar);
        }
        Object obj = a0Var.f134455h;
        Object objE = uq.b.e();
        int i17 = a0Var.f134457k;
        try {
            if (i17 == 0) {
                oq.u.b(obj);
                aVar = this.childPassportApplicationDraftMutex;
                a0Var.f134451d = bArr;
                a0Var.f134452e = aVar;
                a0Var.f134453f = 0;
                a0Var.f134457k = 1;
                if (aVar.h(null, a0Var) != objE) {
                    i15 = 0;
                }
                return objE;
            }
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (su.a) a0Var.f134452e;
                try {
                    oq.u.b(obj);
                    dx.i iVar = (dx.i) obj;
                    aVar2.r(null);
                    return iVar;
                } catch (Throwable th5) {
                    th4 = th5;
                    aVar2.r(null);
                    throw th4;
                }
            }
            int i18 = a0Var.f134453f;
            su.a aVar3 = (su.a) a0Var.f134452e;
            byte[] bArr2 = (byte[]) a0Var.f134451d;
            oq.u.b(obj);
            aVar = aVar3;
            i15 = i18;
            bArr = bArr2;
            l0 l0VarB = g1.b();
            b0 b0Var = new b0(bArr, null);
            a0Var.f134451d = vq.j.a(bArr);
            a0Var.f134452e = aVar;
            a0Var.f134453f = i15;
            a0Var.f134454g = 0;
            a0Var.f134457k = 2;
            Object objG = ju.i.g(l0VarB, b0Var, a0Var);
            if (objG != objE) {
                su.a aVar4 = aVar;
                obj = objG;
                aVar2 = aVar4;
                dx.i iVar2 = (dx.i) obj;
                aVar2.r(null);
                return iVar2;
            }
            return objE;
        } catch (Throwable th6) {
            su.a aVar5 = aVar;
            th4 = th6;
            aVar2 = aVar5;
            aVar2.r(null);
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p34.a
    public Object l(tq.e<? super dx.i<? extends dx.b, PersonalDataScope9>> eVar) throws Exception {
        p pVar;
        if (eVar instanceof p) {
            pVar = (p) eVar;
            int i15 = pVar.f134662f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                pVar.f134662f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                pVar = new p(eVar);
            }
        } else {
            pVar = new p(eVar);
        }
        Object objC1 = pVar.f134660d;
        Object objE = uq.b.e();
        int i16 = pVar.f134662f;
        if (i16 == 0) {
            oq.u.b(objC1);
            k34.a0 a0Var = k34.a0.v.f107896a;
            pVar.f134662f = 1;
            objC1 = c1(a0Var, pVar);
            if (objC1 == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC1);
        }
        dx.i iVar = (dx.i) objC1;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        try {
            return new dx.i.Right(t34.d.k((PersonalDataScope9Dto) this.jsonSerializer.a((String) ((dx.i.Right) iVar).b(), q0.n(PersonalDataScope9Dto.class))));
        } catch (Exception e15) {
            if (e15 instanceof CancellationException) {
                throw e15;
            }
            px.f.f163100a.d("DocumentsRepositoryImpl error: getMIdCardData()", e15, px.c.a(this));
            return new dx.i.Left(new dx.b.Generic(e15));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [dx.j, java.lang.Object] */
    @Override // p34.a
    public Object m(String str, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar) throws Throwable {
        g gVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f134554q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f134554q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object obj = gVar.f134552n;
        Object objE = uq.b.e();
        int i16 = gVar.f134554q;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l0 l0VarB = g1.b();
                        h hVar = new h(aVar, this, str, null);
                        gVar.f134543d = vq.j.a(str);
                        gVar.f134544e = jVarA;
                        gVar.f134545f = vq.j.a(aVar);
                        gVar.f134546g = vq.j.a(aVar);
                        gVar.f134547h = 0;
                        gVar.f134548j = 0;
                        gVar.f134549k = 0;
                        gVar.f134550l = 0;
                        gVar.f134551m = 0;
                        gVar.f134554q = 1;
                        Object objG = ju.i.g(l0VarB, hVar, gVar);
                        if (objG == objE) {
                            return objE;
                        }
                        obj = objG;
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
                return new dx.i.Right((byte[]) obj);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    @Override // p34.a
    public dx.i<dx.b, WruDocumentData> n(rq0.b documentType) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    dx.i<dx.b, byte[]> iVarU0 = U0(documentType, "licenseData");
                    if (!(iVarU0 instanceof dx.i.Left)) {
                        if (!(iVarU0 instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        try {
                            iVarU0 = new dx.i.Right<>(gj2.a.a((LocalDocumentDataWrapped) this.jsonSerializer.a((String) aVar.a(x0((byte[]) ((dx.i.Right) iVarU0).b())), q0.n(LocalDocumentDataWrapped.class))));
                        } catch (Exception unused) {
                            throw new Exception("Document " + documentType.getReferenceName() + " data not available");
                        }
                    }
                    return new dx.i.Right((WruDocumentData) aVar.a(iVarU0));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
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
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [nd4.k] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, rq0.b] */
    /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // p34.a
    public Object o(rq0.b bVar, String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        c cVar;
        Object objB;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f134497w;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f134497w = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f134495t;
        Object objE = uq.b.e();
        int i16 = cVar.f134497w;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        if (bVar != rq0.b.EnumC4479b.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP) {
                            aVar.b(new dx.b.Generic(new Exception("Removing by id for " + ((Object) bVar) + " is not supported")));
                            throw new oq.g();
                        }
                        dx.i<dx.b, i0> iVarB0 = B0((rq0.b.EnumC4479b) bVar, str);
                        if (!(iVarB0 instanceof dx.i.Left)) {
                            if (!(iVarB0 instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            i0 i0Var = (i0) ((dx.i.Right) iVarB0).b();
                            k34.i.DeletedSingleById deletedSingleById = new k34.i.DeletedSingleById(bVar, str);
                            cVar.f134481d = vq.j.a(bVar);
                            cVar.f134482e = vq.j.a(str);
                            cVar.f134483f = jVarA;
                            cVar.f134484g = vq.j.a(aVar);
                            cVar.f134485h = vq.j.a(aVar);
                            cVar.f134486j = vq.j.a(iVarB0);
                            cVar.f134487k = vq.j.a(i0Var);
                            cVar.f134488l = 0;
                            cVar.f134489m = 0;
                            cVar.f134490n = 0;
                            cVar.f134491p = 0;
                            cVar.f134492q = 0;
                            cVar.f134493r = 0;
                            cVar.f134494s = 0;
                            cVar.f134497w = 1;
                            if (K(deletedSingleById, cVar) == objE) {
                                return objE;
                            }
                        }
                        return new dx.i.Right(i0.f148189a);
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        bVar = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(bVar));
                        dx.i iVarA = bVar.a(e);
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
                try {
                    oq.u.b(obj);
                } catch (ex.c e18) {
                    e = e18;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e19) {
                    throw e19;
                }
                new dx.i.Right(i0.f148189a);
                return new dx.i.Right(i0.f148189a);
            } catch (Exception e25) {
                e = e25;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    @Override // p34.a
    public dx.i<dx.b, PensionerCardDocumentData> p() {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    dx.i<dx.b, byte[]> iVarU0 = U0(rq0.b.d.PENSIONER_CARD, "pensionerData");
                    if (!(iVarU0 instanceof dx.i.Left)) {
                        if (!(iVarU0 instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        try {
                            iVarU0 = new dx.i.Right(ci2.b.b((PensionerData) this.jsonSerializer.a((String) aVar.a(x0((byte[]) ((dx.i.Right) iVarU0).b())), q0.n(PensionerData.class))));
                        } catch (Exception unused) {
                            throw new Exception("Document " + rq0.b.d.PENSIONER_CARD.getReferenceName() + " data not available");
                        }
                    }
                    return new dx.i.Right((PensionerCardDocumentData) aVar.a(iVarU0));
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p34.a
    public Object q(final String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        y yVar;
        su.a aVar;
        if (eVar instanceof y) {
            yVar = (y) eVar;
            int i15 = yVar.f134739j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                yVar.f134739j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                yVar = new y(eVar);
            }
        } else {
            yVar = new y(eVar);
        }
        Object obj = yVar.f134737g;
        Object objE = uq.b.e();
        int i16 = yVar.f134739j;
        if (i16 == 0) {
            oq.u.b(obj);
            aVar = this.colisionDraftMutex;
            yVar.f134734d = str;
            yVar.f134735e = aVar;
            yVar.f134736f = 0;
            yVar.f134739j = 1;
            if (aVar.h(null, yVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            su.a aVar2 = (su.a) yVar.f134735e;
            String str2 = (String) yVar.f134734d;
            oq.u.b(obj);
            aVar = aVar2;
            str = str2;
        }
        try {
            return K1(this, false, aj2.a.VEHICLE_COLLISION_DATA, new er.q() { // from class: nd4.j
                @Override // er.q
                public final Object w(Object obj2, Object obj3, Object obj4) {
                    return k.E1(str, (ex.b) obj2, (bj2.c) obj3, (DocumentCertsSet) obj4);
                }
            }, 1, null);
        } finally {
            aVar.r(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [nd4.k] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    @Override // p34.a
    public Object r(List<BEDocumentStatus> list, rq0.b bVar, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        g0 g0Var;
        Object objB;
        if (eVar instanceof g0) {
            g0Var = (g0) eVar;
            int i15 = g0Var.f134568s;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                g0Var.f134568s = i15 - PKIFailureInfo.systemUnavail;
            } else {
                g0Var = new g0(eVar);
            }
        } else {
            g0Var = new g0(eVar);
        }
        Object obj = g0Var.f134566q;
        ?? E = uq.b.e();
        int i16 = g0Var.f134568s;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        cj2.a aVar2 = (cj2.a) aVar.a(N0(bVar));
                        for (BEDocumentStatus bEDocumentStatus : list) {
                            aVar2.p(bEDocumentStatus.getId(), vq.b.a(bEDocumentStatus.getStatus().g()));
                            G1();
                        }
                        List<BEDocumentStatus> list2 = list;
                        ArrayList arrayList = new ArrayList(pq.v.y(list2, 10));
                        for (BEDocumentStatus bEDocumentStatus2 : list2) {
                            arrayList.add(BEDocumentStatus.b(bEDocumentStatus2, null, aVar2.k() ? er0.h.INACTIVE : bEDocumentStatus2.getStatus(), false, 5, null));
                        }
                        k34.i.ContainerStatus containerStatus = new k34.i.ContainerStatus(bVar, arrayList);
                        g0Var.f134555d = vq.j.a(list);
                        g0Var.f134556e = vq.j.a(bVar);
                        g0Var.f134557f = jVarA;
                        g0Var.f134558g = vq.j.a(aVar);
                        g0Var.f134559h = vq.j.a(aVar);
                        g0Var.f134560j = vq.j.a(aVar2);
                        g0Var.f134561k = 0;
                        g0Var.f134562l = 0;
                        g0Var.f134563m = 0;
                        g0Var.f134564n = 0;
                        g0Var.f134565p = 0;
                        g0Var.f134568s = 1;
                        if (K(containerStatus, g0Var) == E) {
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
            } catch (Exception e25) {
                e = e25;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    @Override // p34.a
    public dx.i<dx.b, i0> s(List<DynamicDocument> documents, final rq0.b documentType, final k34.j saveMode) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    List<DynamicDocument> list = documents;
                    final LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(v0.e(pq.v.y(list, 10)), 16));
                    for (DynamicDocument dynamicDocument : list) {
                        oq.r rVarA = oq.y.a(dynamicDocument.getDocumentId(), gr0.c.a(dynamicDocument.getSignedAndEncryptedDocumentBase64()));
                        linkedHashMap.put(rVarA.c(), rVarA.d());
                    }
                    L1(this, false, documentType, new er.q() { // from class: nd4.h
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return k.N1(saveMode, documentType, linkedHashMap, this, (ex.b) obj, (bj2.c) obj2, (DocumentCertsSet) obj3);
                        }
                    }, 1, null);
                    return new dx.i.Right(i0.f148189a);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
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
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x017a A[Catch: Exception -> 0x0219, c -> 0x021d, CancellationException -> 0x0221, TryCatch #8 {c -> 0x021d, CancellationException -> 0x0221, Exception -> 0x0219, blocks: (B:36:0x0174, B:38:0x017a, B:40:0x0194), top: B:86:0x0174 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0194 A[Catch: Exception -> 0x0219, c -> 0x021d, CancellationException -> 0x0221, TRY_LEAVE, TryCatch #8 {c -> 0x021d, CancellationException -> 0x0221, Exception -> 0x0219, blocks: (B:36:0x0174, B:38:0x017a, B:40:0x0194), top: B:86:0x0174 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x01eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:61:0x0225  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Not initialized variable reg: 20, insn: 0x0083: MOVE (r2 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:15:0x0083 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01ec -> B:46:0x01fb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0225 -> B:48:0x0209). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p34.a
    public java.lang.Object t(tq.e<? super dx.i<? extends dx.b, ? extends java.util.Map<rq0.b, ? extends java.util.List<java.lang.String>>>> r68) {
        /*
            Method dump skipped, instruction units count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nd4.k.t(tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [nd4.k$s, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    @Override // p34.a
    public Object u(tq.e<? super dx.i<? extends dx.b, byte[]>> eVar) throws Throwable {
        ?? sVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof s) {
            s sVar2 = (s) eVar;
            int i15 = sVar2.f134691p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                sVar2.f134691p = i15 - PKIFailureInfo.systemUnavail;
                sVar = sVar2;
            } else {
                sVar = new s(eVar);
            }
        } else {
            sVar = new s(eVar);
        }
        Object obj = sVar.f134689m;
        Object objE = uq.b.e();
        int i16 = sVar.f134691p;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        l0 l0VarB = g1.b();
                        t tVar = new t(aVar, this, null);
                        sVar.f134686j = jVarA;
                        sVar.f134687k = vq.j.a(aVar);
                        sVar.f134688l = vq.j.a(aVar);
                        sVar.f134681d = 0;
                        sVar.f134682e = 0;
                        sVar.f134683f = 0;
                        sVar.f134684g = 0;
                        sVar.f134685h = 0;
                        sVar.f134691p = 1;
                        Object objG = ju.i.g(l0VarB, tVar, sVar);
                        if (objG == objE) {
                            return objE;
                        }
                        obj = objG;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        sVar = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(sVar));
                        dx.i iVarA = sVar.a(e);
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
                return new dx.i.Right((byte[]) obj);
            } catch (Exception e26) {
                e = e26;
            }
        } catch (CancellationException e27) {
            throw e27;
        }
    }

    @Override // p34.a
    public Object v(rq0.b.EnumC4479b enumC4479b, String str, tq.e<? super dx.i<? extends dx.b, DynamicDocumentDataContainer>> eVar) {
        Object objB;
        Object left;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        Throwable e15 = null;
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    byte[] bArr = (byte[]) aVar.a(U0(enumC4479b, str));
                    try {
                        ay.j jVar = this.jsonSerializer;
                        Charset charset = fu.d.UTF_8;
                        dx.i<dx.b, String> iVarX0 = x0((byte[]) aVar.a(iy.a.c(this.base64Coder, ((DocumentByIdContainerDto) jVar.a(new String(bArr, charset), q0.n(DocumentByIdContainerDto.class))).getScope(), null, 2, null)));
                        if (!(iVarX0 instanceof dx.i.Left)) {
                            if (!(iVarX0 instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            iVarX0 = new dx.i.Right(gr0.c.a(gr0.c.b(iy.c0.g((String) ((dx.i.Right) iVarX0).b()))));
                        }
                        iy.b0 data = ((gr0.c) aVar.a(iVarX0)).getData();
                        byte[] bArrW0 = W0(enumC4479b, str);
                        if (bArrW0 == null) {
                            aVar.b(new dx.b.Generic(new Exception("Document " + enumC4479b + " data not available")));
                            throw new oq.g();
                        }
                        try {
                            left = new dx.i.Right(new DynamicDocumentDataContainer(nr0.f.b((DynamicDocumentSchemaContainerDto) this.jsonWithNullCheck.a(new String((byte[]) aVar.a(iy.a.a(this.base64Coder, bArrW0, null, 2, null)), charset), q0.n(DynamicDocumentSchemaContainerDto.class))), data, null));
                            if (left instanceof dx.i.Left) {
                                dx.b bVar = (dx.b) ((dx.i.Left) left).b();
                                px.d dVar = this.remoteLogger;
                                String str2 = "Error reading " + enumC4479b.name() + " domainError: " + bVar;
                                if (bVar instanceof dx.b.Parsing) {
                                    e15 = ((dx.b.Parsing) bVar).getE();
                                } else {
                                    dx.b.Generic generic = bVar instanceof dx.b.Generic ? (dx.b.Generic) bVar : null;
                                    if (generic != null) {
                                        e15 = generic.getE();
                                    }
                                }
                                dVar.T6(str2, e15, px.c.a(this));
                            }
                            return left;
                        } catch (com.google.gson.p e16) {
                            aVar.b(new dx.b.Parsing(e16));
                            throw new oq.g();
                        }
                    } catch (com.google.gson.p e17) {
                        aVar.b(new dx.b.Parsing(e17));
                        throw new oq.g();
                    }
                } catch (CancellationException e18) {
                    throw e18;
                }
            } catch (ex.c e19) {
                left = new dx.i.Left((dx.b) ex.d.a(e19));
            } catch (CancellationException e25) {
                throw e25;
            }
        } catch (Exception e26) {
            px.f fVar = px.f.f163100a;
            String message = e26.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e26, px.c.a(jVarA));
            Object objA = jVarA.a(e26);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            left = new dx.i.Left(objB);
        }
    }

    @Override // p34.a
    public mu.g<k34.i> w() {
        return this.documentContainerChangedResult;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p34.a
    public Object x(String str, rq0.b bVar, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    bj2.c cVar = (bj2.c) aVar.a(b1(bVar));
                    bj2.b bVar2 = (bj2.b) aVar.a(Y0(bVar));
                    int iIntValue = ((Number) aVar.a(P0(bVar))).intValue();
                    for (Map.Entry entry : ((Map) aVar.a(y0(iy.a.c(this.base64Coder, str, null, 2, null), (DocumentCertsSet) aVar.a(vi2.a.INSTANCE.a(this.pkcs12Manager).h("mtWork", cVar, bVar2))))).entrySet()) {
                        String str2 = (String) entry.getKey();
                        CMSSignedData cMSSignedData = (CMSSignedData) entry.getValue();
                        int iHashCode = str2.hashCode();
                        switch (iHashCode) {
                            case -1928534237:
                                if (str2.equals("REFUGEE_SCOPE_3001")) {
                                    cVar.L(cMSSignedData.getEncoded());
                                }
                                break;
                            case -1928534236:
                                if (str2.equals("REFUGEE_SCOPE_3002")) {
                                    cVar.N(cMSSignedData.getEncoded());
                                }
                                break;
                            default:
                                switch (iHashCode) {
                                    case -887597840:
                                        if (str2.equals("PERSONAL_DATA_SCOPE_1")) {
                                            cVar.L(cMSSignedData.getEncoded());
                                        }
                                        break;
                                    case -887597839:
                                        if (str2.equals("PERSONAL_DATA_SCOPE_2")) {
                                            cVar.N(cMSSignedData.getEncoded());
                                        }
                                        break;
                                    case -887597838:
                                        if (str2.equals("PERSONAL_DATA_SCOPE_3")) {
                                            cVar.E(cMSSignedData.getEncoded());
                                        }
                                        break;
                                    case -887597837:
                                        if (str2.equals("PERSONAL_DATA_SCOPE_4")) {
                                            cVar.T(cMSSignedData.getEncoded());
                                        }
                                        break;
                                    case -887597836:
                                        if (str2.equals("PERSONAL_DATA_SCOPE_5")) {
                                            cVar.S(cMSSignedData.getEncoded());
                                        }
                                        break;
                                    case -887597835:
                                        if (str2.equals("PERSONAL_DATA_SCOPE_6")) {
                                            cVar.W(cMSSignedData.getEncoded());
                                        }
                                        break;
                                    case -887597834:
                                        if (str2.equals("PERSONAL_DATA_SCOPE_7")) {
                                            cVar.V(cMSSignedData.getEncoded());
                                        }
                                        break;
                                    case -887597833:
                                        if (str2.equals("PERSONAL_DATA_SCOPE_8")) {
                                            cVar.R(cMSSignedData.getEncoded());
                                        }
                                        break;
                                    case -887597832:
                                        if (str2.equals("PERSONAL_DATA_SCOPE_9")) {
                                            cVar.U(cMSSignedData.getEncoded());
                                        }
                                        break;
                                }
                                break;
                        }
                    }
                    cVar.c();
                    S1(iIntValue);
                    return new dx.i.Right(i0.f148189a);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
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
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    @Override // p34.a
    public Object y(tq.e<? super dx.i<? extends dx.b, NipipScope>> eVar) {
        return q1(rq0.b.d.NURSE_CARD);
    }

    @Override // p34.a
    public Object z(final String str, final boolean z15, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    L1(this, false, rq0.b.d.VEHICLE_CARD, new er.q() { // from class: nd4.f
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return k.R1(z15, this, str, (ex.b) obj, (bj2.c) obj2, (DocumentCertsSet) obj3);
                        }
                    }, 1, null);
                    return new dx.i.Right(i0.f148189a);
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
}
