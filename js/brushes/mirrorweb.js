function hmirrorweb( context )
{
	this.init( context );
}

hmirrorweb.prototype =
{
	name: "Horizontal Web Mirror",
	
	context: null,
	
	leftBrush: null,
	rightBrush: null,

	init: function( context )
	{
		this.context = context;
		this.leftBrush = new web(context);
		this.rightBrush = new web(context);
	},

	destroy: function()
	{
		this.leftBrush.destroy();
		this.leftBrush = null;
		this.rightBrush.destroy();
		this.rightBrush = null;
	},

	strokeStart: function( mouseX, mouseY )
	{
		this.leftBrush.strokeStart(mouseX, mouseY);
		this.rightBrush.strokeStart(this.context.canvas.width - mouseX, mouseY)
		
	},

	stroke: function( mouseX, mouseY )
	{
		this.leftBrush.stroke(mouseX, mouseY);
		this.rightBrush.stroke(this.context.canvas.width - mouseX, mouseY);
	},

	strokeEnd: function()
	{
		this.leftBrush.strokeEnd();
		this.rightBrush.strokeEnd();
	}
}

function vmirrorweb( context )
{
	this.init( context );
}

vmirrorweb.prototype =
{
	name: "Vertical Web Mirror",
	
	context: null,
	
	topBrush: null,
	bottomBrush: null,

	init: function( context )
	{
		this.context = context;
		this.topBrush = new web(context);
		this.bottomBrush = new web(context);
	},

	destroy: function()
	{
		this.topBrush.destroy();
		this.topBrush = null;
		this.bottomBrush.destroy();
		this.bottomBrush = null;
	},

	strokeStart: function( mouseX, mouseY )
	{
		this.topBrush.strokeStart(mouseX, mouseY);
		this.bottomBrush.strokeStart(mouseX, this.context.canvas.height - mouseY)
	},

	stroke: function( mouseX, mouseY )
	{
		this.topBrush.stroke(mouseX, mouseY);
		this.bottomBrush.stroke(mouseX, this.context.canvas.height - mouseY);
	},

	strokeEnd: function()
	{
		this.topBrush.strokeEnd();
		this.bottomBrush.strokeEnd();
	}
}

