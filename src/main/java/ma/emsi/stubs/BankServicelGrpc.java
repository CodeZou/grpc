package ma.emsi.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: bank.proto")
public final class BankServicelGrpc {

  private BankServicelGrpc() {}

  public static final String SERVICE_NAME = "BankServicel";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.emsi.stubs.Bank.ConvertCurrencyRequest,
      ma.emsi.stubs.Bank.ConvertCurrencyResponse> getConvertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convert",
      requestType = ma.emsi.stubs.Bank.ConvertCurrencyRequest.class,
      responseType = ma.emsi.stubs.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.emsi.stubs.Bank.ConvertCurrencyRequest,
      ma.emsi.stubs.Bank.ConvertCurrencyResponse> getConvertMethod() {
    io.grpc.MethodDescriptor<ma.emsi.stubs.Bank.ConvertCurrencyRequest, ma.emsi.stubs.Bank.ConvertCurrencyResponse> getConvertMethod;
    if ((getConvertMethod = BankServicelGrpc.getConvertMethod) == null) {
      synchronized (BankServicelGrpc.class) {
        if ((getConvertMethod = BankServicelGrpc.getConvertMethod) == null) {
          BankServicelGrpc.getConvertMethod = getConvertMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.stubs.Bank.ConvertCurrencyRequest, ma.emsi.stubs.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankServicel", "convert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.stubs.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.stubs.Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServicelMethodDescriptorSupplier("convert"))
                  .build();
          }
        }
     }
     return getConvertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.emsi.stubs.Bank.ConvertCurrencyRequest,
      ma.emsi.stubs.Bank.ConvertCurrencyResponse> getGetStreanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStrean",
      requestType = ma.emsi.stubs.Bank.ConvertCurrencyRequest.class,
      responseType = ma.emsi.stubs.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ma.emsi.stubs.Bank.ConvertCurrencyRequest,
      ma.emsi.stubs.Bank.ConvertCurrencyResponse> getGetStreanMethod() {
    io.grpc.MethodDescriptor<ma.emsi.stubs.Bank.ConvertCurrencyRequest, ma.emsi.stubs.Bank.ConvertCurrencyResponse> getGetStreanMethod;
    if ((getGetStreanMethod = BankServicelGrpc.getGetStreanMethod) == null) {
      synchronized (BankServicelGrpc.class) {
        if ((getGetStreanMethod = BankServicelGrpc.getGetStreanMethod) == null) {
          BankServicelGrpc.getGetStreanMethod = getGetStreanMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.stubs.Bank.ConvertCurrencyRequest, ma.emsi.stubs.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankServicel", "getStrean"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.stubs.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.stubs.Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServicelMethodDescriptorSupplier("getStrean"))
                  .build();
          }
        }
     }
     return getGetStreanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.emsi.stubs.Bank.ConvertCurrencyRequest,
      ma.emsi.stubs.Bank.ConvertCurrencyResponse> getPerforeStreanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "perforeStrean",
      requestType = ma.emsi.stubs.Bank.ConvertCurrencyRequest.class,
      responseType = ma.emsi.stubs.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ma.emsi.stubs.Bank.ConvertCurrencyRequest,
      ma.emsi.stubs.Bank.ConvertCurrencyResponse> getPerforeStreanMethod() {
    io.grpc.MethodDescriptor<ma.emsi.stubs.Bank.ConvertCurrencyRequest, ma.emsi.stubs.Bank.ConvertCurrencyResponse> getPerforeStreanMethod;
    if ((getPerforeStreanMethod = BankServicelGrpc.getPerforeStreanMethod) == null) {
      synchronized (BankServicelGrpc.class) {
        if ((getPerforeStreanMethod = BankServicelGrpc.getPerforeStreanMethod) == null) {
          BankServicelGrpc.getPerforeStreanMethod = getPerforeStreanMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.stubs.Bank.ConvertCurrencyRequest, ma.emsi.stubs.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankServicel", "perforeStrean"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.stubs.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.stubs.Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServicelMethodDescriptorSupplier("perforeStrean"))
                  .build();
          }
        }
     }
     return getPerforeStreanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.emsi.stubs.Bank.ConvertCurrencyRequest,
      ma.emsi.stubs.Bank.ConvertCurrencyResponse> getFullCurrencyStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fullCurrencyStream",
      requestType = ma.emsi.stubs.Bank.ConvertCurrencyRequest.class,
      responseType = ma.emsi.stubs.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ma.emsi.stubs.Bank.ConvertCurrencyRequest,
      ma.emsi.stubs.Bank.ConvertCurrencyResponse> getFullCurrencyStreamMethod() {
    io.grpc.MethodDescriptor<ma.emsi.stubs.Bank.ConvertCurrencyRequest, ma.emsi.stubs.Bank.ConvertCurrencyResponse> getFullCurrencyStreamMethod;
    if ((getFullCurrencyStreamMethod = BankServicelGrpc.getFullCurrencyStreamMethod) == null) {
      synchronized (BankServicelGrpc.class) {
        if ((getFullCurrencyStreamMethod = BankServicelGrpc.getFullCurrencyStreamMethod) == null) {
          BankServicelGrpc.getFullCurrencyStreamMethod = getFullCurrencyStreamMethod = 
              io.grpc.MethodDescriptor.<ma.emsi.stubs.Bank.ConvertCurrencyRequest, ma.emsi.stubs.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankServicel", "fullCurrencyStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.stubs.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.emsi.stubs.Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServicelMethodDescriptorSupplier("fullCurrencyStream"))
                  .build();
          }
        }
     }
     return getFullCurrencyStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServicelStub newStub(io.grpc.Channel channel) {
    return new BankServicelStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServicelBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BankServicelBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServicelFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BankServicelFutureStub(channel);
  }

  /**
   */
  public static abstract class BankServicelImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary nodel
     * </pre>
     */
    public void convert(ma.emsi.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertMethod(), responseObserver);
    }

    /**
     * <pre>
     * server streaming model
     * </pre>
     */
    public void getStrean(ma.emsi.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStreanMethod(), responseObserver);
    }

    /**
     * <pre>
     * client streaning model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ma.emsi.stubs.Bank.ConvertCurrencyRequest> perforeStrean(
        io.grpc.stub.StreamObserver<ma.emsi.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getPerforeStreanMethod(), responseObserver);
    }

    /**
     * <pre>
     * bidirectional streaming nodel
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ma.emsi.stubs.Bank.ConvertCurrencyRequest> fullCurrencyStream(
        io.grpc.stub.StreamObserver<ma.emsi.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getFullCurrencyStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConvertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.emsi.stubs.Bank.ConvertCurrencyRequest,
                ma.emsi.stubs.Bank.ConvertCurrencyResponse>(
                  this, METHODID_CONVERT)))
          .addMethod(
            getGetStreanMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ma.emsi.stubs.Bank.ConvertCurrencyRequest,
                ma.emsi.stubs.Bank.ConvertCurrencyResponse>(
                  this, METHODID_GET_STREAN)))
          .addMethod(
            getPerforeStreanMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                ma.emsi.stubs.Bank.ConvertCurrencyRequest,
                ma.emsi.stubs.Bank.ConvertCurrencyResponse>(
                  this, METHODID_PERFORE_STREAN)))
          .addMethod(
            getFullCurrencyStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ma.emsi.stubs.Bank.ConvertCurrencyRequest,
                ma.emsi.stubs.Bank.ConvertCurrencyResponse>(
                  this, METHODID_FULL_CURRENCY_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class BankServicelStub extends io.grpc.stub.AbstractStub<BankServicelStub> {
    private BankServicelStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServicelStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServicelStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServicelStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary nodel
     * </pre>
     */
    public void convert(ma.emsi.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * server streaming model
     * </pre>
     */
    public void getStrean(ma.emsi.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<ma.emsi.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetStreanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * client streaning model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ma.emsi.stubs.Bank.ConvertCurrencyRequest> perforeStrean(
        io.grpc.stub.StreamObserver<ma.emsi.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getPerforeStreanMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * bidirectional streaming nodel
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ma.emsi.stubs.Bank.ConvertCurrencyRequest> fullCurrencyStream(
        io.grpc.stub.StreamObserver<ma.emsi.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getFullCurrencyStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BankServicelBlockingStub extends io.grpc.stub.AbstractStub<BankServicelBlockingStub> {
    private BankServicelBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServicelBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServicelBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServicelBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary nodel
     * </pre>
     */
    public ma.emsi.stubs.Bank.ConvertCurrencyResponse convert(ma.emsi.stubs.Bank.ConvertCurrencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getConvertMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * server streaming model
     * </pre>
     */
    public java.util.Iterator<ma.emsi.stubs.Bank.ConvertCurrencyResponse> getStrean(
        ma.emsi.stubs.Bank.ConvertCurrencyRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetStreanMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BankServicelFutureStub extends io.grpc.stub.AbstractStub<BankServicelFutureStub> {
    private BankServicelFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServicelFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServicelFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServicelFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary nodel
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.emsi.stubs.Bank.ConvertCurrencyResponse> convert(
        ma.emsi.stubs.Bank.ConvertCurrencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONVERT = 0;
  private static final int METHODID_GET_STREAN = 1;
  private static final int METHODID_PERFORE_STREAN = 2;
  private static final int METHODID_FULL_CURRENCY_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BankServicelImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BankServicelImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONVERT:
          serviceImpl.convert((ma.emsi.stubs.Bank.ConvertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<ma.emsi.stubs.Bank.ConvertCurrencyResponse>) responseObserver);
          break;
        case METHODID_GET_STREAN:
          serviceImpl.getStrean((ma.emsi.stubs.Bank.ConvertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<ma.emsi.stubs.Bank.ConvertCurrencyResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PERFORE_STREAN:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.perforeStrean(
              (io.grpc.stub.StreamObserver<ma.emsi.stubs.Bank.ConvertCurrencyResponse>) responseObserver);
        case METHODID_FULL_CURRENCY_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.fullCurrencyStream(
              (io.grpc.stub.StreamObserver<ma.emsi.stubs.Bank.ConvertCurrencyResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BankServicelBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankServicelBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.emsi.stubs.Bank.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankServicel");
    }
  }

  private static final class BankServicelFileDescriptorSupplier
      extends BankServicelBaseDescriptorSupplier {
    BankServicelFileDescriptorSupplier() {}
  }

  private static final class BankServicelMethodDescriptorSupplier
      extends BankServicelBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BankServicelMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BankServicelGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankServicelFileDescriptorSupplier())
              .addMethod(getConvertMethod())
              .addMethod(getGetStreanMethod())
              .addMethod(getPerforeStreanMethod())
              .addMethod(getFullCurrencyStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
